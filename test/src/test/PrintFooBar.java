package test;

public class PrintFooBar {
	
	public static void main(String[] args) {
		
		performFooBar(1);
		
	}
	
	
	
	public static void performFooBar(int currentNo) {
		if(currentNo > 100) return ;
		if(currentNo % 5 ==0 && currentNo% 7==0) {
			System.out.println("FooBar");
			performFooBar(currentNo+1);
		}else if(currentNo % 5==0) {
			System.out.println("Foo");
			performFooBar(currentNo+1);
		}else if(currentNo % 7==0) {
			System.out.println("Bar");
			performFooBar(currentNo+1);
		}else {
			System.out.println(String.valueOf(currentNo));
			performFooBar(currentNo+1);
		}
		
	}

}
