package org.comTpe.hb02_fetchTypeCascadeType;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave {
    public static void main(String[] args) {
        Configuration config=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Yazar01.class).addAnnotatedClass(Kitap01.class);
        SessionFactory sessionFactory= config.buildSessionFactory();
        Session session= sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();
        Yazar01 yazar1=new Yazar01("Bekir Ali","6");
        Yazar01 yazar2=new Yazar01("Vehbi Demir","7");
        Kitap01 kitap0=new Kitap01("1984","20$","2011",yazar2);
        Kitap01 kitap1=new Kitap01("savaş ve barış","25$","2010",yazar1);
        Kitap01 kitap2=new Kitap01("Java","15$","2022",yazar1);
        Kitap01 kitap3=new Kitap01("Phyton","15$","2023",yazar2);
        session.persist(yazar1);
        session.persist(yazar2);
        session.persist(kitap0);
        session.persist(kitap1);
        session.persist(kitap2);
        session.persist(kitap3);
        transaction.commit();
        session.close();
        sessionFactory.close();













    }
}
