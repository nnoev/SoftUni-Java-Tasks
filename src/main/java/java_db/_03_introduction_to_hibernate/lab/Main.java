package java_db._03_introduction_to_hibernate.lab;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java_db._03_introduction_to_hibernate.lab.entities.Student;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory my_JPA = Persistence.createEntityManagerFactory("myJPA");
        EntityManager em= my_JPA.createEntityManager();

        em.getTransaction().begin();
        Student student = new Student();
        student.setName("Nikolay");
        em.persist(student);
        em.getTransaction().commit();
        em.close();
    }
}
