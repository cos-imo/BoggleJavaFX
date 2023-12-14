package eu.telecomnancy.boggleFX;

import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox; 
import javafx.scene.layout.GridPane;
import boggle.model.*;
import javafx.scene.text.Font;

public class VueInfos extends GridPane implements Observateur {

  public Label mot, scoreLabel;
  private Boggle boggle;

  public VueInfos(Boggle boggle) {
    super();

    this.mot = new Label("Mot choisi: <Aucun>");
    this.mot.setFont(Font.font ("Verdana", 40));
    
    this.scoreLabel = new Label("Score : " + boggle.getScore());
    this.scoreLabel.setFont(Font.font("Verdana", 40));

    HBox hbox = new HBox(this.mot, this.scoreLabel);

    this.getChildren().addAll(hbox);

    this.boggle = boggle;
    this.boggle.ajouterObservateur(this);
  }

  @Override
  public void reagir(){
    this.scoreLabel.setText("Score : " + this.boggle.getScore());
    this.mot.setText("Mot choisi: " + this.boggle.getMotChoisi());
    //this.mot.setText("OK");
  }
}
