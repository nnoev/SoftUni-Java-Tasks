package java_db._04_hibernate_code_first.lab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "cars")
public class Car extends Vehicle {
    @Column(name = "seats")
    private int seats;

    public int getSeats() {
        return seats;
    }

    public void setseats(int hasSeats) {
        this.seats = hasSeats;
    }
}
