package java_db._04_hibernate_code_first.exercises._02_.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "store_locations")
public class StoreLocation extends BaseEntity{
    @Column(name = "location_names", nullable = false)
    private String name;
    @OneToMany(mappedBy = "storeLocationId")
    private Set<Sale> sales;
}
