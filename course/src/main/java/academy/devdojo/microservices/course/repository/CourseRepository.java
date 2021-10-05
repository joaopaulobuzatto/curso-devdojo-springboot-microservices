package academy.devdojo.microservices.course.repository;

import academy.devdojo.microservices.course.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
