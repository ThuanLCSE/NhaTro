/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.UserDAO;

import DTO.Testtable2;
import java.util.List;
import org.hibernate.Query;

import org.hibernate.Session;

/**
 *
 * @author Nguyen Nhat
 */
public class userDAO {
    public static List<Testtable2> layDS(){
    List<Testtable2> lst = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String sql = "from Testtable2";
            Query query = session.createQuery(sql);
            lst = query.list();
        } catch (Exception e) {
        }
    return lst;
    }
    public static void addMember(int id, String name){
        Testtable2 tt = new Testtable2(id, name);
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(tt);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
