/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstpackage;

/**
 *
 * @author Balkhi
 */
public class Employe extends Personne{
    private String statut;
    private double salaire,commission;
    //Constructeurs

    public Employe(String statut, String nom, String prenom, String tel, double salaire, double commission) {
        super(nom, prenom, tel);
        this.statut = statut;
        this.salaire = salaire;
        this.commission = commission;
    }

    public Employe(String statut, String nom, String prenom, String tel, String email, double salaire, double commission) {
        super(nom, prenom, tel, email);
        this.statut = statut;
        this.salaire = salaire;
        this.commission = commission;
    }
    //Getters and setters

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
    
    public double salaire_annuel(double salaire){
        return salaire * 12;
    }
    
    public double commission_annuelle(double salaire,float taux){
        return (salaire * taux ) * 12;
    }
}
