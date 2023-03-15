package pl.oro.zad_1;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class OrderId implements Serializable {
    private Order order;
    private Part part;
}
