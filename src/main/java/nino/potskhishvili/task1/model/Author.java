package nino.potskhishvili.task1.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String firstName;

    String lastName;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Book> book = new ArrayList<>();
}
