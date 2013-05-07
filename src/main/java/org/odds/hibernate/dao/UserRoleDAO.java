/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.odds.hibernate.dao;

/**
 * @author Kenneth Kataiwa
 */
import java.sql.Connection;
import org.hibernate.Query;
import org.hibernate.Session;
import org.odds.hibernate.HibernateUtil;
import org.odds.hibernate.entities.UserRole;

public class UserRoleDAO {


    public static UserRole create(UserRole ur) {

        try {
            Session session;
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            session.save(ur);
            session.getTransaction().commit();
            Connection close; //end of  session
            close = session.close();

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return ur;
    }
}
