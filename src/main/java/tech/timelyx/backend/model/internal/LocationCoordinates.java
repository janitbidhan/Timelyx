package tech.timelyx.backend.model.internal;

import java.util.List;

public class LocationCoordinates {
    private List<Double> gps;
    private String mapLink;

    public LocationCoordinates() {
    }

    public LocationCoordinates(List<Double> gps, String mapLink) {
        this.gps = gps;
        this.mapLink = mapLink;
    }

    // getters and setters

    @Override
    public String toString() {
        return "LocationCoordinates{" +
                "gps=" + gps +
                ", mapLink='" + mapLink + '\'' +
                '}';
    }
}
