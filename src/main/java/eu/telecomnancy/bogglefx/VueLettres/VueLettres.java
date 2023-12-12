package eu.telecomnancy.boggleFX;

import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox; 
import javafx.scene.layout.GridPane;

public class VueLettres extends GridPane {

    private Button[] btns = new Button[30];

    public VueLettres() {
      super();

      for (int i=0; i<btns.length; i++){
        btns[i] = new Button("Button i-"+i);
      }

      int i = 0;
      int size = 4;
        for(Button b : btns) {
          //Event Listener
            GridPane.setRowIndex(b, i%size);
            GridPane.setColumnIndex(b, i/4);
            i++;
        }
      this.getChildren().addAll(btns);
    }
}
