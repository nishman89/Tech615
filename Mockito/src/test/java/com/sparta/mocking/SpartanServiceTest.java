package com.sparta.mocking;

import com.sparta.mocking.model.Spartan;
import com.sparta.mocking.repository.Repository;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Any;

import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;

import static org.hamcrest.Matchers.*;

public class SpartanServiceTest {

    SpartanService sut;
    Repository mockRepository;

    @BeforeEach
    void setUp(){
        mockRepository = Mockito.mock(Repository.class);
        sut = new SpartanService(mockRepository);
    }

    @Test
    void testServiceInstantiated(){
        MatcherAssert.assertThat(sut, instanceOf(SpartanService.class));
    }

    @Test
    @DisplayName("Given a list of two Spartans, getNumSpartans, returns 2")
    void givenListOf2Spartans_getNumSpartans_Returns2(){
        List<Spartan> spartans = List.of(
                Mockito.mock(Spartan.class),
                Mockito.mock(Spartan.class),
                Mockito.mock(Spartan.class)
        );
        // stubs - have pre-defined behaviours
        Mockito.when(mockRepository.getAll())
                .thenReturn(spartans);
        MatcherAssert.assertThat(sut.getNumSpartans(), is(3));
    }

    @Test
    @DisplayName("Given there are not Spartans, getNumSpartans, returns 0")
    void giveThereAreNoSpartans_getNumSpartans_Returns0(){
        List<Spartan> spartans = List.of();
        Mockito.when(mockRepository.getAll())
                .thenReturn(spartans);
        MatcherAssert.assertThat(sut.getNumSpartans(), is(0));
    }

    @Test
    @DisplayName("Given a Spartan exists, findSpartan should return it")
    void giveSpartanExists_findSpartan_returnsSpartan(){
        Mockito.when(mockRepository.find(Mockito.anyInt()))
                .thenReturn(new Spartan("Nish", "Java", LocalDate.now()));
                //.thenReturn(ockito.mock(Spartan.class));
        // Does find Spartan do anything with the data it gets from the repisotiry
        // BUT I AM NOTE
        var result = sut.findSpartan(3);
        MatcherAssert.assertThat(result, instanceOf(Spartan.class));
        MatcherAssert.assertThat(result.getName(), is("Nish"));
    }

    @Test
    @DisplayName("Given a Spartan does NOT exists, findSpartan should throw a RuntimeException")
    void giveSpartanDoesNotExists_findSpartan_throwsRuntimeException(){
        Mockito.when(mockRepository.find(Mockito.anyInt()))
                .thenThrow(new NoSuchElementException());
        Assertions.assertThrows(RuntimeException.class, () -> sut.findSpartan(1));

    }

    // Spies

    @Test
    @DisplayName("Check find is called once")
    void checkFindIsCalledOnceOnRepository(){
        sut.findSpartan(1);
        Mockito.verify(mockRepository, Mockito.times(1)).find(Mockito.anyInt());
    }

    @Test
    @DisplayName("Test correct parameter passed")
    void testCorrectParameterPassed(){
        Spartan spartan = new Spartan("Nish", "Java", LocalDate.now());
        sut.addSpartan(spartan);
        Mockito.verify(mockRepository).add(spartan);
        Mockito.verifyNoInteractions(mockRepository);
    }
}
