package biz.aceras.dashboard;

import biz.aceras.dashboard.domain.Product;
import biz.aceras.dashboard.domain.User;
import biz.aceras.dashboard.repository.ProductRepository;
import biz.aceras.dashboard.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.Currency;

@SpringBootApplication
public class DashboardApplication {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
		SpringApplication.run(DashboardApplication.class, args);
	}

    @Bean
    CommandLineRunner runner() {
        return args -> {
//            Save demo data after start
            userRepository.save(new User("admin", "$2a$04$KNLUwOWHVQZVpXyMBNc7JOzbLiBjb9Tk9bP7KNcPI12ICuvzXQQKG"));

            productRepository.save(new Product(1,"Iphone 8", "IP8","Iphone generation 8th","phone",new BigDecimal(580),"Available"));
            productRepository.save(new Product(1,"Iphone X", "IPX","Iphone generation 10th","phone",new BigDecimal(890),"Available"));
        };
    }
}
