package main;

import java.util.Objects;

public  class User implements UserInterface {// funksiyonal interface

	// instance variable - non-static variable
	// class variable - static variable
	
	// class və obyekt 
    // class qəlib funksiyasını yerinə yetirir obyekt bu qəlibdən çıxan məhsuldur.
	// class bir bina çertiyoju obyekt isə bina-dır 
	
    String name; 
	String  surName;
	int age;

	@Override
	public String lastName(String name, String surname) {
		return name + " "+surname;
	}
	
	{
		System.out.println("first");
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name, surName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return age == other.age && Objects.equals(name, other.name) && Objects.equals(surName, other.surName);
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", surName=" + surName + ", age=" + age + "]";
	}

	
	public   class InnerClass{
		int a;
	}
	
	
}
