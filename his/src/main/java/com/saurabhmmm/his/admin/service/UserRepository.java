package com.saurabhmmm.his.admin.service;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saurabhmmm.his.admin.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Serializable> {

}
