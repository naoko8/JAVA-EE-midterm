package nino.potskhishvili.task1.model;


import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String title;
    String description;

    @ManyToMany(mappedBy = "categories",cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Author> author=new ArrayList<>();

    @ToString.Exclude
    @OneToMany( mappedBy = "post", cascade = CascadeType.ALL, fetch = FetchType.LAZY) //
    private List<Tag> tag = new ArrayList<>();
}
