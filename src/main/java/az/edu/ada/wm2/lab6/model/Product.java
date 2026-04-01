package az.edu.ada.wm2.lab6.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
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

    public Product(String productName, BigDecimal price, LocalDate expirationDate) {
        this.id = UUID.randomUUID();
        this.productName = productName;
        this.price = price;
        this.expirationDate = expirationDate;
    }
}
