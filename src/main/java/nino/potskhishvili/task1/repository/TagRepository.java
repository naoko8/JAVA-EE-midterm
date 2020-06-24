package nino.potskhishvili.task1.repository;

import nino.potskhishvili.task1.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag,Long> {
}
