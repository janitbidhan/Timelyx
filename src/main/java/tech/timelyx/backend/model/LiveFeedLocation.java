package tech.timelyx.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import tech.timelyx.backend.model.internal.LocationCoordinates;

@Document(collection = "livefeedlocations")
public class LiveFeedLocation {
    @Id
    private String id;
    private String name;
    private LocationCoordinates coordinates;
    private int frequency;

    public LiveFeedLocation() {
    }

    public LiveFeedLocation(String name, LocationCoordinates coordinates, int frequency) {
        this.name = name;
        this.coordinates = coordinates;
        this.frequency = frequency;
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

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "LiveFeedLocation{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", coordinates=" + coordinates +
                ", frequency=" + frequency +
                '}';
    }
}
