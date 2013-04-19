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
import org.odds.hibernate.entities.Feedback;
/**
 *
 * @author User
 */
public class FeedbackDAO {
    
    public FeedbackDAO (){
        
    }
    
    public void createFeedback(Feedback f){
        
        Transaction tx;
        tx = null;
        Session session;
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        try{
            tx = session.beginTransaction();
            session.save(f);
            tx.commit();
        }
        catch(RuntimeException e){
            if (tx != null && tx.isActive()){
                try {
                tx.rollback();
                }
                catch(HibernateException he){
                System.out.println("Error rolling back this Transaction " + 
                        he.toString());
                }
            }
            throw e;
        }
    }
    
    public void updateFeedback(Feedback f){
        
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try{
            tx = session.beginTransaction();
            session.update(f);
            tx.commit();
        }
        catch(RuntimeException e){
            if(tx != null && tx.isActive()){
                try{
                tx.rollback();
                }
                catch(HibernateException he){
                    System.out.println("Error rolling back this Transaction " + he.toString());
                }
            }
            throw e;
        } 
    }
    
    public void deleteFeedback(Feedback f){
        
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try{
            tx = session.beginTransaction();
            session.delete(f);
            tx.commit();
        }
        catch(RuntimeException e){
            if(tx != null && tx.isActive()){
                try{
                tx.rollback();
                }
                catch(HibernateException he){
                    System.out.println("Error rolling back this Transaction " + he.toString());
                }
            }
            throw e;
        }
    }
    
    public Feedback getFeedback(Integer id){
        
        Feedback f = null;
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try{
            tx = session.beginTransaction();
            Query q = session.createQuery("from Feedback where Feedback.id = :id");
            q.setString("id", id.toString());
            f = (Feedback) q.uniqueResult();
            tx.commit();
            Connection close;
            close = session.close();
        }

        catch(RuntimeException e){
            if( tx != null && tx.isActive()){
                try{
                    tx.rollback();
                }
                catch(HibernateException he){
                    System.out.println("Error rolling back the Transaction " + he.toString());
                }
            }
            throw e;
        }
        return f;
    }
    
    public List listFeedback(){
        
        List<Feedback> fList = null;
        Transaction tx = null;
        Session session;
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try
        {            
            tx = session.beginTransaction();
            Query q;
            q = session.createQuery("from Feedback");
            fList = (List<Feedback>) q.list();
            tx.commit();//end of transaction
            Connection close; //end of  session
            close = session.close();
        }
        catch(RuntimeException e){
            if (tx != null && tx.isActive()){
                try{
                tx.rollback();
                }
                catch(HibernateException he){
                System.out.println("Error rolling back the Transaction " + he.toString());     
                }
            }
            
        }
        return fList;
    }
    
    
}
