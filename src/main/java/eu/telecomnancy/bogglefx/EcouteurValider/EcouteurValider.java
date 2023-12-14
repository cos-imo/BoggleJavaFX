package eu.telecomnancy.boggleFX;

import boggle.model.Boggle;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;

public class EcouteurValider implements EventHandler<ActionEvent> {

    private Boggle boggle;
    public EcouteurValider(Boggle boggle){
        this.boggle = boggle;
    }

    @Override
    public void handle(ActionEvent event) {
        System.out.println("Valider");
        boggle.valider();
    }
}
