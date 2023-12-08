package eu.telecomnancy.boggleFX;

import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.application.Platform;

public class PanneauControle extends Vbox{

    private Button valider;
    private Button effacer;
    private Button quitter;

    public PanneauControle(){
      super();
      this.valider = new Button("Valider");
      this.effacer = new Button("Effacer");
      this.quitter = new Button("quitter");
    }

        valider.setOnAction(e -> {
            System.out.println("Validation");
            Platform.exit();
        });

        effacer.setOnAction(e -> {
          System.out.println("Efacer");
        });

        quitter.setOnAction(e -> {
            System.out.println("Bye");
            Platform.exit();
        });
    }
}
