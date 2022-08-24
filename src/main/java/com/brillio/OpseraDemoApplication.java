package com.brillio;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OpseraDemoApplication implements CommandLineRunner {

	@Override
	public void run(String args[]) throws Exception{
		System.out.println("Brillio Opsera Demo!");
	}

	public static void main(String[] args) {
		SpringApplication.run(OpseraDemoApplication.class, args);
	}

}
