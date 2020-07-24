package FieldInheritance;

public class Person {
	public String name;
	public String address;
	public Person(String name, String address) {
		this.name=name;
		this.address=address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
	     return "name : "+this.name+"  address : "+this.address;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person("Ko Ko", "Yangon");
		System.out.println(p.toString());
	}

}
