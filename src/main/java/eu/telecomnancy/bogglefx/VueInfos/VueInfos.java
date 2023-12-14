package eu.telecomnancy.boggleFX;

import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox; 
import javafx.scene.layout.GridPane;
import boggle.model.*;
import javafx.scene.text.Font;

public class VueInfos extends GridPane {

  public Label mot;

  public VueInfos() {
    super();
    Label mot = new Label("Test");
    mot.setFont(Font.font ("Verdana", 40));

    this.getChildren().addAll(mot);
  }
}
