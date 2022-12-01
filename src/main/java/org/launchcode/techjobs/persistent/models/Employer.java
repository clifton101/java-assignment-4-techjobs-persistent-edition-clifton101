package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;

@Entity
public class Employer extends AbstractEntity {

    public String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employer () {

    }
    public Employer(String Location) {
        this.location = location;
    }

}
