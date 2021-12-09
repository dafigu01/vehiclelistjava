import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.lang.Boolean;


public class Driver {
	
	public static void main(String[] args) throws IOException {
		Scanner scnr = new Scanner(System.in);
		int numveh;
		
		System.out.println("How Many Vehicles Would You Like to Enter (Integer Only): ");
		numveh = scnr.nextInt();
		
		LinkedList <Vehicle> auto = new LinkedList<>();
		String make;
		String model;
		double milespergallon;
		String userinput;
		
		System.out.println();
		System.out.println();
		
		for(int i = 0; i < numveh; ++i) {
			System.out.println("Vehicle" + (i + 1) + ": ");
			System.out.println("Enter Vehicle Make: ");
			make = scnr.next();
			
			System.out.println("Enter Vehicle Model: ");
			model = scnr.next();
			
			System.out.println("Enter Vehicle Miles Per Gallon (Use 1 Decimal Place): ");
			userinput = scnr.next();
			
			while (!isDouble(userinput)) {
				System.out.println("Enter A Valid Miles Per Gallon (Ex. 45.5): ");
				userinput = scnr.next();
			}
			milespergallon = Double.parseDouble(userinput);
			
			
			Vehicle vehicle = new Vehicle(make, model, milespergallon);
			
			auto.add(vehicle);
			System.out.println();
			System.out.println();
		}
		Collections.sort(auto);
			
		System.out.println("Enter a File Name to Save Data (program will output in .txt format Don't use any spaces): ");
		String fileName = scnr.next();
			
		FileWriter writeit = new FileWriter(fileName);
			
		for (Vehicle vehicles: auto) {
				writeit.write(vehicles.toString() + System.lineSeparator());
		}
		writeit.close();
			
		System.out.println("Vehicle Data Has Successfully written to " + fileName);
		}

	public static boolean isDouble(String d) {
		try
		{
			Double.parseDouble(d);
			return true;
			
		}
		catch(NumberFormatException e) {
			System.out.println(d + " is not a valid double");
			return false;
		}
	}
		
	}


