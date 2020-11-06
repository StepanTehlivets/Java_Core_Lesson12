package ua.academy.lgs1;

public class Deputy extends Human {
	private String surname;
	private String name;
	private int age;
	private boolean briber;
	private int bribeSize;

	public Deputy(String surname, String name, int age, boolean briber) {
		super();
		this.surname = surname;
		this.name = name;
		this.age = age;
		this.briber = briber;
	}

	public Deputy(String surname, String name) {
		super();
		this.surname = surname;
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Boolean isBriber() {
		return briber;
	}

	public void setBriber(boolean briber) {
		this.briber = briber;
	}

	public int getBribeSize() {
		return bribeSize;
	}

	public void setBribeSize(int bribeSize) {
		this.bribeSize = bribeSize;
	}

	@Override
	public String toString() {
		return "Deputy [surname=" + surname + ", name=" + name + ", age=" + age + ", briber=" + briber + "]";
	}

	public void giveBribe(int bribeSize) {
		if (!briber) {
			System.out.println("Deputy doesn't take bribes");
		} else {
			if (bribeSize > 5000) {
				System.out.println("Police arrest him");
			} else {
				this.bribeSize = bribeSize;
			}

		}

	}

}
