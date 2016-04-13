package org.moto.Service;


import org.moto.Repository.CustomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Nahid on 4/13/2016.
 */

@Service
public class UserService {

    @Autowired
    private CustomRepository userRepo;

    public String getNameByEmail(String email){

        return userRepo.getUserNameByEmail(email);
    }

}
