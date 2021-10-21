package com.example;

import java.util.ArrayList;

public class Competition {
    private String Name;
    private String Date;
    private String Location;
    private ArrayList<Participant> deltagare;

    public Competition(String Name, String Date, String Location, ArrayList<Participant> deltagare) {
        super();
        this.Name = Name;
        this.Date = Date;
        this.Location = Location;
        this.deltagare = deltagare;
    }

    public String getName() {
        return Name;
    }
    public String getDate() {
        return Date;
    }
    public String getLocation() {
        return Location;
    }
    public ArrayList<Participant> getDeltagare() {
        return deltagare;
    }

    public void AddParticipant(Participant participant) {
        this.deltagare.add(participant);
    }
    public void AddParticipant(String participantName, String club) {
        var participant = new Participant(participantName, club);
        AddParticipant(participant);
        
    }
}
