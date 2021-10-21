package com.example;

import java.util.ArrayList;

public class orienteringstavling {
    public void run(){
        ArrayList<Participant>deltagare = new ArrayList<>();

        //skapa tävling
        Competition orientering = new Competition("Höstrusket", "2019-11-22", "Västerås", deltagare);

        //ett sätt att fylla på listan med metoden som tar argument och SKAPAR elementet (i competition)
        orientering.AddParticipant("Kalle Svensson", "Linkoping IK" );
        orientering.AddParticipant("Anna Nilsson", "Linkoping IK" );
        orientering.AddParticipant("Per-Erik Jonsson", "Norrköping OK" );
        orientering.AddParticipant("Bo Ek", "Norrköping OK" );
        orientering.AddParticipant("Mia Strand", "Motala IK" );
        orientering.AddParticipant("Sebastian Gustavsson", "Motala IK" );
        orientering.AddParticipant("Oscar Lundkvist", "Boxhilm OK" );
        

        //skriv ut 
        System.out.println(orientering.getName() + ", " + orientering.getDate() + ", " + orientering.getLocation());
        System.out.println("-----------------------------------------");
        for (Participant participant : deltagare) {
            System.out.println(participant.formattedParticipant());
        }
    }
}
/**Höstrusket, 2019-11-22, Västerås
--------------------------------------------
Kalle Svensson Linkoping IK 
Anna Nilsson Linkoping IK 
Per-Erik Jonsson Norrkoping OK 
Bo Ek Norrkoping OK 
Mia Strand Motala IK 
Sebastian Gustavsson Motala IK 
Oscar Lundkvist Boxholm OK  */