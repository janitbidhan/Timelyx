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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocationCoordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(LocationCoordinates coordinates) {
        this.coordinates = coordinates;
    }

    public FrequencyData getFrequencyData() {
        return frequencyData;
    }

    public void setFrequencyData(FrequencyData frequencyData) {
        this.frequencyData = frequencyData;
    }

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

