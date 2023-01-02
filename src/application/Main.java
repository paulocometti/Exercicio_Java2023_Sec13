package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Worker worker;
		
		System.out.print("Enter department's name: ");
		String department = sc.next();
		
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Level: ");
		String level = sc.next();
		
		System.out.print("Salary: ");
		double salary = sc.nextDouble();
		
		worker = new Worker(name,
				WorkerLevel.valueOf(level),
				salary,
				new Department(department));
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Enter contract #"+i+" data:");
			System.out.print("Date (por enquanto somente o MM/YYYY): ");
			String date = sc.next();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int duration = sc.nextInt();
			worker.addContract(new HourContract(date, valuePerHour,duration));
		}
		
		System.out.println();
		System.out.println(worker);
		
		//System.out.print("Enter moth and year to calculate income (MM/YYYY): ");
		//String searchDate = sc.next();
		//System.out.println("Name: ");
		//System.out.println("Department: ");
		//System.out.println("Income for "+searchDate+": ");
		
		sc.close();
	}

}
