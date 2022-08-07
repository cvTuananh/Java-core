package Alogithic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exLab02 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
        
		menuProgram();
        
    }
	
	private static void linearEquation() {
		System.out.println("exercise 01: giai phuong trinh bac nhat");
		int aNumber, bNumber;
        double nghiem;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
         
        System.out.println("Nhập vào số a: ");
        aNumber = scanner.nextInt();
        System.out.println("Nhập vào số b: ");
        bNumber = scanner.nextInt();
        System.out.println("Phương trình bạn vừa nhập vào là: " + aNumber + "x + " + bNumber + " = 0.");
        if (aNumber == 0) {
            if (bNumber == 0) {
                System.out.println("Phương trình này có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            nghiem = (double) -bNumber / aNumber;
            System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(nghiem) + ".");
        }
	}
	
	private static void quadraticEquation() {
		System.out.println("exercise 02: giai phuong trinh bac hai");
		System.out.print("Nhập hệ số bậc 2, a = ");
        float a = scanner.nextFloat();
        System.out.print("Nhập hệ số bậc 1, b = ");
        float b = scanner.nextFloat();
        System.out.print("Nhập hằng số tự do, c = ");
        float c = scanner.nextFloat();
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;
        }
        
        float delta = b*b - 4*a*c;
        float x1;
        float x2;

        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
	
	private static void electricityBill() {
		System.out.println("BT03: Electricity bill program");
		System.out.println("Enter the amount of electricity used");
		int numberUsed = scanner.nextInt();
		float toalBill;
		if(numberUsed < 50) {
			toalBill = numberUsed * 1000;
			System.out.printf("Your electricity bill this month is : " + toalBill);
		} else {
			toalBill = 50 * 1000 + (numberUsed - 50) * 1200;
			System.out.printf("Your electricity bill this month is : " + toalBill);
		}
	}
	
	private static void isPrime() {
		System.out.println("Prime number checker program");
		System.out.println("Please Input number you want ");
		int numberInput = scanner.nextInt();
		
		if (numberInput <= 1) {
			System.out.println("This is not prime");
		} else {
			for (int i = 2 ; i <= numberInput/2; i++) {
				if (numberInput % i == 0) {
					System.out.println("This is Prime");
					return;
				}
			}
		}
	}
	
	private static void menuProgram () {
		System.out.println("01: Linear Equation");
		System.out.println("02: Quadratic Equation");
		System.out.println("03: Electricity Bill");
		System.out.println("04: Checker Prime");
		System.out.println("05: Exit");
		System.out.println("Choice number you want");
		int choice = scanner.nextInt();
		switch(choice) {
		case 1: 
			linearEquation();
			menuProgram();
			break;
		case 2: 
			quadraticEquation();
			menuProgram();
			break;
		case 3:
			electricityBill();
			menuProgram();
			break;
		case 4: 
			isPrime();
			menuProgram();
			break;
		case 5: 
			break;
			
		}
		
	}
}
