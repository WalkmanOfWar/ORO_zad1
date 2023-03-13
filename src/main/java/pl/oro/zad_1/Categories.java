package pl.oro.zad_1;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "categories")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Categories {
    @Id
    @SequenceGenerator(name = "categories_id_seq", sequenceName = "categories_id_seq")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "categories_id_seq")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;
}
