package Lab6;

import java.util.*;
class Task
{
    private String description;
    private int duration; // Duration in minutes
    private String completedBy;
    private boolean completed;
    public Task(String description, int duration, String completedBy) {
        this.description = description;
        this.duration = duration;
        this.completedBy = completedBy;
        this.completed = false;
    }
    public String getDescription() { return  this.description; }
    public int getDuration() { return duration;}
    public String getCompletedBy() { return this.completedBy; }
    public boolean isCompleted() { return completed; }
    public void markCompleted() { this.completed = true; }

    public String toString()
    {
        return description + " " + duration + " " + completedBy + " " + completed;
    }
}
