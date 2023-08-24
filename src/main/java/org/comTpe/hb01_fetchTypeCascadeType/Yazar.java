package org.comTpe.hb01_fetchTypeCascadeType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "t_yazar")
public class Yazar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String authorRating;

    @OneToMany(mappedBy = "yazar",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Kitap>kitapList=new ArrayList<>();


    public Yazar() {
    }

    public Yazar(String name, String authorRating) {
        this.name = name;
        this.authorRating = authorRating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorRating() {
        return authorRating;
    }

    public void setAuthorRating(String authorRating) {
        this.authorRating = authorRating;
    }

    @Override
    public String toString() {
        return "Yazar{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authorRating='" + authorRating + '\'' +
                '}';
    }
}
