package com.sparta.nam.oop.memory_model;

public class Program
{
    public static void main(String[] args)
    {
        int dmitrijs = 4;
        String faith = "Faith";
        int[] eghosa = { 6, 7, 2 };
        for (var farid = 0; farid < eghosa.length; farid++)
        {
            System.out.println(eghosa[farid]);
        }

        double karolina = 3.14159;
        var mikyle = dmitrijs;
        dmitrijs++;
        String[] paul = { "cat", "dog" };
        {
            var penelope = eghosa;
            penelope[2] = 42;
            String[] ramla = { "perch", "cod", "eel" };
            paul = ramla;
            paul[1] = "bass";
            var rukieya = mikyle;
            faith = ramla[0];
        }
        karolina = eghosa[2];
    }
}