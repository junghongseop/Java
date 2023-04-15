package exception;

public class Ex03 {
	public static void main(String[] args) throws InterruptedException {
		//try ~ catch는 너무 난발시 코드의 가독성을 헤침
		//- 따라서, 예외를 한 곳에서 처리하는 형태를 취한다
		//- 이떼, throws라고 해서 예외를 전자 시킬 수 있음
		
		//main에서 예외를 전가하게 되면 JVM이 받아서 처리한다
		
		for(int i = 5; i >= 1; i--) {
			System.out.println(i + "초");
			
			Thread.sleep(1000);
		}
				
	}
}
