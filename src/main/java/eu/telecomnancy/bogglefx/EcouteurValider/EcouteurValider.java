package eu.telecomnancy.boggleFX;

import eu.telecomnancy.labfx.Boggle;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;

public class EcouteurValider implements EventHandler<ActionEvent> {

    private Boggle boggle;
    public EcouteurValider(Boggle boggle){
        this.boggle = boggle;
    }

    public void handle(ActionEvent event) {
        this.boggle.valider();
    }
}
