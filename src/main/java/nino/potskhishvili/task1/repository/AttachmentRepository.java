package nino.potskhishvili.task1.repository;

import nino.potskhishvili.task1.model.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepository extends JpaRepository<Attachment,Long> {
}
