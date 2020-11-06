package ua.academy.lgs1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class VerhovnaRada {
	private static VerhovnaRada single_instance = null;
	private ArrayList<Fraction> fractions = new ArrayList<Fraction>();

	private VerhovnaRada() {
	}

	public static VerhovnaRada VerhovnaRada() {
		// To ensure only one instance is created
		if (single_instance == null) {
			single_instance = new VerhovnaRada();
		}
		return single_instance;
	}

	public void addFraction() {
		System.out.println("Enter name of new fraction");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		Fraction fr = new Fraction(name);
		fractions.add(fr);
	}

	public void deleteFraction() {
		System.out.println("Enter name of fraction to be deleted");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		Fraction fr = new Fraction(name);
		Iterator<Fraction> iterator = fractions.iterator();
		while (iterator.hasNext()) {
			Fraction frac = iterator.next();
			if (frac.getName().equals(fr.getName())) {
				iterator.remove();
			}
		}

	}

	public void printFraction() {
		Iterator<Fraction> iterator = fractions.iterator();
		while (iterator.hasNext()) {
			Fraction frac = iterator.next();
			System.out.println(frac);
		}
	}

	public void showDeputies() {
		System.out.println("Enter name of fraction to show its deputies");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		Fraction fr = new Fraction(name);
		Iterator<Fraction> iterator = fractions.iterator();
		while (iterator.hasNext()) {
			Fraction frac = iterator.next();
			if (fr.getName().equals(frac.getName())) {
				frac.printListOfDeputies();
			}
		}
	}

	public void addDeputyToFraction() {
		System.out.println("Enter name of fraction to add deputy");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		Fraction fr = new Fraction(name);
		Iterator<Fraction> iterator = fractions.iterator();
		while (iterator.hasNext()) {
			Fraction frac = iterator.next();
			if (fr.getName().equals(frac.getName())) {
				frac.addDeputy();
			}
		}
	}

	public void deleteDeputyFromFraction() {
		System.out.println("Enter name of fraction to delete deputy");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		Fraction fr = new Fraction(name);
		Iterator<Fraction> iterator = fractions.iterator();
		while (iterator.hasNext()) {
			Fraction frac = iterator.next();
			if (fr.getName().equals(frac.getName())) {
				frac.deleteDeputy();
			}
		}
	}

	public void showBribers() {
		System.out.println("Enter name of fraction show its bribers");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		Fraction fr = new Fraction(name);
		Iterator<Fraction> iterator = fractions.iterator();
		while (iterator.hasNext()) {
			Fraction frac = iterator.next();
			if (fr.getName().equals(frac.getName())) {
				frac.getListOfBribers();
			}
		}
	}

	public void showBiggestBriber() {
		System.out.println("Enter name of fraction show who take more bribes");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		Fraction fr = new Fraction(name);
		Iterator<Fraction> iterator = fractions.iterator();
		while (iterator.hasNext()) {
			Fraction frac = iterator.next();
			if (fr.getName().equals(frac.getName())) {
				frac.getBiggestBriber();
			}
		}
	}

	public void clearFraction() {
		System.out.println("Enter name of fraction delete all deputies");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		Fraction fr = new Fraction(name);
		Iterator<Fraction> iterator = fractions.iterator();
		while (iterator.hasNext()) {
			Fraction frac = iterator.next();
			if (fr.getName().equals(frac.getName())) {
				frac.clearFraction();
			}
		}
	}
}
