package az.edu.ada.wm2.lab6.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Product {
    @Id
    private UUID id;
    private String productName;
    private BigDecimal price;
    private LocalDate expirationDate;
    @ManyToMany
    @JoinTable(
            name = "product_category",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name="category_id")
    )
    private Set<Category> categories = new HashSet<>();

    public Product(String productName, BigDecimal price, LocalDate expirationDate) {
        this.id = UUID.randomUUID();
        this.productName = productName;
        this.price = price;
        this.expirationDate = expirationDate;
    }


}
