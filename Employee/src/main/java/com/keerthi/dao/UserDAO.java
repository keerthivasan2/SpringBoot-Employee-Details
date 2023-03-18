package com.keerthi.dao;

import org.springframework.data.repository.CrudRepository;

import com.keerthi.model.User;

public interface UserDAO extends CrudRepository<User,Integer>{

}
