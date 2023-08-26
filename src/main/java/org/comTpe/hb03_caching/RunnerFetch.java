package org.comTpe.hb03_caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import java.util.List;


public class RunnerFetch {
    public static void main(String[] args) {
        Configuration config=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Yazar03.class);
        SessionFactory sessionFactory= config.buildSessionFactory();
        Session session= sessionFactory.openSession();
        Transaction trans= session.beginTransaction();
        Query query=session.createQuery("from Yazar03 ").setCacheable(true);
        List<Yazar03>list=query.getResultList();
        //list.forEach(System.out::println);








        trans.commit();
        session.close();


        Session session1= sessionFactory.openSession();
        Transaction trans2= session1.beginTransaction();
        Yazar03 yazar03=session1.get(Yazar03.class,2);
        System.out.println(yazar03);

        trans2.commit();
        session1.close();

        sessionFactory.close();



    }
}
