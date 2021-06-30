package springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

    public static void main(String[] args) {


        // this line is what actually allows you to run the app.
        // SpringApplication is a built in class and .run is a built in method.
        // SpringApplication.run requires two arguments. First ist he class that is housing the main method and the second will be args argument from your main method
        // If you run this, it will start a server on port 8080
        SpringApplication.run(CourseApiApp.class, args);
    }
}

