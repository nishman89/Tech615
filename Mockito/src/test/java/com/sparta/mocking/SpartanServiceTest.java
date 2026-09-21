package com.sparta.mocking;

import com.sparta.mocking.model.Spartan;
import com.sparta.mocking.repository.Repository;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

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
    void givenListOfTwoSpartans_getNumSpartans_Returns2(){
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
    void giveThereAreNoSpartans_getNumSpartans_Returns_0(){
        // 5 mins
    }
}
