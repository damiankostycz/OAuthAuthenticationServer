package bus.project.OAuth_AuthServer;

import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;



public class SecurityConfig {

    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(new SimpleMongoClientDatabaseFactory("mongodb+srv://damian:oRAhCnuhtl3g9138@cluster0.dzyi1is.mongodb.net/auth_server"));
    }


}

