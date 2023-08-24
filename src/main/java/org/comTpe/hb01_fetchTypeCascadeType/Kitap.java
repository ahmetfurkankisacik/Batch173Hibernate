package org.comTpe.hb01_fetchTypeCascadeType;

import javax.persistence.*;

@Entity
@Table(name = "t_kitap")
public class Kitap {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int seriNo;
    private String name;
    private String fiyat;
    private String basimyili;

    public Kitap() {
    }

    public Kitap(String name, String fiyat, String basimyili, Yazar yazar) {
        this.name = name;
        this.fiyat = fiyat;
        this.basimyili = basimyili;
        this.yazar = yazar;
    }








    public int getSeriNo() {
        return seriNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }

    public String getBasimyili() {
        return basimyili;
    }

    public void setBasimyili(String basimyili) {
        this.basimyili = basimyili;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "seriNo=" + seriNo +
                ", name='" + name + '\'' +
                ", fiyat='" + fiyat + '\'' +
                ", basimyili='" + basimyili + '\'' +
                '}';
    }
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "yazar_id")
    private Yazar yazar;

}
