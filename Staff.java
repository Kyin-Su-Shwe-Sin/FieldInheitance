package FieldInheritance;

public class Staff extends Person{
	String school;
	double pay;
	
	public Staff(String name,String address,String school,double pay) {
		super(name, address);
		this.school=school;
		this.pay=pay;
	}
	public void showData() {
		System.out.println("Staff Information : ");
		System.out.println("Name :\t"+super.name+"\nAddress :\t"+super.address+"\nSchool :\t"+school+"\nPay :\t"+pay);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff s=new Staff("Sandar","Yangon","Computer",100000);
		s.showData();
		
	}

}
