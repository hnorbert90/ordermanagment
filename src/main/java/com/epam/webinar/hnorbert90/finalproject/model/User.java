package com.epam.webinar.hnorbert90.finalproject.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "User")
public class User implements Serializable {

    private static final long serialVersionUID = 5163137760495987318L;
    @Id
    @GeneratedValue
    private long id;
//    private Name name;
    private String email;
//    private Location location;
    @Column(length = 1024)
    private String debut;
    @Column(length = 30)
    private String phonenumber;
    @Column(length = 512)
    private String photoPath;
    @Temporal(TemporalType.DATE)
    @Column(name = "memberSince")
    private final Date MEMBER_SINCE = Calendar.getInstance().getTime();
    private boolean verified = false;
    private double reputation;
    @Column(length = 100)
    private String profession;
    @Column(length = 100)
    private String title;

    @ManyToMany(mappedBy = "user")
    private List<Skill> skills;

    @ManyToMany
    private List<User> favoriteUsers;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;

    @OneToMany(mappedBy = "user")
    private List<OrderModel> orders;

    @OneToMany(mappedBy = "user")
    private List<HourlyRate> hourlyRate;

    @OneToMany(mappedBy = "user")
    private List<Rating> ratings;

    //private List<Language> language;

    private User() {

    }

    


    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    


    
    public String getDebut() {
        return debut;
    }

    
    public void setDebut(String debut) {
        this.debut = debut;
    }

    
    public String getPhonenumber() {
        return phonenumber;
    }

    
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    
    public String getPhotoPath() {
        return photoPath;
    }

    
    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    
    public boolean isVerified() {
        return verified;
    }

    
    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    
    public double getReputation() {
        return reputation;
    }

    
    public void setReputation(double reputation) {
        this.reputation = reputation;
    }

    
    public String getProfession() {
        return profession;
    }

    
    public void setProfession(String profession) {
        this.profession = profession;
    }

    
    public String getTitle() {
        return title;
    }

    
    public void setTitle(String title) {
        this.title = title;
    }

    
    public Date getMEMBER_SINCE() {
        return MEMBER_SINCE;
    }


}
