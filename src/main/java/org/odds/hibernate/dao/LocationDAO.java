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
import org.odds.hibernate.Location;

/**
 *Helper Class that wraps database operations safely in transactions
 * @author User
 */
public class LocationDAO {
    
    public LocationDAO(){
        
    }
    
    public void createLocation (Location l){
        
      Transaction tx;
        tx = null;
        Session session;
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        try{
            tx = session.beginTransaction();
            session.save(l);
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
    
    public void deleteLocation(Location l){
        
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try{
            tx = session.beginTransaction();
            session.delete(l);
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
    
    public void updateLocation (Location l){
        
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try{
            tx = session.beginTransaction();
            session.update(l);
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
    
    public Location getLocation(Integer id){
        
        Location l = null;
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try{
            tx = session.beginTransaction();
            Query q = session.createQuery("from Location where Location.id = :id");
            q.setString("id", id.toString());
            l = (Location) q.uniqueResult();
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
        return l;
    }
    
    public List listLocations(){
        
        List<Location> lList = null;
        Transaction tx = null;
        Session session;
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try
        {            
            tx = session.beginTransaction();
            Query q;
            q = session.createQuery("from Location");
            lList = (List<Location>) q.list();
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
        return lList;
    }
}
