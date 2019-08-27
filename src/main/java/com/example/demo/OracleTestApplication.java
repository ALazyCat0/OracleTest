package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.zzh.pojo","com.zzh.controller","com.zzh.service"})
@MapperScan("com.zzh.dao")
public class OracleTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(OracleTestApplication.class, args);
	}

}
