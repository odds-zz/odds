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
import org.odds.hibernate.Record;
/**
 *Helper Class that wraps database operations safely in transactions
 * @author User
 */

public class RecordDAO{
    
    public RecordDAO(){
        
    }
    
    public void createRecord (Record r){
    
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try{
            tx = session.beginTransaction();
            session.update(r);
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
    
    public void updateRecord (Record r){
        
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try{
            tx = session.beginTransaction();
            session.update(r);
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
    
    public void deleteRecord (Record r){
        
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try{
            tx = session.beginTransaction();
            session.delete(r);
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
    
    public Record getRecord (Integer id){
        
        Record r = null;
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try{
            tx = session.beginTransaction();
            Query q = session.createQuery("from Record where Record.id = :id");
            q.setString("id", id.toString());
            r = (Record) q.uniqueResult();
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
        return r;
    }
    
    public List listRecords(){
        
        List<Record> rList = null;
        Transaction tx = null;
        Session session;
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try
        {            
            tx = session.beginTransaction();
            Query q;
            q = session.createQuery("from Record");
            rList = (List<Record>) q.list();
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
        return rList;        
    }
    
}