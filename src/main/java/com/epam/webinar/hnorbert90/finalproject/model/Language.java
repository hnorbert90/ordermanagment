package com.epam.webinar.hnorbert90.finalproject.model;

import javax.validation.constraints.NotNull;

public class Language {

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
