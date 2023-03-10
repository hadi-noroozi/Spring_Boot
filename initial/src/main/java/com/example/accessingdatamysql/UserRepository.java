package com.example.accessingdatamysql;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

    @Query(value = "SELECT COUNT(*) FROM user", nativeQuery = true)
    public int findCountUsingNative();
}