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
import org.odds.hibernate.entities.DonationMoney;
import org.hibernate.Transaction;

/**
 * helper class to make repetitive queries in the database Donation table
 *
 * @author User
 */
public class DonationMoneyDAO {

    public DonationMoneyDAO() {
    }

    public static Feedback createDonation(DonationMoney d) {

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

    public static void deleteDonation(DonationMoney d) {

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

    public static void updateDonation(DonationMoney d) {

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

    public static DonationMoney getDonation(Integer id) {

        DonationMoney d = null;
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery("from DonationMoney where DonationMoney.id = :id");
            q.setString("id", id.toString());
            d = (DonationMoney) q.uniqueResult();
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

        List<DonationMoney> dList = null;
        Transaction tx = null;
        Session session;
        session = HibernateUtil.getSessionFactory().getCurrentSession();

        try {
            tx = session.beginTransaction();
            Query q;
            q = session.createQuery("from DonationMoney");
            dList = (List<DonationMoney>) q.list();
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
            q = session.createQuery("select count(*) from DonationMoney");
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
            q = session.createQuery("select count(*) from DonationMoney  dm where day(dm.time) = day(now())");
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
            q = session.createQuery("select count(*) from DonationMoney dm where month(dm.time) = month(now())");
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
            q = session.createQuery("select count(*) from DonationMoney dm where year(dm.time) = year(now())");
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