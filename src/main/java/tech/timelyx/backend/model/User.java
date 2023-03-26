package tech.timelyx.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private List<String> courses;
    private List<String> notes;
    private List<String> tasks;

    public User() {}

    public User(String name, String email, List<String> courses, List<String> notes, List<String> tasks) {
        this.name = name;
        this.email = email;
        this.courses = courses;
        this.notes = notes;
        this.tasks = tasks;
    }

    // getters and setters

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", courses=" + courses +
                ", notes=" + notes +
                ", tasks=" + tasks +
                '}';
    }
}