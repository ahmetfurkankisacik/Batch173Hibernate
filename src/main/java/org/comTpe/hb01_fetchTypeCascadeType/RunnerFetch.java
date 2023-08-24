package org.comTpe.hb01_fetchTypeCascadeType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch {
    public static void main(String[] args) {
        Configuration config=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Yazar.class).addAnnotatedClass(Kitap.class);
        SessionFactory sessionFactory= config.buildSessionFactory();
        Session session= sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();
        Kitap kitap=session.get(Kitap.class,3);
        System.out.println(kitap);
        session.delete(kitap);
        //Yazar yazar=session.get(Yazar.class,2);
        //session.delete(yazar);









        transaction.commit();
        session.close();
        sessionFactory.close();

    }
}
