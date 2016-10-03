package com.money.application;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.money.crud.Crud;
import com.money.entity.SimpleEntity;

@Component
public class Save {

	@Inject
	private Crud crud;

	@RequestMapping("/save")
	public SimpleEntity save() {
		return crud.save(new SimpleEntity("Id"));
	}

}
