package java_db._04_hibernate_code_first.exercises._01_;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("codeFirst_ex");
        EntityManager em = emf.createEntityManager();

    }
}
