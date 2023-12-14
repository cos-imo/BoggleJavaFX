package boggle.model;
import boggle.model.Observable;
import eu.telecomnancy.boggleFX.*;
import java.util.ArrayList;

public class Observable{
  private ArrayList<Observateur> obs = new ArrayList<>(10);
  public void ajouterObservateur(Observateur o) {
      this.obs.add(o) ;
  }
  public void notifierObservateurs() {
      for (Observateur o : this.obs) o.reagir() ;

  }
}
