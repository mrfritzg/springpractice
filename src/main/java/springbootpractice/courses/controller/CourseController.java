package springbootpractice.courses.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import springbootpractice.courses.controller.bean.Course;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    //http://localhost:8080/courses
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return List.of(new Course(1, "Learn Microservices", "in 28minutes"),
                new Course(2, "Full Stack with Angular and React","In 28 minutes"));
    }

    //http://localhost:8080/courses/1
    @GetMapping("courses/{id}")
    public Course getCourse(@PathVariable int id) {
        Course tempCourse = null;
        List<Course> tempCourses = getAllCourses();
        for(Course course : tempCourses) {
            if(course.getId() == id) {
                tempCourse = course;
            }
        }
        return tempCourse;
    }
}
