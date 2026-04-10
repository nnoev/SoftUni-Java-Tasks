package java_db._04_hibernate_code_first.exercises._05_.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java_db._04_hibernate_code_first.exercises._02_.entities.BaseEntity;

import java.util.Set;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    //TODO billing details
    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column
    private String email;

    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "owner")
    private Set<BaseBillingDetail> billingDetails;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<BaseBillingDetail> getBillingDetails() {
        return billingDetails;
    }

    public void setBillingDetails(Set<BaseBillingDetail> billingDetails) {
        this.billingDetails = billingDetails;
    }

}
