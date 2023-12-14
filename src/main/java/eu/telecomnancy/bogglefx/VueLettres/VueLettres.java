package eu.telecomnancy.boggleFX;

import eu.telecomnancy.labfx.Boggle;

import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox; 
import javafx.scene.layout.GridPane;
import boggle.model.*;

public class VueLettres extends GridPane implements Observateur {

    private Button[] btns;
    Boggle boggle;
    VueInfos infos;

    public VueLettres(Boggle boggle, VueInfos affichage) {
      super();

      this.boggle = boggle;
      this.boggle.ajouterObservateur(this);

      this.infos = affichage;

      int size = boggle.size();
      btns = new Button[size*size];

      for (int i=0; i<btns.length; i++){
        btns[i] = new Button(String.valueOf(boggle.getLettre(i%size, i/size)));
        btns[i].setPrefWidth(125);
        btns[i].setPrefHeight(125);

        final int index = i;

        btns[i].setStyle("-fx-background-color: #4CB9E7; -fx-font-size: 40; -fx-border-color: #000000;");

        btns[i].setOnMouseEntered(event -> {
            btns[index].setStyle("-fx-background-color: #3559E0; -fx-font-size: 40; -fx-border-color: #000000");
        });
        btns[i].setOnMouseExited(event -> {
            btns[index].setStyle("-fx-background-color: #4CB9E7; -fx-font-size: 40; -fx-border-color:#000000");
        });

      }

      int i = 0;
        for(Button b : btns) {
            final int lin = i%size;
            final int col = i/size;
            b.setStyle("-fx-font-size:40; -fx-border-color:#000000; -fx-background-color: #4CB9E7;");
            b.setOnAction(e -> {
              new EcouteurLettre(boggle, lin, col);
              //boggle.ajouterLettre(lin, col);
              System.out.println("Bouton cliqué");
            });
            GridPane.setRowIndex(b, lin);
            GridPane.setColumnIndex(b, col);
            i++;
        }
      this.getChildren().addAll(btns);
    }

    @Override
    public void reagir() {
        int size = boggle.size();
        for (int i = 0; i < boggle.size()*boggle.size(); i++) {
          btns[i].setText(boggle.getLettre(i%size, i/size) + "");
        }
    }

    //@Override
    //public void reagir(){
      //this.infos.mot.setText(this.boggle.getMotChoisi());
    //}
}
