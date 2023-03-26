package tech.timelyx.backend.model.internal;

import java.time.LocalDateTime;

public class HourlyFrequencyData {
    private LocalDateTime dateTime;
    private int frequency;

    public HourlyFrequencyData() {
    }

    public HourlyFrequencyData(LocalDateTime dateTime, int frequency) {
        this.dateTime = dateTime;
        this.frequency = frequency;
    }

    // getters and setters

    @Override
    public String toString() {
        return "HourlyFrequencyData{" +
                "dateTime=" + dateTime +
                ", frequency=" + frequency +
                '}';
    }
}
