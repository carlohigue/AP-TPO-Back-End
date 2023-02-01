/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Higuerey
 */

import com.CrudCode.Model.User;
import com.CrudCode.repo.UserRepo;
import static org.assertj.core.api.Assertions.assertThat;
 
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
 
@DataJpaTest
public class UserRepositoryTests {
    
    @Autowired
    private TestEntityManager entityManager;
     
    @Autowired
    private UserRepo repo;
     
    @Test
public void testCreateUser() {
    User user = new User();
    user.setUserId("ravikumar@gmail.com");
    user.setPassword("ravi2020");

     
    User savedUser = repo.save(user);
     
    User existUser = entityManager.find(User.class, savedUser.getUserId());
     
    assertThat(user.getUserId()).isEqualTo(existUser.getUserId());
     
}
}
