package tech.timelyx.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.timelyx.backend.model.LiveFeedLocation;
import tech.timelyx.backend.service.LiveFeedLocationService;

import java.util.List;

@RestController
@RequestMapping("/livefeedlocations")
public class LiveFeedLocationController {

    @Autowired
    private LiveFeedLocationService liveFeedLocationService;

    @PostMapping
    public ResponseEntity<LiveFeedLocation> createLiveFeedLocation(@RequestBody LiveFeedLocation location) {
        System.out.println(location);
        LiveFeedLocation newLocation = liveFeedLocationService.createLiveFeedLocation(location);
        return new ResponseEntity<>(newLocation, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LiveFeedLocation> getLiveFeedLocationById(@PathVariable String id) {
        LiveFeedLocation location = liveFeedLocationService.getLiveFeedLocationById(id).orElse(null);
        if (location == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(location, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<LiveFeedLocation>> getAllLiveFeedLocations() {
        List<LiveFeedLocation> locations = liveFeedLocationService.getAllLiveFeedLocations();
        return new ResponseEntity<>(locations, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<LiveFeedLocation> updateLiveFeedLocation(@PathVariable String id, @RequestBody LiveFeedLocation location) {
        LiveFeedLocation updatedLocation = liveFeedLocationService.getLiveFeedLocationById(id).orElse(null);
        if (updatedLocation == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        updatedLocation.setName(location.getName());
        updatedLocation.setCoordinates(location.getCoordinates());
        updatedLocation.setFrequency(location.getFrequency());
        LiveFeedLocation savedLocation = liveFeedLocationService.updateLiveFeedLocation(updatedLocation);
        return new ResponseEntity<>(savedLocation, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteLiveFeedLocationById(@PathVariable String id) {
        liveFeedLocationService.deleteLiveFeedLocationById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
