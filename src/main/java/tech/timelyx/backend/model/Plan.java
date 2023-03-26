package tech.timelyx.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "plans")
public class Plan {
    @Id
    private String id;
    private String planId;

    public Plan() {}

    public Plan(String planId) {
        this.planId = planId;
    }

    // getters and setters

    @Override
    public String toString() {
        return "Plan{" +
                "id='" + id + '\'' +
                ", planId='" + planId + '\'' +
                '}';
    }
}