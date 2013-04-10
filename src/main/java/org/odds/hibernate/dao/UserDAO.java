/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.odds.hibernate.dao;

/**
 *
 * @author UserDAO
 */

import java.sql.Connection;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.odds.hibernate.HibernateUtil;
import org.odds.hibernate.User;
public class UserDAO {

    public List listUser(){

        List<User> users = null;

        try
        {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            Query query;
            query = session.createQuery("from User");
            users = (List<User>) query.list();

            session.getTransaction().commit();//end of transaction
            Connection close; //end of  session
            close = session.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
        }

        return users;
    }

    public void createUser(){

     Session session;
        session = HibernateUtil.getSessionFactory().getCurrentSession();

        session.beginTransaction();
        User u = (User) session.get(User.class, (long) 1);
        session.getTransaction().commit();


    }

    public User createUser(User u){

        try{
            Session session;
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            session.save(u);
            session.getTransaction().commit();
            Connection close; //end of  session
            close = session.close();

        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }
        return u;
    }

    public User getUser(Integer uID){

        User u = null;
        try{
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            Query q = session.createQuery("from User where User.id = :uID");
            q.setString("uID", uID.toString());
            u = (User) q.uniqueResult();
            session.close();
        }

        catch(Exception e){
            System.out.println(e.toString());
        }
        return u;
    }

    public void deleteUser(Integer uID){

        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Query q = s.createQuery("delete from User where User.id = :uID").setString("uID",uID.toString());
        q.executeUpdate();
        s.getTransaction().commit();
        s.close();
    }

    public void save(User u) {
		try {
                        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			session.update(u);
			session.getTransaction().commit();
		}

                catch (Exception e) {
			//rollback();
                        System.out.println(e.toString());
		}

	}

}
