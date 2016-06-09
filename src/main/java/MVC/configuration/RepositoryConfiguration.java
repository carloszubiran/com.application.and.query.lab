package MVC.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by Carlos Zubiran on 6/9/2016.
 */

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"MVC.models"})
@EnableJpaRepositories(basePackages = {"MVC.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {



}
