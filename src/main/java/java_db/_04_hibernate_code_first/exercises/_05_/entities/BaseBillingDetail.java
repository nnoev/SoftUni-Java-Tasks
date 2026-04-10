package java_db._04_hibernate_code_first.exercises._05_.entities;

import jakarta.persistence.*;
import java_db._04_hibernate_code_first.exercises._02_.entities.BaseEntity;

@Entity
@Table(name = "billing_details")
@DiscriminatorColumn(name = "bill_type")
public abstract class BaseBillingDetail extends BaseEntity {

    private String number;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

}
