package java_db._04_hibernate_code_first.lab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "planes")
public class Plane extends Vehicle {
@Column(name = "passenger_capacity")
    private Integer passengerCapacity;

    public Integer getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(Integer passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
}
