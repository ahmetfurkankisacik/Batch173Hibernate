package org.comTpe.hb02_fetchTypeCascadeType;

import org.comTpe.hb01_fetchTypeCascadeType.Kitap;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "t_yazar01")
public class Yazar01 {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String authorRating;

    @OneToMany(mappedBy = "yazar01",cascade = CascadeType.ALL)
    private List<Kitap01> kitap01List=new ArrayList<>();

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

    public Yazar01(String name, String authorRating) {
        this.name = name;
        this.authorRating = authorRating;
    }

    public Yazar01() {
    }

    @Override
    public String toString() {
        return "Yazar01{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authorRating='" + authorRating + '\'' +
                '}';
    }
}
