package com.mycompany.dvdstore.api;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.modelform.MovieForm;
import com.mycompany.dvdstore.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/movie")
public class MovieResource {

    @Autowired
    private MovieServiceInterface movieServiceInterface;

    public MovieServiceInterface getMovieServiceInterface() {
        return movieServiceInterface;
    }

    public void setMovieServiceInterface(MovieServiceInterface movieServiceInterface) {
        this.movieServiceInterface = movieServiceInterface;
    }

    @GetMapping
    public Iterable<Movie> list(){
        Iterable<Movie> movies = new ArrayList<>();
        movies = movieServiceInterface.getMovieList();
        return movies;
    }

    @GetMapping("/{id}")
    public Movie get(@PathVariable("id") String id) {
        final Movie movie = movieServiceInterface.getMovieById(Long.parseLong(id));
        return movie;
    }

    @PostMapping
    public Movie add(@RequestBody Movie movie){
        movieServiceInterface.registerMovie(movie);
        return movie;
    }
}
