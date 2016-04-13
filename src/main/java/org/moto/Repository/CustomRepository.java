package org.moto.Repository;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.moto.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Nahid on 4/13/2016.
 */

@Repository
public class CustomRepository {

    @Autowired
    private EntityManagerFactory emf;

    public String getUserNameByEmail(String email){

        SessionFactory sf = emf.unwrap(SessionFactory.class);
        Session session =  sf.openSession();
        session.beginTransaction();

        System.out.println(email+"----------------");
        Criteria criteria = session.createCriteria(User.class);
        criteria.add(Restrictions.eq("Email",email));


        List<User> oneUser = (List<User>) criteria.list();
        System.out.println(oneUser.get(0).getName());

        session.getTransaction().commit();
        session.close();

        return oneUser.get(0).getName();

    }
}
