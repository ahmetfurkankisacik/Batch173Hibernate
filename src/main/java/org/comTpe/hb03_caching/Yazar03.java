package org.comTpe.hb03_caching;

import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "t_yazar03")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Yazar03 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private String name;
    private double autherRating;

    @Override
    public String toString() {
        return "Yazar02{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", autherRating=" + autherRating +
                '}';
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

    public double getAutherRating() {
        return autherRating;
    }

    public void setAutherRating(double autherRating) {
        this.autherRating = autherRating;
    }

}
