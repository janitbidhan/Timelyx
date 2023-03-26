package tech.timelyx.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.timelyx.backend.model.LiveFeedLocation;
import tech.timelyx.backend.repository.LiveFeedLocationRepository;

import java.util.List;
import java.util.Optional;

@Service
public class LiveFeedLocationService {
    @Autowired
    private LiveFeedLocationRepository liveFeedLocationRepository;

    public LiveFeedLocation createLiveFeedLocation(LiveFeedLocation location) {
        return liveFeedLocationRepository.save(location);
    }

    public Optional<LiveFeedLocation> getLiveFeedLocationById(String id) {
        return liveFeedLocationRepository.findById(id);
    }

    public List<LiveFeedLocation> getAllLiveFeedLocations() {
        return liveFeedLocationRepository.findAll();
    }

    public LiveFeedLocation updateLiveFeedLocation(LiveFeedLocation location) {
        return liveFeedLocationRepository.save(location);
    }

    public void deleteLiveFeedLocationById(String id) {
        liveFeedLocationRepository.deleteById(id);
    }
}
