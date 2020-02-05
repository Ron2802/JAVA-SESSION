package Generic.Generic_Example;

public class Service<T , U> {
	T t1;
	U u1;
	Service(T t1,U u1){
		this.t1 = t1;
		this.u1 = u1;
	}
	
	public void Sum(String t1, String t2) {
		System.out.println(t1+t2);
	}
	
	public T Sum(T t1, T t2) {
		 return t1;
	}
	public void Sum(int n, int n1) {
		System.out.println(n+n1);
	}
	
}
