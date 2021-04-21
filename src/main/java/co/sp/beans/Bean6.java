package co.sp.beans;

import javax.annotation.Resource;

public class Bean6 {
	@Resource(name="d1")
	private Data1 d11;

	@Resource(name="d2")
	private Data2 d22;

	public Data1 getD11() {
		return d11;
	}

	public Data2 getD22() {
		return d22;
	}
}
