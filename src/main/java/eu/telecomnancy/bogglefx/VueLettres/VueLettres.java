package eu.telecomnancy.boggleFX;

import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox; 
import javafx.scene.layout.GridPane;
import boggle.model.*;

public class VueLettres extends GridPane {

    private Button[] btns;

    public VueLettres(Boggle boggle) {
      super();
      int size = boggle.size();
      btns = new Button[size*size];

      for (int i=0; i<btns.length; i++){
        btns[i] = new Button(String.valueOf(boggle.getLettre(i%size, i/size)));
      }

      int i = 0;
        for(Button b : btns) {
          //Event Listener
            GridPane.setRowIndex(b, i%size);
            GridPane.setColumnIndex(b, i/4);
            i++;
        }
      this.getChildren().addAll(btns);
    }
}
