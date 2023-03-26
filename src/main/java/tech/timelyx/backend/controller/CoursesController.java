package tech.timelyx.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.timelyx.backend.model.Courses;
import tech.timelyx.backend.service.CoursesService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/courses")
public class CoursesController {
    @Autowired
    private CoursesService service;

    @GetMapping
    public List<Courses> getAllCourses() {
        return service.getAllCourses();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Courses> getCourseById(@PathVariable("id") String id) {
        Optional<Courses> course = service.getCourseById(id);
        return course.isPresent() ?
                new ResponseEntity<>(course.get(), HttpStatus.OK) :
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public Courses createCourse(@RequestBody Courses course) {
        return service.createCourse(course);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Courses> updateCourse(@PathVariable("id") String id, @RequestBody Courses course) {
        service.updateCourse(id, course);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable("id") String id) {
        service.deleteCourse(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
