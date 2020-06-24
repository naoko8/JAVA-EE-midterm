package nino.potskhishvili.task1.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String pdfURL;

    @OneToOne(cascade = CascadeType.ALL)
    @ToString.Exclude
    private Book book;

}
