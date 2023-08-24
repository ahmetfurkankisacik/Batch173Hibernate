package org.comTpe.hb01_criteriaApi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class RunnerFetch {
    public static void main(String[] args) {
        Configuration config=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Yazar02.class);
        SessionFactory sessionFactory= config.buildSessionFactory();;
        Session session= sessionFactory.openSession();
        Transaction trans=session.beginTransaction();
        CriteriaBuilder cb= session.getCriteriaBuilder();//sorgulari ifadeleri olusturma
        CriteriaQuery<Yazar02> criteriaQuery =cb.createQuery(Yazar02.class);//sorguyu cekme
        Root<Yazar02> root= criteriaQuery.from(Yazar02.class);//sorguyu neye gore alıyoruz root classin icinde her seyi temsil ediyo
        //tum yazarlari yazdirin
        // criteriaQuery.select(root);
        // List<Yazar02>tumyazarlistesi=session.createQuery(criteriaQuery).getResultList();
        // System.out.println(tumyazarlistesi);
        //2.Örnek, yazar ismi "yazar2" olan yazar bilgilerini getirelim
        //select from yazar_table where name=yazar2;
        criteriaQuery.select(root).where(cb.equal(root.get("name"),"yazar2"));
        //List<Yazar02>tumyazarlistesi1=session.createQuery(criteriaQuery).getResultList();
        //tumyazarlistesi.forEach(System.out::println);
        //3.Örnek, autherRating değeri 6 dan büyük olan yazar bilgilerini getirelim.
        //criteriaQuery.select(root).where(cb.greaterThanOrEqualTo(root.get("autherRating"),5.5));
        //List<Yazar02>tumyazarlistesi1=session.createQuery(criteriaQuery).getResultList();
        //tumyazarlistesi1.forEach(System.out::println);
        //4.Örnek, autherRating değeri 3 den küçük olan yazar bilgilerini getirelim.
        //5. autherRating degeri 3'den buyuk ve 6 dan kucuk olan recordu bulalım




    }
}
