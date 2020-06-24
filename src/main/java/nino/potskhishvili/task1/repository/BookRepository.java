package nino.potskhishvili.task1.repository;

import nino.potskhishvili.task1.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
