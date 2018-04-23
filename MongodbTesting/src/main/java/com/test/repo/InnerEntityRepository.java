package com.test.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.test.pojo.InnerEntity;

/**
 * @author Zafar Iqbal
 * @since Apr 23, 2018
 */
public interface InnerEntityRepository extends MongoRepository<InnerEntity, String>{

}
