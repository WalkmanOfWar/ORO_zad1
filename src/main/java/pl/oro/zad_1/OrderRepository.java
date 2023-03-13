package pl.oro.zad_1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderRepository extends JpaRepository<Order, Long> {

    //1. Liczba transakcji
    @Query("SELECT COUNT(o) FROM Order o")
    Long countAllOrders();


    //3. Liczba transakcji dla danego użytkownika
    @Query("SELECT COUNT(o) FROM Order o WHERE o.user.id = :userId")
        Long countOrdersForUser(@Param("userId") Long userId);


}
