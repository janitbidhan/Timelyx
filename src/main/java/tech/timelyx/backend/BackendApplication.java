package tech.timelyx.backend;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.File;

@SpringBootApplication
public class BackendApplication {

    @GetMapping("/")
    public File index() {
        return new File("src/main/resources/static/index.html");
    }
    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

//    private static void checkConnection() {
//        System.out.println("Connecting Checking");
//        ConnectionString connectionString = new ConnectionString("mongodb+srv://kriskrozr:timelyx@timelyx-cluster.pa3iipa.mongodb.net/?retryWrites=true&w=majority");
//        MongoClientSettings settings = MongoClientSettings.builder()
//                .applyConnectionString(connectionString)
//                .serverApi(ServerApi.builder()
//                        .version(ServerApiVersion.V1)
//                        .build())
//                .build();
//        MongoClient mongoClient = MongoClients.create(settings);
//        MongoDatabase database = mongoClient.getDatabase("test");
//        System.out.println("Connecting checked");
//    }

}
