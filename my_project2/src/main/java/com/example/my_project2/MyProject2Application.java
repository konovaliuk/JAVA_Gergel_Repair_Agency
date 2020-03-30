package com.example.my_project2;

import com.example.my_project2.entity.User;
import com.example.my_project2.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
@EnableWebMvc
public class MyProject2Application {

//	private static final Logger log = LoggerFactory.getLogger(MyProject2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(MyProject2Application.class);
//		User q = new User("Igor", "manager");
//		User q2 = new User("Igor5", "manager");
//		System.out.println(q);
//		System.out.println(q2);


//        System.out.println("7777777777777777777777777777777777777777777777777777777777777777777777");
//
//        QueryTableEntity test = new QueryTableEntity(2, new Timestamp(100), "Trash", "Trash");
//        System.out.println(test);

//		JobTableEntity test2 = new JobTableEntity(22, 2, 2000, true, "Anton", false, "Igor");
//		System.out.println(test2);
	}

//	@Bean
//	public CommandLineRunner demo(UserRepository repository) {
//		return (args) -> {
//
////			QueryTableEntity queryTableEntity = new QueryTableEntity(2, new Timestamp(100), "Trash", "Trash");
////			JobTableEntity jobTableEntity = new JobTableEntity(10, queryTableEntity, 2000, true, "Anton", false, "Igor");
//
//			System.out.println("111111111111111111111111111111111111111111");
////			System.out.println(jobTableEntity);
//
////			jobTableEntity.setQueryTableEntity(queryTableEntity);
//
////			repository.save(new QueryTableEntity(new Timestamp(100), "Trash", "Trash"));
////			job_res.save(jobTableEntity);
//
//			log.info("Customers found with findAll():");
//			log.info("-------------------------------");
//			for (User customer : repository.findAll()) {
//				log.info("i");
//				System.out.println("!!! " + customer);
//			}
//			log.info("");
//
//		};
//	}

}
