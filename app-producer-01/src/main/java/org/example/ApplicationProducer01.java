package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ApplicationProducer01
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
        SpringApplication.run(ApplicationProducer01.class,args);
    }
}
