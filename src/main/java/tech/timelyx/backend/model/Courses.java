package tech.timelyx.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Document(collection = "courses")
public class Courses {
    @Id
    private String id;
    private String courseId;
    private Map<String, List<String>> updates;
    private Map<String, String> notes;

    public Courses() {}

    public Courses(String courseId, Map<String, List<String>> updates, Map<String, String> notes) {
        this.courseId = courseId;
        this.updates = updates;
        this.notes = notes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public Map<String, List<String>> getUpdates() {
        return updates;
    }

    public void setUpdates(Map<String, List<String>> updates) {
        this.updates = updates;
    }

    public Map<String, String> getNotes() {
        return notes;
    }

    public void setNotes(Map<String, String> notes) {
        this.notes = notes;
    }
// getters and setters

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", courseId='" + courseId + '\'' +
                ", updates=" + updates +
                ", notes=" + notes +
                '}';
    }
}