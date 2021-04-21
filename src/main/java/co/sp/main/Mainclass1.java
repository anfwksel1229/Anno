package co.sp.main;

import java.beans.Beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.sp.beans.Beans1;
import co.sp.beans.Beans2;
import co.sp.beans.Beans3;
import co.sp.beans.Beans4;
import co.sp.beans.Beans5;

import co.sp.config.ConfigClass1;

public class Mainclass1 {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(ConfigClass1.class);

		Beans2 c1 = ctx2.getBean("aa", Beans2.class);
		System.out.println(c1);

		Beans2 c2 = ctx2.getBean("aa", Beans2.class);
		System.out.println(c2);

		Beans3 c3 = ctx2.getBean(Beans3.class);
		System.out.println(c3);

		Beans3 c4 = ctx2.getBean(Beans3.class);
		System.out.println(c4);

		Beans4 a1 = ctx2.getBean(Beans4.class);
		System.out.println(a1);
	}

}
