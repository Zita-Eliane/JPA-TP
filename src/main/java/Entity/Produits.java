package Entity;

import javax.persistence.*;

@Entity
public class Produits {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String nomPdt;
    private double prix;

    public Produits() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomPdt() {
        return nomPdt;
    }

    public void setNomPdt(String nomPdt) {
        this.nomPdt = nomPdt;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
