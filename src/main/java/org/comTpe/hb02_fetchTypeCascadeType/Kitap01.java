package org.comTpe.hb02_fetchTypeCascadeType;

import org.comTpe.hb01_fetchTypeCascadeType.Yazar;

import javax.persistence.*;

@Entity
@Table(name = "t_kitap01")
public class Kitap01 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int seriNo;
    private String name;
    private String fiyat;
    private String basimYili;

    public Kitap01() {
    }

    public Kitap01(String name, String fiyat, String basimYili,Yazar01 yazar01) {
        this.name = name;
        this.fiyat = fiyat;
        this.basimYili = basimYili;
        this.yazar01=yazar01;
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

    public String getBasimYili() {
        return basimYili;
    }

    public void setBasimYili(String basimYili) {
        this.basimYili = basimYili;
    }

    public Yazar01 getYazar01() {
        return yazar01;
    }

    public void setYazar01(Yazar01 yazar01) {
        this.yazar01 = yazar01;
    }

    @Override
    public String toString() {
        return "Kitap01{" +
                "seriNo=" + seriNo +
                ", name='" + name + '\'' +
                ", fiyat='" + fiyat + '\'' +
                ", basimYili='" + basimYili + '\'' +
                '}';
    }

    @ManyToOne(fetch = FetchType.EAGER)
    private Yazar01 yazar01;
}
