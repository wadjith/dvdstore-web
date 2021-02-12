package com.mycompany.dvdstore.modelform;

import javax.validation.constraints.*;

public class MovieForm {

    @NotBlank
    @Size(max = 20)
    private String title;
    @NotBlank
    private String genre;
    @Size(max = 255)
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
