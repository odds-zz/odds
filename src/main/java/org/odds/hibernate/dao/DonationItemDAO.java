/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.odds.hibernate.dao;

import java.sql.Connection;
import java.util.List;
import org.hibernate.Query;
import org.odds.hibernate.entities.Feedback;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.odds.hibernate.HibernateUtil;
import org.odds.hibernate.entities.DonationItem;
import org.hibernate.Transaction;

/**
 * helper class to make repetitive queries in the database Donation table
 *
 * @author User
 */
public class DonationItemDAO {

    public DonationItemDAO() {
    }

    public static Feedback createDonation(DonationItem d) {

        Transaction tx;
        tx = null;
        Session session;
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            tx = session.beginTransaction();
            session.save(d);
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
        Feedback f = new Feedback();
        return f;
    }

    public static void deleteDonation(DonationItem d) {

        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            tx = session.beginTransaction();
            session.delete(d);
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

    public static void updateDonation(DonationItem d) {

        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            tx = session.beginTransaction();
            session.update(d);
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

    public static DonationItem getDonation(Integer id) {

        DonationItem d = null;
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery("from DonationItem where DonationItem.id = :id");
            q.setString("id", id.toString());
            d = (DonationItem) q.uniqueResult();
            tx.commit();
            Connection close;
            close = session.close();
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
        return d;
    }

    public static List listDonations() {

        List<DonationItem> dList = null;
        Transaction tx = null;
        Session session;
        session = HibernateUtil.getSessionFactory().getCurrentSession();

        try {
            tx = session.beginTransaction();
            Query q;
            q = session.createQuery("from DonationItem");
            dList = (List<DonationItem>) q.list();
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
        return dList;
    }

    public static Integer countDonations() {
        Integer numberDonations = 0;
        Transaction tx = null;
        Session session;
        session = HibernateUtil.getSessionFactory().getCurrentSession();

        try {
            tx = session.beginTransaction();
            Query q;
            q = session.createQuery("select count(*) from DonationItem");
            numberDonations = ((Long) q.uniqueResult()).intValue();
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
        return numberDonations;
    }

    public static Integer countDonationsByDay() {
        Integer numberDonations = 0;
        Transaction tx = null;
        Session session;
        session = HibernateUtil.getSessionFactory().getCurrentSession();

        try {
            tx = session.beginTransaction();
            Query q;
            q = session.createQuery("select count(*) from DonationItem  dm where day(dm.time) = day(now())");
            numberDonations = ((Long) q.uniqueResult()).intValue();
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
        return numberDonations;
    }

    public static Integer countDonationsByMonth() {
        Integer numberDonations = 0;
        Transaction tx = null;
        Session session;
        session = HibernateUtil.getSessionFactory().getCurrentSession();

        try {
            tx = session.beginTransaction();
            Query q;
            q = session.createQuery("select count(*) from DonationItem dm where month(dm.time) = month(now())");
            numberDonations = ((Long) q.uniqueResult()).intValue();
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
        return numberDonations;
    }

    public static Integer countDonationsByYear() {
        Integer numberDonations = 0;
        Transaction tx = null;
        Session session;
        session = HibernateUtil.getSessionFactory().getCurrentSession();

        try {
            tx = session.beginTransaction();
            Query q;
            q = session.createQuery("select count(*) from DonationItem dm where year(dm.time) = year(now())");
            numberDonations = ((Long) q.uniqueResult()).intValue();
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
        return numberDonations;
    }
}