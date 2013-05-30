/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.odds.hibernate.dao;

import java.sql.Connection;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.odds.hibernate.HibernateUtil;
import org.odds.hibernate.entities.Orphanage;

/**
 * Helper Class that wraps database operations safely in transactions
 *
 * @author User
 */
public class OrphanageDAO {

    public OrphanageDAO() {
    }

    public static Orphanage createOrphanage(Orphanage o) {

        Transaction tx;
        tx = null;
        Session session;
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            tx = session.beginTransaction();
            session.save(o);
            tx.commit();
        } catch (RuntimeException e) {
            if (tx != null && tx.isActive()) {
                try {
                    tx.rollback();
                } catch (HibernateException he) {
                    System.out.println("Error rolling back this Transaction "
                            + he.toString());
                }
            }
            throw e;
        }
        return o;

    }

    public void updateOrphanage(Orphanage o) {

        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            tx = session.beginTransaction();
            session.update(o);
            tx.commit();
        } catch (RuntimeException e) {
            if (tx != null && tx.isActive()) {
                try {
                    tx.rollback();
                } catch (HibernateException he) {
                    System.out.println("Error rolling back this Transaction " + he.toString());
                }
            }
            throw e;
        }
    }

    public static void deleteOrphanage(Orphanage o) {
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            tx = session.beginTransaction();
            session.delete(o);
            tx.commit();
        } catch (RuntimeException e) {
            if (tx != null && tx.isActive()) {
                try {
                    tx.rollback();
                } catch (HibernateException he) {
                    System.out.println("Error rolling back this Transaction " + he.toString());
                }
            }
            throw e;
        }
    }

    public static Orphanage getOrphanage(Integer id) {

        Orphanage o = null;
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery("from Orphanage where id = :id");
            q.setString("id", id.toString());
            o = (Orphanage) q.uniqueResult();
            tx.commit();
            // Say session already closed, look into this
            // session.close();
        } catch (RuntimeException e) {
            if (tx != null && tx.isActive()) {
                try {
                    tx.rollback();
                } catch (HibernateException he) {
                    System.out.println("Error rolling back the Transaction " + he.toString());
                }
            }
            throw e;
        }
        return o;

    }

    public static List listOrphanages() {

        List<Orphanage> oList = null;
        Transaction tx = null;
        Session session;
        session = HibernateUtil.getSessionFactory().getCurrentSession();

        try {
            tx = session.beginTransaction();
            Query q;
            q = session.createQuery("from Orphanage");
            oList = (List<Orphanage>) q.list();
            tx.commit();//end of transaction
            Connection close; //end of  session
            close = session.close();
        } catch (RuntimeException e) {
            if (tx != null && tx.isActive()) {
                try {
                    tx.rollback();
                } catch (HibernateException he) {
                    System.out.println("Error rolling back the Transaction " + he.toString());
                }
            }

        }
        return oList;
    }

    public static Integer countOrphanages() {

        Integer numberOrphanages = 0;
        Transaction tx = null;
        Session session;
        session = HibernateUtil.getSessionFactory().getCurrentSession();

        try {
            tx = session.beginTransaction();
            Query q;
            numberOrphanages = ((Integer) session.createQuery("select count(*) from Orphanage")
                    .iterate()
                    .next()).intValue();
            tx.commit();//end of transaction
            Connection close; //end of  session
            close = session.close();
        } catch (RuntimeException e) {
            if (tx != null && tx.isActive()) {
                try {
                    tx.rollback();
                } catch (HibernateException he) {
                    System.out.println("Error rolling back the Transaction " + he.toString());
                }
            }

        }
        return numberOrphanages;
    }
}
