package com.sb.main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("com.sb")
public class SbStarter {
	
	public static void main(String[] args) {
        SpringApplication.run(SbStarter.class, args);
    }

}
