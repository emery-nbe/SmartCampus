package com.kuetu.smartcampus;

import com.kuetu.smartcampus.entity.Promotion;
import com.kuetu.smartcampus.entity.Student;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Promotion promotion = new Promotion();
        promotion.setSection("Scientifique");
        promotion.setOption("Biochimie");
        promotion.setNiveau("4ème");
        promotion.setGroupe("Humanité");
        promotion.setLocal("local 10");

        entityManager.getTransaction().begin();
        entityManager.persist(promotion);
        System.out.println("Enregistré avec succès");
        entityManager.close();
        entityManagerFactory.close();
    }
}