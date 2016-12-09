package com.example.inc.a1ndiano;

/**
 * Created by InC on 06/12/2016.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataProvider {

    public static HashMap<String, List<String>> getInfo()
    {
        HashMap<String, List<String>> MoviesDetails = new HashMap<String, List<String>>();

        List<String> Filmes_Ação = new ArrayList<String>();
        Filmes_Ação.add("Cidade de Deus");
        Filmes_Ação.add("300 Rise of an Empire");
        Filmes_Ação.add("Robocop");
        Filmes_Ação.add("The Hunger Games");
        Filmes_Ação.add("The Expendables 3");
        Filmes_Ação.add("Guardian of the Galaxy");

        List<String> Filmes_Romance = new ArrayList<String>();
        Filmes_Romance.add("Mean Girls");
        Filmes_Romance.add("Failure To Launch");
        Filmes_Romance.add("The House Bunny");
        Filmes_Romance.add("Ghost of Girlfriends Past");
        Filmes_Romance.add("The Devil Wears Prada");
        Filmes_Romance.add("My First Love");

        List<String> Filmes_Terror= new ArrayList<String>();
        Filmes_Terror.add("Zé do Caixão");
        Filmes_Terror.add("The Conjuring");
        Filmes_Terror.add("Drag Me to Hell");
        Filmes_Terror.add("Sinister");
        Filmes_Terror.add("Sleepy Hollow");
        Filmes_Terror.add("Eden lake");

        List<String> Filmes_Comédia = new ArrayList<String>();
        Filmes_Comédia.add("Ride Along");
        Filmes_Comédia.add("That Awkward Moment");
        Filmes_Comédia.add("Wish I Was Here");
        Filmes_Comédia.add("About last Night");
        Filmes_Comédia.add("This is the End");

        MoviesDetails.put("Action Movies", Filmes_Ação);
        MoviesDetails.put("Romantic Movies", Filmes_Romance);
        MoviesDetails.put("Horror Movies", Filmes_Terror);
        MoviesDetails.put("Comedy Movies", Filmes_Comédia);

        return MoviesDetails;

    }

}

