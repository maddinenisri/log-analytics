package com.mdstech.sample;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Event {
    private String applicationName;
    private String componentName;
    private LocalDateTime eventRecievedTime;

    public Event() {
    }

    public Event(String applicationName, String componentName, LocalDateTime eventRecievedTime) {
        this.applicationName = applicationName;
        this.componentName = componentName;
        this.eventRecievedTime = eventRecievedTime;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public String getComponentName() {
        return componentName;
    }

    public LocalDateTime getEventRecievedTime() {
        return eventRecievedTime;
    }
}
