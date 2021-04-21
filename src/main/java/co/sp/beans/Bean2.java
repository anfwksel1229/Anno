package co.sp.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bean2 {

		public Bean2() {
			System.out.println("Bean2 생성자");
		}
		@PostConstruct
		public void init_2() { //생성자 호출이후 자동호출
			System.out.println("init2");
		}
		@PreDestroy
		public void des_2() { //소멸되기 전에 자동호출
			System.out.println("des2");
		}
}
