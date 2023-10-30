package de.space.burger.controllers;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderService orderService;
    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @GetMapping("/{userId}")
    public List<Order> getUserOrders(@PathVariable String userId) {
        return orderService.getUserOrders(userId);
    }
    @PostMapping("/create")
    public Order createOrder(@RequestBody CreateOrderRequest request)
    {
        return orderService.createOrder(request.getUserId(),
                request.getDishIds());
    }

    // Другие методы для обработки заказов
}
