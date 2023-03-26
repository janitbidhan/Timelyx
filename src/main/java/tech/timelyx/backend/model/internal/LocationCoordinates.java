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

    public List<Double> getGps() {
        return gps;
    }

    public void setGps(List<Double> gps) {
        this.gps = gps;
    }

    public String getMapLink() {
        return mapLink;
    }

    public void setMapLink(String mapLink) {
        this.mapLink = mapLink;
    }

    @Override
    public String toString() {
        return "LocationCoordinates{" +
                "gps=" + gps +
                ", mapLink='" + mapLink + '\'' +
                '}';
    }
}
