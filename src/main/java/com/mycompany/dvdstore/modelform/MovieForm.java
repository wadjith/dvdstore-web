package com.mycompany.dvdstore.modelform;

import javax.validation.constraints.*;

public class MovieForm {

    @NotBlank(message = "Veuillez entrer un titre")
    @Size(max = 20, message = "Entrez un titre de 20 caractères au plus")
    private String title;
    @NotBlank(message = "Veuillez choisir un genre")
    private String genre;
    @Size(max = 255, message = "Entrez une description de 255 caractères au plus")
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
