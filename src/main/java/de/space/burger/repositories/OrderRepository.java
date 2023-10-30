package de.space.burger.repositories;

@Repository
public interface OrderRepository extends JpaRepository<Order,
        Long> {
    List<Order> findByUserId(String userId);
    // Можно определить кастомные методы для запросов
}
