package co.sp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import co.sp.beans.Beans1;
import co.sp.beans.Beans2;
import co.sp.beans.Beans4;

@ComponentScan(basePackages = "co.sp.beans")

public class ConfigClass1 {

	@Bean
	public Beans1 sp1() {
		return new Beans1();
	}

	@Bean
	public Beans2 sp2() {
		return new Beans2();
	}

}
