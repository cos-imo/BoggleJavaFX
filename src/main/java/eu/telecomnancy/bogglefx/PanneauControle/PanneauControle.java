package eu.telecomnancy.boggleFX; 

import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox; 
import boggle.model.*;

public class PanneauControle extends VBox implements Observateur {

    private Button valider;
    private Button effacer;
    private Button quitter;

    public PanneauControle(Boggle boggle) {
      super();
      this.valider = new Button("Valider");
      this.effacer = new Button("Effacer");
      this.quitter = new Button("Quitter");

      this.valider.setOnAction(e -> {
        new EcouteurValider(boggle);
      });

      this.effacer.setOnAction(e -> {
        new EcouteurEffacer(boggle);
      });

      this.quitter.setOnAction(e -> {
        Platform.exit();
      });

      getChildren().addAll(valider, effacer, quitter);
    }

    @Override
    public void reagir(){

    }
}
