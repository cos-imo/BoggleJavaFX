package eu.telecomnancy.boggleFX;

import boggle.model.Boggle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
public class EcouteurQuitter implements EventHandler<ActionEvent> {

    private Boggle boggle;
    public EcouteurQuitter(Boggle boggle){
        this.boggle = boggle;
    }

    @Override
    public void handle(ActionEvent event) {
        System.out.println("Au revoir !");
        Platform.exit();
    }
}
