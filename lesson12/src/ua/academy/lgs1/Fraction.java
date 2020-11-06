package ua.academy.lgs1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Fraction {
	private String name;
	private ArrayList<Deputy> members = new ArrayList<Deputy>();

	public Fraction(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Fraction [name=" + name + "]";
	}

	public void giveBribeToDeputy() {
		System.out.println("Please choose deputy to give him a bribe");
		System.out.println(members);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter deputy surname");
		String s = sc.next();
		System.out.println("Enter deputy name");
		String n = sc.next();
		System.out.println("Enter deputy age");
		int a = sc.nextInt();

		System.out.println("Does deputy take bribes?(Y/N)");
		boolean b = false;
		String briber = sc.next();

		while (true) {
			switch (briber) {
			case "Y": {
				b = true;
				break;
			}
			case "y": {
				b = true;
				break;
			}
			case "N": {
				b = false;
				break;
			}
			case "n": {
				b = false;
				break;
			}
			default: {
				System.out.println("Whong input");
			}
			}
			break;
		}
		System.out.println("Enter bribe size");

		int bribe = sc.nextInt();

		Deputy dp = new Deputy(s, n, a, b);
		Iterator<Deputy> iterator = members.iterator();

		while (iterator.hasNext()) {
			Deputy dep = iterator.next();

			if (dep.getSurname().equals(dp.getSurname()) && dep.getName().equals(dp.getName())
					&& dep.getAge().equals(dp.getAge()) && dep.isBriber().equals(dp.isBriber())) {
				dep.giveBribe(bribe);
			}
		}
	}

	public void addDeputy() {
		System.out.println("Please enter needed data to add deputy");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter deputy surname");
		String s = sc.next();
		System.out.println("Enter deputy name");
		String n = sc.next();
		System.out.println("Enter deputy age");
		int a = sc.nextInt();

		System.out.println("Does deputy take bribes?(Y/N)");
		boolean b = false;
		String briber = sc.next();

		while (true) {
			switch (briber) {
			case "Y": {
				b = true;
				break;
			}
			case "y": {
				b = true;
				break;
			}
			case "N": {
				b = false;
				break;
			}
			case "n": {
				b = false;
				break;
			}
			default: {
				System.out.println("Whong input");
			}
			}
			break;
		}

		Deputy dp = new Deputy(s, n, a, b);
		members.add(dp);
		System.out.println(members);
	}

	public void deleteDeputy() {
		System.out.println("Please enter needed data to delete deputy");
		System.out.println(members);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter deputy surname");
		String s = sc.next();
		System.out.println("Enter deputy name");
		String n = sc.next();
		System.out.println("Enter deputy age");
		int a = sc.nextInt();

		System.out.println("Does deputy take bribes?(Y/N)");
		boolean b = false;
		String briber = sc.next();

		while (true) {
			switch (briber) {
			case "Y": {
				b = true;
				break;
			}
			case "y": {
				b = true;
				break;
			}
			case "N": {
				b = false;
				break;
			}
			case "n": {
				b = false;
				break;
			}
			default: {
				System.out.println("Whong input");
			}
			}
			break;
		}

		Deputy dp = new Deputy(s, n, a, b);
		Iterator<Deputy> iterator = members.iterator();

		while (iterator.hasNext()) {
			Deputy dep = iterator.next();

			if (dep.getSurname().equals(dp.getSurname()) && dep.getName().equals(dp.getName())
					&& dep.getAge().equals(dp.getAge()) && dep.isBriber().equals(dp.isBriber())) {
				iterator.remove();
			}

		}
		System.out.println(members);

	}

	public void getListOfBribers() {
		Iterator<Deputy> iterator = members.iterator();
		while (iterator.hasNext()) {
			Deputy dp = iterator.next();
			if (dp.isBriber() == true) {
				System.out.println(dp);
			}
		}

	}

	public void getBiggestBriber() {

		Collections.sort(members, new DeputyBribeSizeComparator());

		System.out.println(members.get(0));
	}

	public void printListOfDeputies() {

		Iterator<Deputy> iterator = members.iterator();
		while (iterator.hasNext()) {
			Deputy dp = iterator.next();
			System.out.println(dp);
		}
		
		if(members.isEmpty()) {
			System.out.println("There is no deputy in fraction");
		}
	}

	public void clearFraction() {

		members.clear();
	}

}
