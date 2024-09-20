package springbootjpahibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springbootjpahibernate.course.jdbc.CourseJdbcRepository;
import springbootjpahibernate.course.jpa.CourseJpaRepository;
import springbootjpahibernate.course.springdatajpa.CourseSpringDataJpaRepository;


@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
//        repository.insert(new Course(1, "Learn AWS Now!", "in 28minutes"));
//        repository.insert(new Course(2, "Learn Azure Jpa Now!", "in 28minutes"));
//        repository.insert(new Course(3, "Learn Devops Jpa Now!", "in 28minutes"));
//        repository.insert(new Course(4, "Learn Microservices Jpa", "in 28minutes"));
//        repository.insert(new Course(5, "Full Stack with Angular and React Jpa","In 28 minutes"));

//        repository.deleteById(1);
//        System.out.println(repository.findById(2));
//        System.out.println(repository.findById(3));
//        System.out.println(repository.findById(4));
//        System.out.println(repository.findById(5));


        repository.save(new Course(1, "Learn AWS Now!", "in 28minutes"));
        repository.save(new Course(2, "Learn Azure Jpa Now!", "in 28minutes"));
        repository.save(new Course(3, "Learn Devops Jpa Now!", "in 28minutes"));
        repository.save(new Course(4, "Learn Microservices Jpa", "in 28minutes"));
        repository.save(new Course(5, "Full Stack with Angular and React Jpa","in 28minutes"));
        repository.save(new Course(6, "fritz","fritz"));
        repository.save(new Course(7, "muzz","muzz"));
        repository.deleteById(1l);
        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));
        System.out.println(repository.findById(4l));
        System.out.println(repository.findById(5l));

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("in 28minutes"));
        System.out.println(repository.findByName("fritz"));
        System.out.println(repository.findByName("muzz"));

    }
}
