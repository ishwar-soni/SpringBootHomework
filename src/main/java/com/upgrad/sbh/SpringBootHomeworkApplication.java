package com.upgrad.sbh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.sql.DataSource;

@SpringBootApplication
public class SpringBootHomeworkApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootHomeworkApplication.class, args);
		DataSource dataSource = context.getBean(DataSource.class);
	}

}
