package chapter03;

public class Call {

	public static void main(String[] args) {
		Calculator calculator = new AddCalc();
		Integer result = calculator.calc(10, 5);
		System.out.println("계산 결과는 ("  + result + ")입니다.");
		
		Calculator calculator2 = new SubCalc();
		Integer result2 = calculator2.calc(10, 5);
		System.out.println("계산 결과는 ("  + result2 + ")입니다.");

	}

}
