package tech.timelyx.backend.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import tech.timelyx.backend.model.internal.FrequencyData;
import tech.timelyx.backend.model.internal.LocationCoordinates;

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

