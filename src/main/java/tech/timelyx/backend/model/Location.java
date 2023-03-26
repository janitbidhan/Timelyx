package tech.timelyx.backend.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Document(collection = "locations")
public class Location {
    @Id
    private String id;
    private String name;
    private LocationCoordinates coordinates;
    private FrequencyData frequencyData;

    public Location() {}

    public Location(String name, LocationCoordinates coordinates, FrequencyData frequencyData) {
        this.name = name;
        this.coordinates = coordinates;
        this.frequencyData = frequencyData;
    }

    // getters and setters

    @Override
    public String toString() {
        return "Location{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", coordinates=" + coordinates +
                ", frequencyData=" + frequencyData +
                '}';
    }
}

