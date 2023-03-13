package pl.oro.zad_1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface PartRepository extends JpaRepository<Part, Long> {
    List<Part> findByPriceBetween(BigDecimal min, BigDecimal max);
}
