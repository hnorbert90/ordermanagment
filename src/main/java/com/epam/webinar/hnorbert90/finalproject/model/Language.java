package com.epam.webinar.hnorbert90.finalproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Language {
    @GeneratedValue
    @Id
    private long id;
    
    @ManyToOne
    private User user;
    
    private String language;
    private LanguageLevel level;

    public Language(@NotNull String language, @NotNull LanguageLevel level) {
        super();
        this.language = language;
        this.level = level;
    }

    public String getLanguage() {
        return language;
    }

    @NotNull
    public void setLanguage(String language) {
        this.language = language;
    }

    public LanguageLevel getLevel() {
        return level;
    }

    @NotNull
    public void setLevel(LanguageLevel level) {
        this.level = level;
    }

}
