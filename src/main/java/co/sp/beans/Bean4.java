package co.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Bean4 {
	
	@Autowired
	@Qualifier("d1")
	private Data1 d1;
	
	@Autowired
	@Qualifier("d2")
	private Data2 d2;

	public Data1 getD1() {
		return d1;
	}

	public Data2 getD2() {
		return d2;
	}
	
	
}
