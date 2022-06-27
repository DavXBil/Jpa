package fr.diginamic.TP1;

import javax.persistence.*;

@Entity
@Table(name="auteur")
public class Auteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="Nom", length = 50, nullable = false, unique = false)
    private String nom;
    @Column(name="Prenom", length = 50, nullable = false, unique = false)
    private String prenom;


    public Auteur() {

    }

    public Integer getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Auteur{");
        sb.append("id=").append(id);
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
