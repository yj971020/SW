package ch04.This;


class Manager extends Person{}

public class Member extends Person{
	static int seq;
	String name;
	String address;
	String phone;
	int sno;//회원넘버
	
	
	Member(String name){
		this.name=name;
		this.sno=seq++; //static 변수는 증가된 최종값만 가짐
	}
	Member(String name,String address){
		this(name);
		this.address=address;
	}
	Member(String name,String address, String phone){
		this(name,address);
		this.phone=phone;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String toString() {
		return "Member [sno="+sno+", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
	
	
	public static void main(String[] args) {
		Member yeajin= new Member("yeajin");
		yeajin.setAddress("덕소");
		Member sam= new Member("sam","usa");
		sam.setPhone("010-2222-2222");
		Member ari=new Member("ari","korea","010-1111-1111");
		ari.setName("ariana");
	
		System.out.println(yeajin.toString());
		System.out.println(	sam.toString());
		System.out.println(ari.toString());
		
		Person[] members= {yeajin,sam,ari};
		
		for(Person m :members) {
			System.out.println(m);
		}
	
		
	}
	

}
