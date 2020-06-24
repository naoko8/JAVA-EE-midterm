package nino.potskhishvili.task1.repository;

import nino.potskhishvili.task1.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
