package pl.oro.zad_1;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "order_parts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class OrderPart {
    @Id
    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @Id
    @ManyToOne
    @JoinColumn(name = "part_id", nullable = false)
    private Part part;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "price", nullable = false)
    private BigDecimal price;
}
