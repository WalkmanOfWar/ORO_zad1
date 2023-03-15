package pl.oro.zad_1;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "parts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Part {
    @Id
    @SequenceGenerator(name = "parts_id_seq", sequenceName = "parts_id_seq",  allocationSize = 1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "parts_id_seq")
    private Long id;

    @Column(name = "name",nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Categories category_id;
}
