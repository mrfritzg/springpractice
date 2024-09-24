package springbootpractice.courses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springbootpractice.courses.bean.Course;
import springbootpractice.courses.repository.CourseRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository repository;

    //http://localhost:8080/courses
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return repository.findAll();
//        return List.of(new Course(1, "Learn Microservices", "in 28minutes"),
//                new Course(2, "Full Stack with Angular and React","In 28 minutes"));
    }

    //http://localhost:8080/courses/1
    @GetMapping("/courses/{id}")
    public Course getCourse(@PathVariable long id) {
        Optional<Course> course = repository.findById(id);
        if(course.isEmpty()){
            throw new RuntimeException("Course not found with id "+id);
        }
        return course.get();
//        Course tempCourse = null;

//        List<Course> tempCourses = getAllCourses();
//        for(Course course : tempCourses) {
//            if(course.getId() == id) {
//                tempCourse = course;
//            }
//        }
//        return tempCourse;
    }

    @PostMapping("/courses")
    public void createCourse(@RequestBody Course course) {
        repository.save(course);
    }

    @PutMapping("/courses/{id}")
    public void updateCourse(@PathVariable long id, @RequestBody Course course) {
//        repository.save(course);
        Optional<Course> course1 = repository.findById(id);
        if(course1.isEmpty()){
            throw new RuntimeException("Course not found with id "+id);
        } else {
            repository.save(course);
        }
    }

    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable long id) {
        Optional<Course> course = repository.findById(id);
        if(course.isEmpty()){
            throw new RuntimeException("Course not found with id "+id);
        } else {
            repository.deleteById(id);
        }
    }

}
