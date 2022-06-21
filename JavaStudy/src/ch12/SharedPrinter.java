package ch12;

//두 WorkerThread 스레드에 의해 동시 접근되는 공유 프린터
class SharedPrinter {
//synchronized를 생략하면
//한글과 영어가 한 줄에 섞여 출력되는 경우가 발생한다.
	 synchronized void print(String text) {
//Thread.yield();
		for (int i = 0; i < text.length(); i++)
			System.out.print(text.charAt(i));
		System.out.println();
	}
}

//스레드 클래스
class WorkerThread extends Thread {
	//스레드에서 사용하고자 하는 객체 타입으로 선js
	private SharedPrinter p; // 공유 프린터 주소
	private String[] text;

	public WorkerThread(SharedPrinter p, String[] text) {
		this.p = p;
		this.text = text;
	}

//스레드는 반복적으로 공유 프린터에 10번 접근 text[] 출력
	@Override
	public void run() {
		for (int i = 0; i < text.length; i++) // 한 줄씩 출력
			p.print(text[i]); // 공유 프린터에 출력
	}
}