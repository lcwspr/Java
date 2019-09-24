import java.util.Scanner;


public class Demo01_GetMax{
	private static Scanner jin = new Scanner(System.in);
	public static void main(String [] args){
		System.out.println("请输入两个数字");
		// get two value
		int num01 = jin.nextInt();
		int num02 = jin.nextInt();
		System.out.println(getMax(num01, num02));

	}
	private static int getMax(int a, int b){
		return a > b ? a: b;

	}
}