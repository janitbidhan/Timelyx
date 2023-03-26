package tech.timelyx.backend.model.internal;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class FrequencyData {
    private Map<LocalDate, List<HourlyFrequencyData>> hourlyData;

    public FrequencyData() {
    }

    public FrequencyData(Map<LocalDate, List<HourlyFrequencyData>> hourlyData) {
        this.hourlyData = hourlyData;
    }

    // getters and setters

    public Map<LocalDate, List<HourlyFrequencyData>> getHourlyData() {
        return hourlyData;
    }

    public void setHourlyData(Map<LocalDate, List<HourlyFrequencyData>> hourlyData) {
        this.hourlyData = hourlyData;
    }

    @Override
    public String toString() {
        return "FrequencyData{" +
                "hourlyData=" + hourlyData +
                '}';
    }
}
