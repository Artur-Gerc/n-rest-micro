package ru.micro.usermicro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.micro.entity.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
