package com.epam.webinar.hnorbert90.finalproject.model;

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

    private long ratedBy;

    @ManyToOne
    private User user;

    @NotNull
    @Min(value = 0)
    @Max(value = 5)
    private double rating;

    private Rating() {
     
    }

    private Date rateDate;

    public long getRatedBy() {
        return ratedBy;
    }

    public void setRatedBy(long ratedBy) {
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
        return rateDate;
    }

    
    public Date getRateDate() {
        return rateDate;
    }

    
    public void setRateDate(Date rateDate) {
        this.rateDate = rateDate;
    }
}
