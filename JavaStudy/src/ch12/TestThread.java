package ch12;

public class TestThread {
	public static void main(String[] args) {
		//스레드 객체 생성
		TimerThread th=new TimerThread();
		//스레드 시작  : th 객체의 run 메소드 실행
		//th.run();
		th.start();
		
		//스레드 객체 하나 더 만듦
		TimerThread th1= new TimerThread();
		//th1.run(); //run 으로 하면 싱글 스레드 방식임.. 먼저꺼가 끝나야 실행
		th1.start();
	}

}
