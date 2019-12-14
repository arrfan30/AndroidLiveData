package com.journaldev.androidlivedata;

public class PersonPOJO {

    public String name;
    public String occupation;

    public PersonPOJO(String name,String occupation)
    {
        this.name = name;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
