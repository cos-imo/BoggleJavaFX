package eu.telecomnancy.boggleFX;

import boggle.model.Boggle;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;

public class EcouteurEffacer implements EventHandler<ActionEvent> {

    private Boggle boggle;
    public EcouteurEffacer(Boggle boggle){
        this.boggle = boggle;
    }
    @Override
    public void handle(ActionEvent event) {
        boggle.effacer();
    }
}
