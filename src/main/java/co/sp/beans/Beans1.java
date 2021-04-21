package co.sp.beans;

import org.springframework.stereotype.Component;

@Component
//싱글톤
//IoC컨테이너 객체를 생성할 때 자동으로 객체 생성됨
//타입을 통해 Bean객체 가져옴
public class Beans1 {
	public Beans1() {
		System.out.println("나와라 출력!");
	}
	
}
