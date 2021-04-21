package co.sp.beans;

import javax.annotation.Resource;

public class Bean5 {
	@Resource
	private Data1 d1;
	
	@Resource
	private Data2 d2;

	public Data1 getD1() {
		return d1;
	}

	public Data2 getD2() {
		return d2;
	}
}
