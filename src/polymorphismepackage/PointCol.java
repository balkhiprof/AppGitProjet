/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphismepackage;

/**
 *
 * @author Balkhi
 */
public class PointCol extends Point{
    //variable d'instance
    private float couleur;
    //Constructeurs

    public PointCol(float couleur) {
        super(0,0);
        this.couleur = couleur;
    }

    public PointCol(int x, int y, float couleur) {
        super(x, y);
        this.couleur = couleur;
    }
    //Getters and setters

    public float getCouleur() {
        return couleur;
    }

    public void setCouleur(float couleur) {
        this.couleur = couleur;
    }
    public String afficher(){
        super.afficher();
        return "Couleur :"+this.couleur;
    }   
    
}
