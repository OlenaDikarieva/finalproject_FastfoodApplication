package de.space.burger.controllers;

@RestController
@RequestMapping("/api/dishes")
public class DishController {
    private final DishService dishService;
    @Autowired
    public DishController(DishService dishService) {
        this.dishService = dishService;
    }
    @GetMapping
    public List<Dish> getAllDishes() {
        return dishService.getAllDishes();
    }
    @GetMapping("/{id}")
    public Dish getDishById(@PathVariable Long id) {
        return dishService.getDishById(id);
    }
    // Другие методы для обработки запросов
}

