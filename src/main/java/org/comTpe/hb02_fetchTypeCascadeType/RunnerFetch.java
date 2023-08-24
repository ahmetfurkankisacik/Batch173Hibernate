package org.comTpe.hb02_fetchTypeCascadeType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch {
    public static void main(String[] args) {
        Configuration config=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Yazar01.class).addAnnotatedClass(Kitap01.class);
        SessionFactory sessionFactory= config.buildSessionFactory();
        Session session= sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();
        //Yazar01 yazar01=session.get(Yazar01.class,1);
        //session.delete(yazar01);

        Kitap01 kitap01=session.get(Kitap01.class,1);
        System.out.println(kitap01);
        session.delete(kitap01);


        transaction.commit();
        session.close();
        sessionFactory.close();

    }
}
