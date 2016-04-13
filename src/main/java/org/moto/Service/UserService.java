package org.moto.Service;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.moto.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManagerFactory;
import java.util.List;

/**
 * Created by Nahid on 4/13/2016.
 */

@Service
public class UserService {

    @Autowired
    private EntityManagerFactory emf;

    public String getUserName(){

        SessionFactory sf = emf.unwrap(SessionFactory.class);
        Session session =  sf.openSession();
        session.beginTransaction();


        Criteria criteria = session.createCriteria(User.class);
        criteria.add(Restrictions.eq("Email","02nahid02@gmail.com"));


        List<User> oneUser = (List<User>) criteria.list();
        System.out.println(oneUser.get(0).getName());

        session.getTransaction().commit();
        session.close();

        return oneUser.get(0).getName();

    }
}
