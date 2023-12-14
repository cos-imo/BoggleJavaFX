package eu.telecomnancy.boggleFX; 

import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox; 
import boggle.model.*;

public class PanneauControle extends VBox {

    private Button valider;
    private Button effacer;
    private Button quitter;

    public PanneauControle(Boggle boggle) {
      super();
      this.valider = new Button("Valider");
      this.effacer = new Button("Effacer");
      this.quitter = new Button("Quitter");

      this.valider.setOnAction(e -> {
          System.out.println("Validation");
          boggle.valider();
      });

      this.effacer.setOnAction(e -> {
          System.out.println("Effacer");
          boggle.effacer();
      });

      this.quitter.setOnAction(e -> {
          System.out.println("Bye");
          Platform.exit();
      });

      getChildren().addAll(valider, effacer, quitter);
    }
}
