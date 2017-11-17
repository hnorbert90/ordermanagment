package com.epam.webinar.hnorbert90.finalproject.model;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
public class Order {
    
    @GeneratedValue
    @Id
    private long id;
    
    @ManyToOne
    @NotNull
    private User user;
    
    
    public long getId() {
        return id;
    }


    @NotNull
    private User orderer;
    
    @NotNull
    @Column(length = 100)
    private String subject;
    @NotNull
    @Column(length = 1024)
    private String description;
    private boolean accepted=false;
    @Temporal(TemporalType.DATE)
    private Date deadline;
    @Temporal(TemporalType.DATE)
    private Date startDate;
    private final Date CREATED = Calendar.getInstance().getTime();
    
    private Order() {
    }

    public User getOrderFrom() {
        return user;
    }
    
    public void setOrderFrom(User orderFrom) {
        this.user = orderFrom;
    }
    
    public User getOrderer() {
        return orderer;
    }
    
    public void setOrderer(User orderer) {
        this.orderer = orderer;
    }
    
    public String getSubject() {
        return subject;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public boolean isAccepted() {
        return accepted;
    }
    
    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }
    
    public Date getDeadline() {
        return deadline;
    }
    
    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
    
    public Date getStartDate() {
        return startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    public Date getCREATED() {
        return CREATED;
    } 
}
