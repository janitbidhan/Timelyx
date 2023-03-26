package tech.timelyx.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tech.timelyx.backend.model.Plan;

@Repository
public interface PlanRepository extends MongoRepository<Plan, String> {
}
