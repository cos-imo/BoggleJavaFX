package eu.telecomnancy.boggleFX;

import eu.telecomnancy.labfx.Boggle;

import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.application.Platform;
import eu.telecomnancy.boggleFX.PanneauControle.*;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("BoggleFX");
        
        Boggle boggle = new Boggle(4);

        VueInfos infos = new VueInfos(boggle);

        BorderPane root = new BorderPane();

        root.setRight(new PanneauControle(boggle, infos));
        root.setTop(new MenuJeu());
        root.setCenter(new VueLettres(boggle, infos));
        root.setBottom(infos);

        Scene scene = new Scene(root, 1000, 700);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
