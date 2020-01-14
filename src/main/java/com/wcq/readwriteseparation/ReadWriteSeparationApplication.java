package com.wcq.readwriteseparation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


/**
 * exclude = {DataSourceAutoConfiguration.class}
 * 表明是不使用DataSourceAutoCOnfiguration.class,因为我们的是多个数据源，不能默认使用一个单数据源，所以要加上这个。
 * @author Administrator
 *
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan(value = "com.wcq.readwriteseparation.mapper")
public class ReadWriteSeparationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadWriteSeparationApplication.class, args);
	}

}
