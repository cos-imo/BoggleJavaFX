package eu.telecomnancy.boggleFX;

import javafx.application.Platform;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;

public class MenuJeu extends MenuBar {
    private final Menu menu1; 
    private final Menu menu2;
    private final Menu menu3;

    public MenuJeu() {
      super();

      menu1 = new Menu("Boggle");
      menu2 = new Menu("Nouvelle Partie");
      menu3 = new Menu("Sauvegarder");

      getMenus().addAll(menu1, menu2, menu3);
    }
}
