package org.moto.Controllers;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.moto.Models.User;
import org.moto.Repository.UserRepository;
import org.moto.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.EntityManagerFactory;
import java.util.List;

/**
 * Created by Nahid on 4/12/2016.
 */

@Controller
public class UserController {

    @Autowired
    public UserService userService;

    @RequestMapping(value ="/", method = RequestMethod.GET)
    @ResponseBody
    public String home(){

        String ans = userService.getUserName();
        return "okay "+ ans;
    }
}
