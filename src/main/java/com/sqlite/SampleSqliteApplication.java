
package com.sqlite;

import com.sqlite.entities.UserLogin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sqlite.models.LoginModel;
import com.sqlite.service.IUserService;

import java.util.List;

@SpringBootApplication
public class SampleSqliteApplication {

    public static void main(String[] args) {
        ApplicationContext ctx =
                SpringApplication.run(SampleSqliteApplication.class, args);
	  		/*String[] beanNames = ctx.getBeanDefinitionNames();
	  		    Arrays.sort(beanNames);
	  		    System.out.println("***********************");
	  		    for (String beanName : beanNames) {
	  		        System.out.println(beanName);
	  		    }
	  		    System.out.println("***********************");*/

        IUserService userService =
                ctx.getBean("userService", IUserService.class);

       /* UserLogin userLogin = new UserLogin();
        userLogin.setUserName("bharat0126");
        userLogin.setPassword("dbase123");
        userLogin.setFirstName("Bharat");
        userLogin.setLastName("Verma");
        userLogin.setEmail("bharatverma2488@gmail.com");
        userLogin.setMobile("8861456151");*/


        //userService.save(userLogin);


        LoginModel loginModel = new LoginModel();
        loginModel.setPassword("dbase123");
        loginModel.setUserName("bharat0126");
        System.out.println("###" + userService.getUser(loginModel).toString());


        List<UserLogin> ddd = userService.getAllUsers();

        System.out.println("Users: " + ddd.size());

    }
}
