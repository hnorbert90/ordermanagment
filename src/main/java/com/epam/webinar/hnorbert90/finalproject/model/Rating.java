package com.epam.webinar.hnorbert90.finalproject.model;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Rating {

    @GeneratedValue
    @Id
    private long id;

    @NotNull
    private User ratedBy;

    @ManyToOne
    @NotNull
    private User user;

    @NotNull
    @Min(value = 0)
    @Max(value = 5)
    private double rating;

    private Rating() {
     
    }

    private final Date RATE_DATE = Calendar.getInstance().getTime();

    public User getRatedBy() {
        return ratedBy;
    }

    public void setRatedBy(User ratedBy) {
        this.ratedBy = ratedBy;
    }

    public User getRatedUser() {
        return user;
    }

    public void setRatedUser(User ratedUser) {
        this.user = ratedUser;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Date getRATE_DATE() {
        return RATE_DATE;
    }
}
