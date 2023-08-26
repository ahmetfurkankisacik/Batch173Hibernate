package org.comTpe.hb03_caching;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave {
    public static void main(String[] args) {
        Configuration config=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Yazar03.class);
        SessionFactory sessionFactory= config.buildSessionFactory();
        Session session= sessionFactory.openSession();
        Transaction trans= session.beginTransaction();
        Yazar03 yazar1=new Yazar03();
        yazar1.setName("fevzi bey");
        yazar1.setAutherRating(9);
        session.persist(yazar1);
        Yazar03 yazar2=new Yazar03();
        yazar2.setName("yahya bey");
        yazar2.setAutherRating(8);
        session.persist(yazar2);
        Yazar03 yazar3=new Yazar03();
        yazar3.setName("tuba hanima");
        yazar3.setAutherRating(8.5);
        session.persist(yazar3);


        trans.commit();
        session.close();
        sessionFactory.close();
    }
}
