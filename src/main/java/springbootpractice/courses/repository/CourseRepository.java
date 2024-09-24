package springbootpractice.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springbootpractice.courses.bean.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
