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
import org.odds.hibernate.entities.OrphanageAddress;

public class OrphanageAddressDAO {

    public static OrphanageAddress getByOrphanage(Integer orphanageId) {

        OrphanageAddress oa = null;
        try {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            Query q = session.createQuery("from OrphanageAddress oa where orphanage_id = :orphanageId");
            q.setString("orphanageId", orphanageId.toString());
            oa = (OrphanageAddress) q.uniqueResult();
            session.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return oa;
    }

    public static OrphanageAddress create(OrphanageAddress oa) {

        try {
            Session session;
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            session.save(oa);
            session.getTransaction().commit();
            Connection close; //end of  session
            close = session.close();

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return oa;
    }
}
