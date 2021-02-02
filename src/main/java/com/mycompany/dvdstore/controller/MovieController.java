package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class MovieController {

    @Autowired
    private MovieServiceInterface movieServiceInterface;

    public MovieServiceInterface getMovieServiceInterface() {
        return movieServiceInterface;
    }

    public void setMovieServiceInterface(MovieServiceInterface movieServiceInterface) {
        this.movieServiceInterface = movieServiceInterface;
    }

    public void addUsingConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Entrer le titre du film");
        String titre = sc.nextLine();
        System.out.println(" Entrer le genre du film");
        String genre = sc.nextLine();
        Movie movie = new Movie();
        movie.setTitle(titre);
        movie.setGenre(genre);
        movieServiceInterface.registerMovie(movie);
    }
}
