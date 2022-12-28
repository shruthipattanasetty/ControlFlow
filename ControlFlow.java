package com.perscholas.controlflow_303_2_2;

import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
	  question1();
	  question2();
	  question3();
	  question4();
	  question5();
	  question6();
	  question7();

	}
	
	public static void question1() {
		/*Write a program that declares 1 integer variable x, 
		 * and then assigns 7 to it. Write an if statement to print out 
		 * “Less than 10” if x is less than 10. Change x to equal 15, 
		 * and notice the result (console should not display anything).
		 */
		int x=7;
		//int x=15;
		if(x<10) {
			System.out.println("Less than 10");
			System.out.println("______________________________________________________");
			System.out.println();
		}
	}
	
	public static void question2() {
		/*
		 * Write a program that declares 1 integer variable x, and then assigns 7 to it.
		 * Write an if-else statement that prints out “Less than 10” if x is less than
		 * 10, and “Greater than 10” if x is greater than 10. Change x to 15 and notice
		 * the result.
		 */
		//int x=7;
		int x = 15;
		if(x<10) {
			System.out.println("Less than 10");
		}else {
			System.out.println("Greater than 10");//prints out this when x=15
			System.out.println("______________________________________________________");
			System.out.println();
		}
	}
	
	public static void question3() {
		/*
		 * Write a program that declares 1 integer variable x, and then assigns 15 to
		 * it. Write an if-else-if statement that prints out “Less than 10” if x is less
		 * than 10; “Between 10 and 20” if x is greater than 10 but less than 20, and
		 * “Greater than or equal to 20” if x is greater than or equal to 20. Change x
		 * to 50 and notice the result.
		 */
		//int num=50;
		int num = 15;
		if(num<10) {
			System.out.println("Less than 10");
		}else if(num>10 && num <20) {
			System.out.println("Between 10 and 20");
		}else {
			System.out.println("Greater than or equal to 20");		
		}
		System.out.println("______________________________________________________");
		System.out.println();
	}
	
	public static void question4() {
		/*
		 * Write a program that declares 1 integer variable x, and then assigns 15 to
		 * it. Write an if-else statement that prints “Out of range” if the number is
		 * less than 10 or greater than 20 and prints “In range” if the number is
		 * between 10 and 20 (including equal to 10 or 20). Change x to 5 and notice the
		 * result.
		 */
		int num=15;
		//int num=5;
		if(num<10 || num>20) {
			System.out.println("Out of range"); 
		}else if(num>=10 && num <=20) {
			System.out.println("In range");
			System.out.println("______________________________________________________");
			System.out.println();
		}
	}
	
	public static void question5() {
		/*Write a program that uses if-else-if statements to print out grades 
		 * A, B, C, D, F according to the following criteria:
		 * A: 90-100
		 *B: 80-89
		 *C: 70-79
		 *D: 60-69
		 *F: <60
		 *Use the Scanner class to accept a number score from the user to 
		 *determine the letter grade. Print out “Score out of range” 
		 *if the score is less than 0 or greater than 100.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your score to see your grade");
		int x = sc.nextInt();
		if (x>90 && x<=100) {
			System.out.println("Your grade is A");
		}else if(x>=80 && x<=89) {
			System.out.println("Your grade is B");
		}else if(x>=70 && x<=79) {
			System.out.println("Your grade is c");
		}else if(x>=60 && x<=69) {
			System.out.println("Your grade is D");
		}else if(x<0 || x>100){
			System.out.println("Score out of range");
		}
			else {
		System.out.println("Your grade is F");
		
		}
		System.out.println("______________________________________________________");
		System.out.println();
	}
	
	public static void question6() {
		/*
		 * Write a program that accepts an integer between 1 and 7 from the user. Use a
		 * switch statement to print out the corresponding weekday. Print “Out of range”
		 * if the number is less than 1 or greater than 7. Do not forget to include
		 * “break” statements in each of your cases.
		 */
		System.out.println("Enter an value");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
    switch (x) {
    case 1:
        System.out.println("Sunday");
        break;
    case 2:
        System.out.println("Monday");
        break;
    case 3:
        System.out.println("Tuesday");
        break;
    case 4:
        System.out.println("Wednesday");
        break;
    case 5:
        System.out.println("Thursday");
        break;
    case 6:
        System.out.println("Friday");
        break;
    case 7:
        System.out.println("Saturday");
        break;
        default:System.out.println("Out of range");
        break;
    }
    sc.close();
    System.out.println("______________________________________________________");
	System.out.println();
	}
	
	public static void question7() {
		/*
		 * Create a program that lets the users input their filing status and income.
		 * Display how much tax the user would have to pay according to status and
		 * income. The U.S. federal personal income tax is calculated based on the
		 * filing status and taxable income. There are four filing statuses: Single,
		 * Married Filing Jointly, Married Filing Separately, and Head of Household. The
		 * tax rates for 2009 are shown below.
		 */
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your filing status and your income: ");
		String filingstatus = sc.nextLine();
		int income = sc.nextInt();
		if (filingstatus.equals("single")) {
			if(income<=8350) {
				double tax = income*0.1;
				System.out.println("you would have to pay " + tax + " for taxes.");
			}
			else if(8351<=income && income<=33950) {
				double tax = income*0.15;
				System.out.println("you would have to pay " + tax + " for taxes.");
			}
			else if(33951<=income && income<=82250) {
				double tax = income*0.25;
				System.out.println("you would have to pay " + tax + " for taxes.");
			}
			else if(82251<=income && income<=171550) {
				double tax = income*0.28;
				System.out.println("you would have to pay " + tax + " for taxes.");
			}
			else if(171551<=income && income<=372950) {
				double tax = income*0.33;
				System.out.println("you would have to pay " + tax + " for taxes.");
			}
			else if(income>=372951) {
				double tax = income*0.35;
				System.out.println("you would have to pay " + tax + " for taxes.");
			}
		}
		else if(filingstatus.equals("married filing jointly")) {
			if(income<=16700) {
				double tax = income*0.1;
				System.out.println("you would have to pay " + tax + " for taxes.");
			}
			else if (16701<=income && income<=67900) {
				double tax = income*0.15;
				System.out.println("you would have to pay " + tax + " for taxes.");
			}
			else if (67901<=income && income<=137050) {
				double tax = income*0.25;
				System.out.println("you would have to pay " + tax + " for taxes.");
			
			}
			else if (137051<=income && income<=208850) {
				double tax = income*0.28;
				System.out.println("you would have to pay " + tax + " for taxes.");
			}
			else if (208851<=income && income<=372950) {
				double tax = income*0.33;
				System.out.println("you would have to pay " + tax + " for taxes.");
			}
			else if (income>=372951) {
				double tax = income*0.35;
				System.out.println("you would have to pay " + tax + " for taxes.");
			}
		}
		else if(filingstatus.equals("married filing separately")) {
			if(income<=8350) {
				double tax = income*0.1;
				System.out.println("you would have to pay " + tax + " for taxes.");
			}
			else if(8351<=income && income<=33950) {
				double tax = income*0.15;
				System.out.println("you would have to pay " + tax + " for taxes.");
			}
			else if(33951<=income && income<=68525) {
				double tax = income*0.25;
				System.out.println("you would have to pay " + tax + " for taxes.");
			}
			else if(68526<=income && income<=104425) {
				double tax = income*0.28;
				System.out.println("you would have to pay " + tax + " for taxes.");
			}
			else if(104426<=income && income<=186475) {
				double tax = income*0.33;
				System.out.println("you would have to pay " + tax + " for taxes.");
			}
			else if(income>=186476) {
				double tax = income*0.35;
				System.out.println("you would have to pay " + tax + " for taxes.");
			}
		}
		else if(filingstatus.equals("head of household")) {
			if(income<=11950) {
				double tax = income*0.1;
				System.out.println("you would have to pay " + tax + " for taxes.");
			}
			else if(11951<=income && income<=45500) {
				double tax = income*0.15;
				System.out.println("you would have to pay " + tax + " for taxes.");
			}
			else if(45501<=income && income<=117450) {
				double tax = income*0.25;
				System.out.println("you would have to pay " + tax + " for taxes.");
			}
			else if(117451<=income && income<=190200) {
				double tax = income*0.28;
				System.out.println("you would have to pay " + tax + " for taxes.");
			}
			else if(190201<=income && income<=372950) {
				double tax = income*0.33;
				System.out.println("you would have to pay " + tax + " for taxes.");
			}
			else if(income>=372951) {
				double tax = income*0.35;
				System.out.println("you would have to pay " + tax + " for taxes.");
			}
			sc.close();
		}
    

	}
  
}
