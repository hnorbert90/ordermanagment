package com.epam.webinar.hnorbert90.finalproject.model;

import java.util.Calendar;
import java.util.Currency;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class HourlyRate {

    @GeneratedValue
    @Id
    private long id;
    
    @ManyToOne
    @NotNull
    private User user;
    
    @NotNull
    private Currency currency;
    
    @NotNull
    private double value;
    private final Date SET_DATE = Calendar.getInstance().getTime();

    private HourlyRate() {
    }

    
    public long getId() {
        return id;
    }

    
    public void setId(long id) {
        this.id = id;
    }

    
    public User getUser() {
        return user;
    }

    
    public void setUser(User user) {
        this.user = user;
    }

    
    public Currency getCurrency() {
        return currency;
    }

    
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    
    public double getValue() {
        return value;
    }

    
    public void setValue(double value) {
        this.value = value;
    }

    
    public Date getSET_DATE() {
        return SET_DATE;
    }

}
