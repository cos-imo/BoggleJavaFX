package boggle.model;

import boggle.model.Observable;
import eu.telecomnancy.boggleFX.Dictionnaire;

import java.util.ArrayList;
import java.util.Random;

import eu.telecomnancy.boggleFX.*;

public class Boggle extends Observable {

    private static char[] voyelles = {'A', 'E', 'I', 'O', 'U', 'Y'};
    private static char[] consonnes = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Z'};
    private char[][] lettres;
    private StringBuilder mot;
    private int score = 0;
    private int ligneChoisie, colonneChoisie ;  // dernière case choisie

    /**
     * Des voyelles sur les lignes impaires ; des consonnes sur les lignes paires
     * @param taille
     * @exception AssertionError taille <= 1
     */
    public Boggle(int taille) {
        assert (taille > 1) : "Trop petit";
        this.lettres = new char[taille][taille];
        Random gen = new Random();
        for (int lig = 0; lig < taille; lig++)
            if (lig%2==0)
                for (int col = 0; col < taille; col++)
                    lettres[lig][col] = voyelles[gen.nextInt(6)];
            else
                for (int col = 0; col < taille; col++)
                    lettres[lig][col] = consonnes[gen.nextInt(20)];

        this.mot = new StringBuilder("");
        this.ligneChoisie = -1 ;
        this.colonneChoisie = -1 ;
    }

    /**
     * @return taille du jeu (carré)
     */
    public int size() {
        return this.lettres.length;
    }

    /**
     * @return score de la partie en cours
     */
    public int getScore() {
        return this.score;
    }

    /**
     * @param l
     * @param c
     * @return lettre de la case spécifiée
     * @exception AssertionError l < 0 || l >= size()
     * @exception AssertionError c < 0 || c >= size()
     */
    public char getLettre(int l, int c) {
        assert (l >= 0 && l < this.size()) : "Ligne incorrecte";
        assert (c >= 0 && c < this.size()) : "colonne incorrecte";
        return this.lettres[l][c] ;
    }

    /**
     * @return mot en cours de construction
     */
    public String getMotChoisi() {
        return this.mot.toString();
    }

    /**
     * @param l1
     * @param c1
     * @param l2
     * @param c2
     * @return vrai si les cases sont contigües
     * @exception AssertionError l1 < 0 || l1 >= size()
     * @exception AssertionError c1 < 0 || c1 >= size()
     * @exception AssertionError l2 < 0 || l2 >= size()
     * @exception AssertionError c2 < 0 || c2 >= size()
     */
    private boolean casesContigues(int l1, int c1, int l2, int c2) {
        assert (l1 >= 0 && l1 < this.size()) : "Ligne incorrecte";
        assert (c1 >= 0 && c1 < this.size()) : "colonne incorrecte";
        assert (l2 >= 0 && l2 < this.size()) : "Ligne incorrecte";
        assert (c2 >= 0 && c2 < this.size()) : "colonne incorrecte";
        int diffL = Math.abs(l1 - l2) ;
        int diffC = Math.abs(c1 - c2) ;
        return ! ((diffL == 0) && (diffC == 0))  && diffL <=1 && diffC <=1 ;
    }

    /**
     * Valider le mot en cours de construction
     * s'il est dans le dictionnaire, le score est incrémenté du nombre de lettres
     * sinon, le score est décrémenté de 1
     */
    public void valider() {
        Dictionnaire dico = Dictionnaire.getInstance() ;
        if (dico.contient(mot.toString()))
            this.score += this.mot.length() ;
        else
            this.score -= 1 ;
        this.mot = new StringBuilder("");
        this.ligneChoisie = -1 ;
        this.colonneChoisie = -1 ;
        this.notifierObservateurs() ;
    }

    /**
     * Effacer le mot en cours de construction
     */
    public void effacer() {
        this.mot = new StringBuilder("");
        this.ligneChoisie = -1 ;
        this.colonneChoisie = -1 ;
        this.notifierObservateurs();
    }


    /**
     * La lettre en case lig, col a été choisie
     * On conserve la lettre si la case est contigüe à la précédente
     * @param lig
     * @param col
     */
    public void ajouterLettre(int lig, int col) {
        if (this.ligneChoisie==-1 || casesContigues(this.ligneChoisie, this.colonneChoisie, lig, col)) {
            this.mot.append(this.getLettre(lig, col));
            this.ligneChoisie = lig;
            this.colonneChoisie = col;
            this.notifierObservateurs();
        }
    }

}
