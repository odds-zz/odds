/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.odds.hibernate.dao;

/**
 * @author Kenneth Kataiwa
 */
import org.hibernate.Query;
import org.hibernate.Session;
import org.odds.hibernate.HibernateUtil;
import org.odds.hibernate.entities.UserContact;

public class UserContactDAO {

    public static UserContact getByUser(Integer userId) {

        UserContact uc = null;
        try {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            Query q = session.createQuery("from UserContact uc where user_id = :userId");
            q.setString("userId", userId.toString());
            uc = (UserContact) q.uniqueResult();
            session.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return uc;
    }

}
