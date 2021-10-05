package academy.devdojo.microservices.core.repository;

import academy.devdojo.microservices.core.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
