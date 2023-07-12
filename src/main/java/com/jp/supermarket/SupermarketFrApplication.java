package com.jp.supermarket;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jp.supermarket.mapper") //扫描该包下的mapper文件
public class SupermarketFrApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupermarketFrApplication.class, args);
	}

}
