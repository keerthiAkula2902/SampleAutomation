package org.javaprograms;

public class TryCatchFinal {

	public static void main(String[] args) {
		TryCatchFinal obj = new TryCatchFinal();
		obj.test();

	}

	public void test() {
		int i = 0;
		// ternary operator
		int a = 5 > 10 ? 100 : 200;
		String str = null;
		try {
			 i = 5 / 0;
			str.length();
		} catch (ArithmeticException e) {
		//	System.out.println(e);

		} catch (NullPointerException e) {
		//	System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
		//	System.out.println(e);

		} finally {
			System.out.println("finally block executed");

		}

	}

}
