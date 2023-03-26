package tech.timelyx.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.timelyx.backend.model.Location;
import tech.timelyx.backend.repository.LocationRepository;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {
    @Autowired
    private LocationRepository locationRepository;

    public Location createLocation(Location location) {
        return locationRepository.save(location);
    }

    public Optional<Location> getLocationById(String id) {
        return locationRepository.findById(id);
    }

    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }

    public Location updateLocation(Location location) {
        return locationRepository.save(location);
    }

    public void deleteLocationById(String id) {
        locationRepository.deleteById(id);
    }
}
