package com.vnbd.svc.app;

/**
 * @author nguyendee
 *
 */
public class ErrorDetails {
    private long timestamp;
    private String message;
    private String details;

    public ErrorDetails(long timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
