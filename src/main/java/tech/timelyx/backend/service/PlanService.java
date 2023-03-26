package tech.timelyx.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.timelyx.backend.model.Plan;
import tech.timelyx.backend.repository.PlanRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PlanService {
    @Autowired
    private PlanRepository planRepository;

    public Plan createPlan(Plan plan) {
        return planRepository.save(plan);
    }

    public Optional<Plan> getPlanById(String id) {
        return planRepository.findById(id);
    }

    public List<Plan> getAllPlans() {
        return planRepository.findAll();
    }

    public Plan updatePlan(Plan plan) {
        return planRepository.save(plan);
    }

    public void deletePlanById(String id) {
        planRepository.deleteById(id);
    }
}
