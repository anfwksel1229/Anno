package co.sp.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Beans4 {
	public Beans4() {
		System.out.println("배가고파용");
	}
}
