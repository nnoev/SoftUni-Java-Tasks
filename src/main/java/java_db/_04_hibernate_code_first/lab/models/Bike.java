package java_db._04_hibernate_code_first.lab.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name = "bikes")
public class Bike extends Vehicle{

}
