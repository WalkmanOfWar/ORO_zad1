package pl.oro.zad_1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderPartRepository extends JpaRepository<OrderPart, Long> {

    //3. Liczba transakcji konkretnego produktu
    @Query("SELECT COUNT(op) FROM OrderPart op WHERE op.part.id = :partId")
    Long countOrdersForPart(@Param("partId") Long partId);
}
