package co.sp.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import co.sp.beans.Bean1;
import co.sp.beans.Bean2;
import co.sp.beans.Bean3;
import co.sp.beans.Bean4;
import co.sp.beans.Bean5;
import co.sp.beans.Bean6;
import co.sp.config.ConfigClass;

public class MainClass {
	public static void main(String[] arg) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(ConfigClass.class);
		
		Bean1 b1=ctx.getBean("b1",Bean1.class);
		System.out.println(b1);
		
		Bean2 b2=ctx.getBean("b2",Bean2.class);
		System.out.println(b2);
		
		Bean3 b3=ctx.getBean("b3",Bean3.class);
		System.out.println(b3.getD1());
		System.out.println(b3.getD2());
		
		Bean4 b4=ctx.getBean("b4",Bean4.class);
		System.out.println(b4.getD1());
		System.out.println(b4.getD2());
		
		Bean5 b5=ctx.getBean("b5",Bean5.class);
		System.out.println(b5.getD1());
		System.out.println(b5.getD2());
		
		Bean6 b6=ctx.getBean("b6",Bean6.class);
		System.out.println(b6.getD11());
		System.out.println(b6.getD22());
		
		
		ctx.close();
	}
}
