package com.money.crud;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import com.money.entity.SimpleEntity;

public interface Crud extends CrudRepository<SimpleEntity, Long>, JpaSpecificationExecutor<SimpleEntity> {

}
