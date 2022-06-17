package ch07.ch02_collection;

import java.util.Objects;

public class Member implements Comparable<Member>{
	private int sno;
	private String name;
	
	public Member(int sno,String name) {
		this.sno=sno;
		this.name=name;
	}
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	//우리가 재정의해서 사용 ( 재정의 안하면 동등한 객체를 당연히 못찾음)
	@Override
	public int hashCode() {
		return Objects.hash(name, sno);
	}

	//equals 도 재정의 
	@Override
	public boolean equals(Object obj) {
		Member other = (Member) obj;
		return Objects.equals(name, other.name) && sno == other.sno;
	}

	@Override
	public String toString() {
		return "Member [sno=" + sno + ", name=" + name + "]";
	}

	@Override  //TreeSet 이용을 위해 작성
	public int compareTo(Member m) {
		return this.hashCode()-m.hashCode();
	}
}
