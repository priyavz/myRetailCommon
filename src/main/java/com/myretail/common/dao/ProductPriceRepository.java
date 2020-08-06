package com.myretail.common.dao;

import com.myretail.common.model.ProductPriceEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductPriceRepository extends MongoRepository<ProductPriceEntity, String> {

    Optional<ProductPriceEntity> findById(int id);

    Optional<ProductPriceEntity> save(int id);
}
