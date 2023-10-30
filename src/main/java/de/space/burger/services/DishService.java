package de.space.burger.services;

@Service
public class DishService {
    private final DishRepository dishRepository;
    @Autowired
    public DishService(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }
    public List<Dish> getAllDishes() {
        return dishRepository.findAll();
    }
    public Dish getDishById(Long id) {
        return dishRepository.findById(id).orElse(null);
    }
    // Другие методы
}
