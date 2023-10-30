package de.space.burger.repositories;

@Repository
public interface DishRepository extends JpaRepository<Dish, Long>
{
    // Можно определить кастомные методы для запросов
}
