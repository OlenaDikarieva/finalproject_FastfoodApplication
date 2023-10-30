package de.space.burger.repositories;

import de.space.burger.models.User;

public interface UsersRepository extends CrudRepository<User> {

    User findOneByEmail(String email); // добавили метод, который специфичен именно для User-ов
}
