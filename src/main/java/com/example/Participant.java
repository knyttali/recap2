package com.example;

public class Participant {
    private String Name;
    private String Club;

    public Participant(String Name, String Club) {
        super();
        this.Name = Name;
        this.Club = Club;
    }

    public String getName() {
        return this.Name;
    }

    public String getClub() {
        return this.Club;
    }
//gör en utskrivningsbar representation av denna instans av 
    public String formattedParticipant(){
        return this.Name + " " + this.Club;
    }
}
