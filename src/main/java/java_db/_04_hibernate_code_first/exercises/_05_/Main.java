package java_db._04_hibernate_code_first.exercises._05_;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("codeFirst_ex05");
        EntityManager em = emf.createEntityManager();

    }

}
