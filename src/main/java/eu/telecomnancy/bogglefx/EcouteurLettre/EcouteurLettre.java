package eu.telecomnancy.boggleFX;

import eu.telecomnancy.labfx.Boggle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EcouteurLettre implements EventHandler<ActionEvent> {

    private Boggle boggle;
    private int ligne;
    private int colonne;

    public EcouteurLettre(Boggle boggle, int ligne, int colonne){
        this.boggle = boggle;
        this.ligne = ligne;
        this.colonne = colonne;
    }

    public void handle(ActionEvent event) {
        boggle.ajouterLettre(ligne, colonne);
    }
}
