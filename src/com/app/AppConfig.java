package com.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.app")
public class AppConfig {
  @Bean
  public College college() {
	  College c=new College();
	  c.setCllgId(12005);
	  c.setCllgName("RGUKT");
	  return c;
  }
  @Bean
  public Department csc() {
	  Department d=new Department();
	  d.setDeptName("csc");
	  d.setDeptNo(125);
	  return d;
  }
  @Bean
  public Department ece() {
	  Department d=new Department();
	  return d;
  }
}
