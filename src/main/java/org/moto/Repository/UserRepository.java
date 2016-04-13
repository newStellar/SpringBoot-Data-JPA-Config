package org.moto.Repository;

import org.moto.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;


import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Nahid on 4/12/2016.
 */

public interface UserRepository extends JpaRepository<User,Long>{

}
