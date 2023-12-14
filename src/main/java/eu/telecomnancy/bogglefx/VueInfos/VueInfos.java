package eu.telecomnancy.boggleFX;

import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox; 
import javafx.scene.layout.GridPane;
import boggle.model.*;
import javafx.scene.text.Font;

public class VueInfos extends GridPane implements Observateur {

  public Label mot;
  private Boggle boggle;

  public VueInfos(Boggle boggle) {
    super();
    this.mot = new Label("Mot choisi: <Aucun>");
    this.mot.setFont(Font.font ("Verdana", 40));
    
    this.boggle = boggle;
    this.boggle.ajouterObservateur(this);

    this.getChildren().addAll(mot);
  }

  @Override
  public void reagir(){
    this.mot.setText("Valide");
  }
}
