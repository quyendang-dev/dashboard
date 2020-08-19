package biz.aceras.dashboard.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Product {

    public Product() {
    }

    public Product(long id, String name, String code, String description, String type, BigDecimal price, String status) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.description = description;
        this.type = type;
        this.price = price;
        this.status = status;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String code;

    private String description;

    private String type;

    private BigDecimal price;

    private String status;
}
