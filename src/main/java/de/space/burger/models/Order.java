package de.space.burger.models;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId; // Идентификатор пользователя,сделавшего заказ

    private List<Dish> items; // Список блюд в заказе
    private double totalAmount;
    private OrderStatus status; // Перечисление (Новый, Вобработке, Доставляется, Завершен)

    private LocalDateTime orderTime;
    // Геттеры и сеттеры
}
