package eu.telecomnancy.boggleFX;

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
      }

      int i = 0;
        for(Button b : btns) {
          //Event Listener
            final int lin = i%size;
            final int col = i/size;
            b.setStyle("-fx-font-size:40");
            b.setOnAction(e -> {
              boggle.ajouterLettre(lin, col);
              //b.setStyle("-fx-background-color: #ff0000; ");
            });
            GridPane.setRowIndex(b, i%size);
            GridPane.setColumnIndex(b, i/4);
            i++;
        }
      this.getChildren().addAll(btns);
    }


    @Override
    public void reagir(){
      this.infos.mot.setText(this.boggle.getMotChoisi());
    }
}
