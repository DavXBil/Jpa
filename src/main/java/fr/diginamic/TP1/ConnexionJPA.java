package fr.diginamic.TP1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ConnexionJPA {

    public static void main(String[] args) {



        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-jpa");

        EntityManager em = emf.createEntityManager();

        System.out.println(em);

        Auteur a = new Auteur();

        em.getTransaction().begin();

        /*a.setNom("Test");
        a.setPrenom("Tst");
        em.persist(a);*/


        Auteur auteur = em.find(Auteur.class, 4);

        TypedQuery<Auteur> query = em.createQuery("select a from Auteur a", Auteur.class);

        List<Auteur> auteurs = query.getResultList();

        System.out.println(auteur);

        for (Auteur unAuteur: auteurs) {
            System.out.println(unAuteur.toString());
        }

        em.getTransaction().commit();

    }

}
