package ch13.genericMethod;

public class BoxingMethodExam {

	public static void main(String[] args) {
		// generic method -> strong type checking
		
		Box<Integer> boxI = Util.<Integer>boxing(10);
		int intVaulue = boxI.get();
		System.out.println(intValue);
		
		Box<String> boxS = Util.boxing("홍진아");
		String strValue = boxS.get();
		System.out.println(strValue);
		
	}

}
