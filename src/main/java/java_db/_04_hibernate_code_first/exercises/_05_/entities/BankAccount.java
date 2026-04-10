package java_db._04_hibernate_code_first.exercises._05_.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


@Entity
@DiscriminatorValue("ba")
public class BankAccount extends BaseBillingDetail {
@Column(name = "name")
    private String name;
    @Column(name = "swift_code")
    private String SWIFT;


}
