package com.test.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.pojo.InnerEntity;
import com.test.pojo.MainEntity;
import com.test.repo.InnerEntityRepository;
import com.test.repo.MainEntityRepository;

/**
 * @author Zafar Iqbal
 * @since Apr 23, 2018
 */

@Service
public class TestingService {

	@Autowired
	private MainEntityRepository mainRepo;

	@Autowired
	private InnerEntityRepository innerRepo;
	
	public void addUser(){
		MainEntity main = new MainEntity();
		InnerEntity inner = new InnerEntity();
		
		inner.setName("InnerTest");
		innerRepo.save(inner);
		
		main.setInnerEntity(inner);
		mainRepo.save(main);
	}
	
	public String getUser(){
		List<MainEntity> entities = mainRepo.findAll();
		if(!entities.isEmpty()){
			InnerEntity inner = entities.get(0).getInnerEntity(); //It returns inner object with populated 'id' fields
			String innerId = inner.getId();	// 'id' is null here.
			System.out.println(innerId);
		}
		return entities.stream().map(main -> main.getInnerEntity().getId()).collect(Collectors.joining(", "));
	}
}
