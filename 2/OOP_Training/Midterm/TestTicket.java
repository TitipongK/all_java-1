package Midterm;
import java.util.Scanner;

public class TestTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket tic = new Ticket();
		Scanner sc = new Scanner(System.in);
		System.out.print("Level: "); String level = sc.nextLine();
		System.out.print("Number: "); double number = sc.nextDouble();
		char lv = level.charAt(0);
		tic.setLevel(lv);
		tic.setNumber((int) number);
		
		double hours = tic.getNetPay(number);
		System.out.printf("Price : %.2f",hours);
	}
	

}
