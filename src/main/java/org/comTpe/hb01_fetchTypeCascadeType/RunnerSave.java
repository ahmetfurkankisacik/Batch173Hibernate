package org.comTpe.hb01_fetchTypeCascadeType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave {
    public static void main(String[] args) {
        Yazar yazar1=new Yazar("Bekir Bayram","6");
        Yazar yazar2=new Yazar("Vehbi Demirezen","7");
        Kitap kitap0=new Kitap("1984","20$","2011",yazar2);
        Kitap kitap1=new Kitap("savaş ve barış","25$","2010",yazar1);
        Kitap kitap2=new Kitap("Java","15$","2022",yazar1);
        Kitap kitap3=new Kitap("Phyton","15$","2023",yazar2);
        Configuration config=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Yazar.class).addAnnotatedClass(Kitap.class);
        SessionFactory sessionFactory= config.buildSessionFactory();
        Session session= sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();
        session.save(yazar1);
        session.save(yazar2);
        session.save(kitap0);
        session.save(kitap1);
        session.save(kitap2);
        session.save(kitap3);

        transaction.commit();
        session.close();
        sessionFactory.close();


    }
}
