package pl.oro.zad_1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface OrderPartRepository extends JpaRepository<OrderPart, Long> {

    //2. Liczba transakcji konkretnego produktu
    @Query("SELECT COUNT(op) FROM OrderPart op WHERE op.part.id = :partId")
    Long countOrdersForPart(@Param("partId") Long partId);
    //5. Lista produktów o cenie pomiędzy min a max
    @Query("SELECT op.part FROM OrderPart op WHERE op.price BETWEEN :min AND :max")
    List<Part> findByPriceBetween(BigDecimal min, BigDecimal max);

}
