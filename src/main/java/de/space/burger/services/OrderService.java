package de.space.burger.services;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final DishService dishService;
    @Autowired
    public OrderService(OrderRepository orderRepository,
                        DishService dishService) {
        this.orderRepository = orderRepository;
        this.dishService = dishService;
    }
    public List<Order> getUserOrders(String userId) {
        return orderRepository.findByUserId(userId);
    }
    public Order createOrder(String userId, List<Long> dishIds) {
        // Получите блюда по их идентификаторам
        List<Dish> selectedDishes = dishIds.stream()
                .map(dishService::getDishById)
                .collect(Collectors.toList());

        // Вычислите общую сумму заказа
        double totalAmount = selectedDishes.stream()
                .mapToDouble(Dish::getPrice)
                .sum();

        // Создайте новый заказ
        Order order = new Order();
        order.setUserId(userId);
        order.setItems(selectedDishes);
        order.setTotalAmount(totalAmount);
        order.setStatus(OrderStatus.NEW); // Установите  начальный статус


        // Сохраните заказ в базе данных
        return orderRepository.save(order);
    }

    // Другие методы для обработки заказов
}