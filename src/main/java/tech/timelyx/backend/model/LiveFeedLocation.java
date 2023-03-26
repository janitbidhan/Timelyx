package tech.timelyx.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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
