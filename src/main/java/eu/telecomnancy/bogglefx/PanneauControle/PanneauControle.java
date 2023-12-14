package eu.telecomnancy.boggleFX; 

import eu.telecomnancy.labfx.Boggle;

import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox; 
import boggle.model.*;

public class PanneauControle extends VBox implements Observateur {

    private Button valider;
    private Button effacer;
    private Button quitter;
    protected VueInfos vueinfos;
    protected Boggle boggle;

    public PanneauControle(Boggle boggle, VueInfos vueinfos) {
      super();
      this.valider = new Button("Valider");
      this.effacer = new Button("Effacer");
      this.quitter = new Button("Quitter");
      this.vueinfos = vueinfos;
      this.boggle = boggle;

      
      this.valider.setOnAction(
        new EcouteurValider(boggle)
      );

      this.effacer.setOnAction(e -> {
        new EcouteurEffacer(this.boggle);
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
