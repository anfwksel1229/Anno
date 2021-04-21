package co.sp.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import co.sp.beans.Bean1;
import co.sp.beans.Bean2;
import co.sp.beans.Bean3;
import co.sp.beans.Bean4;
import co.sp.beans.Bean5;
import co.sp.beans.Bean6;
import co.sp.beans.Data1;
import co.sp.beans.Data2;

@Configuration
public class ConfigClass {
	@Bean(initMethod = "init_1", destroyMethod = "destroy_1")
	@Lazy

	public Bean1 b1() {
		return new Bean1();
	}

	@Bean(initMethod = "init_2", destroyMethod = "des_2")
	@Lazy
	public Bean2 b2() {
		return new Bean2();
	}
	
	@Bean
	public Data1 d1() {
		return new Data1();
	}
	
	@Bean
	public Data2 d2() {
		return new Data2();
	}
	
	@Bean(autowire = Autowire.BY_NAME)
	public Bean3 b3() {
		return new Bean3();
	}
	
	@Bean
	public Bean4 b4() {
		return new Bean4();
	}
	
	@Bean
	public Bean5 b5() {
		return new Bean5();
	}
	@Bean
	public Bean6 b6() {
		return new Bean6();
	}

}
