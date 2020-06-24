package nino.potskhishvili.task1;

import nino.potskhishvili.task1.model.Tag;
import nino.potskhishvili.task1.repository.AttachmentRepository;
import nino.potskhishvili.task1.repository.AuthorRepository;
import nino.potskhishvili.task1.repository.BookRepository;
import nino.potskhishvili.task1.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TESTController {

    @Autowired
    AttachmentRepository attachmentRepository;

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    TagRepository tagRepository;

    @GetMapping("addTag")
    public void addTag() {
        Tag tag = new Tag();
        tag.setName("tag 1");
        tagRepository.save(tag);
    }



}
