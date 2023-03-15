package pl.oro.zad_1;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "car_models")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class CarModels {
    @Id
    @SequenceGenerator(name = " car_models_id_seq", sequenceName = " car_models_id_seq",  allocationSize = 1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = " car_models_id_seq")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;
}
