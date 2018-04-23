package com.test.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.test.pojo.MainEntity;

/**
 * @author Zafar Iqbal
 * @since Apr 23, 2018
 */
public interface MainEntityRepository extends MongoRepository<MainEntity, String>{

}
