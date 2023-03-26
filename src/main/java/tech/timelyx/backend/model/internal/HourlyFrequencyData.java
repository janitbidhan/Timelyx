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

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "HourlyFrequencyData{" +
                "dateTime=" + dateTime +
                ", frequency=" + frequency +
                '}';
    }
}
