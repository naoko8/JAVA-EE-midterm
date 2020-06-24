package nino.potskhishvili.task1.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Attachment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String pdfURL;

    @OneToOne(cascade = CascadeType.ALL)
    private Book book;

}
