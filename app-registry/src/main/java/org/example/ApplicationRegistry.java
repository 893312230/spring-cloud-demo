package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class ApplicationRegistry
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
        SpringApplication.run(ApplicationRegistry.class,args);
    }
}
