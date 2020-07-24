package FieldInheritance;

public class Student extends Person{
	 String program;
	 int year;
	 double fee;
	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program=program;
		this.year=year;
		this.fee=fee;
	}
	public void showData() {
		System.out.println("Student Information : ");
		System.out.println("Name :\t"+super.name+"\nAddress :\t"+super.address+"\nProgram :\t"+program+"\nYear :\t"+year+"\nFee :\t"+fee);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student("Aung Aung","Sagaing","Java",1,200000);
		s.showData();
	}

}
