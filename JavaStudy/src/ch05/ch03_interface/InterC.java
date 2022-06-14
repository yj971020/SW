package ch05.ch03_interface;

public interface InterC extends InterA,InterB {
	//void m1();
	//void m2();
	void m3();

}

class C implements InterC{

	@Override
	public void m1() {	
	}

	@Override
	public void m2() {
	}

	@Override
	public void m3() {
	}
	
}
