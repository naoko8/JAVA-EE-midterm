package nino.potskhishvili.task1.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String name;

    @ToString.Exclude
    @ManyToOne()
    private Book book;
}
