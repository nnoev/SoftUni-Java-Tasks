package java_db._04_hibernate_code_first.lab;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java_db._04_hibernate_code_first.lab.models.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("codeFirst");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        Bike bike = new Bike();
        bike.setModel("BMX");
        entityManager.persist(bike);
        Car car = new Car();
        car.setModel("Mercedes-Benz");
        car.setseats(5);
        car.setFuel_type("Diesel");
        entityManager.persist(car);
        Plane plane = new Plane();
        plane.setPassengerCapacity(1000);
        plane.setModel("Boeing 747");
        plane.setFuel_type("Gasoline");
        entityManager.persist(plane);
        Truck truck =new Truck();
        truck.setModel("Volvo 140");
        truck.setLoadCapacity(2.5);
        entityManager.persist(truck);

        entityManager.getTransaction().commit();
        List<Vehicle> vehicles =
                entityManager.createQuery("FROM Vehicle", Vehicle.class).getResultList();
        System.out.println();
    }
}
