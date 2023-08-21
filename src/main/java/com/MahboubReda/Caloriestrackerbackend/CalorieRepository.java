package com.MahboubReda.Caloriestrackerbackend;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalorieRepository extends MongoRepository<Calorie, ObjectId> {

}
