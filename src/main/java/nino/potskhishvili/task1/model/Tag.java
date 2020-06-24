package nino.potskhishvili.task1.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String name;

    @ManyToOne
    private Book book;
}
