package springbootjpahibernate.course.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import springbootjpahibernate.course.Course;

@Repository
@Transactional
public class CourseJpaRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course) {
        entityManager.merge(course);
    }

    public Course findById(long courseId) {
        return entityManager.find(Course.class, courseId);
    }

    public void deleteById(long id) {
        Course course = findById(id);
        entityManager.remove(course);
    }

}
