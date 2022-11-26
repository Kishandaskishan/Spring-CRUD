package com.example.crudpractice.user;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long > {

}
