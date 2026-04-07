package java_db._02_orm_fundamentals.exercises.entities;

import java_db._02_orm_fundamentals.exercises.orm.anotations.Column;
import java_db._02_orm_fundamentals.exercises.orm.anotations.Entity;
import java_db._02_orm_fundamentals.exercises.orm.anotations.Id;

import java.time.LocalDate;

@Entity(name = "orders")
public class Order {
    @Id
    @Column(name = "order_id")
    private int id;
    @Column(name = "amount")
    private double amount;
    @Column(name = "created_at")
    private LocalDate createdAt;

    public Order() {

    }

    public Order(double amount, LocalDate createdAt) {
        this.amount = amount;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }
}
