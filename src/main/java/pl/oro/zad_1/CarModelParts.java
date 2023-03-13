package pl.oro.zad_1;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "car_model_parts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class CarModelParts {
    @Id
    @ManyToOne
    @JoinColumn(name = "car_model_id", nullable = false)
    private CarModels carModel;

    @Id
    @ManyToOne
    @JoinColumn(name = "part_id", nullable = false)
    private Part part;
}
