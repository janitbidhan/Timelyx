package tech.timelyx.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.timelyx.backend.model.Courses;
import tech.timelyx.backend.repository.CourseRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CoursesService {
    @Autowired
    private CourseRepository repository;

    public List<Courses> getAllCourses() {
        return repository.findAll();
    }

    public Optional<Courses> getCourseById(String id) {
        return repository.findById(id);
    }

    public Courses createCourse(Courses course) {
        return repository.save(course);
    }

    public void updateCourse(String id, Courses course) {
        Optional<Courses> existingCourse = repository.findById(id);
        if (existingCourse.isPresent()) {
            course.setId(existingCourse.get().getId());
            repository.save(course);
        }
    }

    public void deleteCourse(String id) {
        repository.deleteById(id);
    }
}
