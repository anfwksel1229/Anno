package co.sp.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bean2 {

		public Bean2() {
			System.out.println("Bean2 ������");
		}
		@PostConstruct
		public void init_2() { //������ ȣ������ �ڵ�ȣ��
			System.out.println("init2");
		}
		@PreDestroy
		public void des_2() { //�Ҹ�Ǳ� ���� �ڵ�ȣ��
			System.out.println("des2");
		}
}
