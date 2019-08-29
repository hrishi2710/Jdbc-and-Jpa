package hrishi.database.databasedemo;



import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hrishi.database.databasedemo.entity.Person;
import hrishi.database.databasedemo.jdbc.PersonJdbcDAO;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDAO dao;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {}", dao.findAll());
		logger.info("User id 10001 -> {}", dao.findById(10001));
		
		logger.info("User with name Charlie -> {}", dao.findByName("Charlie"));
		logger.info("Deleting 10002 -> No. of rows deleted: {}", dao.deleteById(10002));
		
		logger.info("Inserting 10004 -> {}" , 
				dao.insert(new Person(10004, "Manu", "Davanagere",new Date())));
		
		logger.info("Updating 10003 -> {}" ,
				dao.update(new Person(10003 , "Abhilash", "Darbhanga", new Date())));
		
		
	}

}
