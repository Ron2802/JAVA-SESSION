package Pr1.GenericDemo;

public class Service <T, U>{
	T t1;
	U s1;
	
	Service(T t1,U s1){
		this.t1=t1;
		this.s1=s1;
	}
	
	public void Display() {
		System.out.println(t1);
		System.out.println(s1);
	}
	
}
