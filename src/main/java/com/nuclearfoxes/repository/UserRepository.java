package com.nuclearfoxes.repository;

import com.nuclearfoxes.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;



public interface UserRepository extends Repository<User,Integer> {
    @Query(nativeQuery = true,value = "SELECT * FROM users")
    List<User> getAllUsers();

}
