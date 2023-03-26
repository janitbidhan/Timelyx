package tech.timelyx.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tasks")
public class Tasks {
    @Id
    private String id;
    private String taskId;
    private String courseId;
    private boolean isCourseLinked;
    private String data;

    public Tasks() {}

    public Tasks(String taskId, String courseId, boolean isCourseLinked, String data) {
        this.taskId = taskId;
        this.courseId = courseId;
        this.isCourseLinked = isCourseLinked;
        this.data = data;
    }

    // getters and setters

    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", taskId='" + taskId + '\'' +
                ", courseId='" + courseId + '\'' +
                ", isCourseLinked=" + isCourseLinked +
                ", data='" + data + '\'' +
                '}';
    }
}