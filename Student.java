
public class Student implements User{

	
	private String name; //student's name
	private String ID; //student's ID
	private String gender; //boy or girl
	private String department; //
	private String address;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
		name = "Now unknown.";
		ID = "";
		gender = "Not input.";
		department = "Not input.";
		address = "Not input.";

	}

	
	public Student(String name, String ID, String gender, String department, String address) {
		setname(name);
		setID(ID);
		setgender(gender);
		setdepartment(department);
		setaddress(address);

	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public String getID() {
		return ID;
	}
	
	public void setID(String ID) {
		this.ID = ID;
	}
	
	public String getgender() {
		return gender;
	}
	
	public void setgender(String gender) {
		this.gender = gender;
	}
	
	public String getdepartment() {
		return department;
	}
	
	public void setdepartment(String department) {
		this.department = department;
	}
	
	public String getaddress() {
		return address;
	}
	
	public void setaddress(String address) {
		this.address = address;
	}
	

	
	public String toString() {
		return "Name:" + getname() + "\nID:" + getID() + "\nGender:" + getgender() + "\nDepartment:" 
				+ getdepartment() + "\nAddress:" + getaddress() + "\n";
	}
	
}
