package eu.telecomnancy.boggleFX;

import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox; 
import javafx.scene.layout.GridPane;

public class VueLettres extends GridPane {

    private Button bouton00;
    private Button bouton01;
    private Button bouton02;
    private Button bouton03;
    private Button bouton10;
    private Button bouton11;
    private Button bouton12;
    private Button bouton13;
    private Button bouton20;
    private Button bouton21;
    private Button bouton22;
    private Button bouton23;
    private Button bouton30;
    private Button bouton31;
    private Button bouton32;
    private Button bouton33;

    public VueLettres() {
      super();

      this.bouton00 = new Button("a");
      this.bouton01 = new Button("b");
      this.bouton02 = new Button("c");
      this.bouton03 = new Button("d");
      this.bouton10 = new Button("e");
      this.bouton11 = new Button("f");
      this.bouton12 = new Button("g");
      this.bouton13 = new Button("h");
      this.bouton20 = new Button("i");
      this.bouton21 = new Button("j");
      this.bouton22 = new Button("k");
      this.bouton23 = new Button("l");
      this.bouton30 = new Button("m");
      this.bouton31 = new Button("n");
      this.bouton32 = new Button("o");
      this.bouton33 = new Button("p");


      GridPane.setRowIndex(bouton00, 0);
      GridPane.setColumnIndex(bouton00, 0);
      GridPane.setRowIndex(bouton01, 0);
      GridPane.setColumnIndex(bouton01, 1);
      GridPane.setRowIndex(bouton02, 0);
      GridPane.setColumnIndex(bouton02, 2);
      GridPane.setRowIndex(bouton03, 0);
      GridPane.setColumnIndex(bouton03, 3);

      GridPane.setRowIndex(bouton10, 1);
      GridPane.setColumnIndex(bouton10, 0);
      GridPane.setRowIndex(bouton11, 1);
      GridPane.setColumnIndex(bouton11, 1);
      GridPane.setRowIndex(bouton12, 1);
      GridPane.setColumnIndex(bouton12, 2);
      GridPane.setRowIndex(bouton13, 1);
      GridPane.setColumnIndex(bouton13, 3);

      GridPane.setRowIndex(bouton20, 2);
      GridPane.setColumnIndex(bouton20, 0);
      GridPane.setRowIndex(bouton21, 2);
      GridPane.setColumnIndex(bouton21, 1);
      GridPane.setRowIndex(bouton22, 2);
      GridPane.setColumnIndex(bouton22, 2);
      GridPane.setRowIndex(bouton23, 2);
      GridPane.setColumnIndex(bouton23, 3);

      GridPane.setRowIndex(bouton30, 3);
      GridPane.setColumnIndex(bouton30, 0);
      GridPane.setRowIndex(bouton31, 3);
      GridPane.setColumnIndex(bouton31, 1);
      GridPane.setRowIndex(bouton32, 3);
      GridPane.setColumnIndex(bouton32, 2);
      GridPane.setRowIndex(bouton33, 3);
      GridPane.setColumnIndex(bouton33, 3);


      this.getChildren().addAll(
          bouton00, bouton01, bouton02, bouton03,
          bouton10, bouton11, bouton12, bouton13,
          bouton20, bouton21, bouton22, bouton23,
          bouton30, bouton31, bouton32, bouton33
      );
    }

}
