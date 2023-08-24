package org.comTpe.hb01_criteriaApi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave {
    public static void main(String[] args) {
        Configuration config=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Yazar02.class);
        SessionFactory sessionFactory= config.buildSessionFactory();;
        Session session= sessionFactory.openSession();
        Transaction trans=session.beginTransaction();
        //10 tane yazar olusturalim
        double input=0.5;

        for (int i = 1; i <=10 ; i++) {
            Yazar02 yazar02=new Yazar02();
            yazar02.setName("yazar"+i);
            yazar02.setAutherRating(input);
            input++;
            session.persist(yazar02);
        }
        trans.commit();
        session.close();
        sessionFactory.close();
    }
}
