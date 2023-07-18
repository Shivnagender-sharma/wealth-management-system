package com.immersion.wealth.repositories;

import com.immersion.wealth.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {

}
