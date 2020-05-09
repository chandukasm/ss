package com.lynas.model;


import javax.persistence.*;

@Entity
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String lname;

//    @ManyToOne//laptop hugak eka app user knkta athy wenna puluwan
//    private AppUser lapuser;

    public Laptop() {
    }

//    public AppUser getLapuser() {
//        return lapuser;
//    }
//
//    public void setLapuser(AppUser lapuser) {
//        this.lapuser = lapuser;
//    }

//    public Laptop(int id, String lname, AppUser lapuser) {
//        this.id = id;
//        this.lname = lname;
//        this.lapuser = lapuser;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
