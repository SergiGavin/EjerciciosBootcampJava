package ejOperadoresRelacion;

public class ejOperadoresRelacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short num1 = 1;
		short num2 = 2;
		short num3 = 3;
		short num4 = 2;
		System.out.println(num4 == num2);
		System.out.println(num2 == num3);
		System.out.println(num1 != num3);
		System.out.println(num2 != num2);
		System.out.println(num4 < num3);
		System.out.println(num3 < num1);
		System.out.println(num1 > num3);
		System.out.println(num2 > num4);
		System.out.println(num2 > num3);
		System.out.println(num2 <= num3);
		System.out.println(num2 <= num1);
		System.out.println(num1 >= num2);
		System.out.println(num2 >= num1);
		System.out.println(num2 >= num2);
	}
}
