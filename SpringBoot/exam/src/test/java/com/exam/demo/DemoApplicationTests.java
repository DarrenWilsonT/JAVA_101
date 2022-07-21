package com.exam.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class DemoApplicationTests {

//	@Autowired
//	DataSource dataSource;

	@Test
	void contextLoads() {
//		System.out.println("获取的数据库连接为:"+dataSource.getConnection());
	}
}
