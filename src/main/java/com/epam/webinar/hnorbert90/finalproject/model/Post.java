package com.epam.webinar.hnorbert90.finalproject.model;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Post {
    @GeneratedValue
    @Id
    private long id;
    
    @ManyToOne
    @NotNull
    private User user;
    @Column(length = 1024)
    @NotNull
    private String content;
    private final Date POSTED = Calendar.getInstance().getTime();
    
    private Post() {
       
    }

    public void setPostedBy(User postedBy) {
        this.user = postedBy;
    }
    
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    public Date getPOSTED() {
        return POSTED;
    }
    
    public User getPostedBy() {
        return user;
    }
    
}
