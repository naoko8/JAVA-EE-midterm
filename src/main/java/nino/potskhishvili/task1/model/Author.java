package nino.potskhishvili.task1.model;

import lombok.Data;
import lombok.ToString;

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

    @ManyToMany(mappedBy = "categories",cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Book>book=new ArrayList<>();
}
