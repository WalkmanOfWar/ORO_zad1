package pl.oro.zad_1;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Order {
    @Id
    @SequenceGenerator(name = "orders_id_seq", sequenceName = "orders_id_seq")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "orders_id_seq")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "order_date", nullable = false)
    private LocalDateTime orderDate;

    // getters and setters
}
