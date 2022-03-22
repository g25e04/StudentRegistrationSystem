import java.util.Scanner;
public class Login{

	private String userid;
	private String password;
	
	Scanner input1 = new Scanner(System.in);
	Student s1 = new Student();
	public Login() {
		// TODO Auto-generated constructor stub
	}

	
	public Login(String userid, String password) {
		setuserid(userid);
		setpassword(password);
	}
	
	public void logininformation(String userid, String password) {
		setuserid(userid);
		setpassword(password);
	}
	
	public String getuserid() {
		return userid;
	}
	
	public void setuserid(String userid) {
		this.userid = userid;
		s1.setID(userid);
	}
	
	public String getpassword() {
		return password;
	}
	
	public void setpassword(String password) {
		this.password = password;
	}
	
	public void changeinformation(String name, String gender, String department, String address) {
		s1.setname(name);
		s1.setgender(gender);
		s1.setdepartment(department);
		s1.setaddress(address);
	}

	public String toString() {
		return s1.toString();
	}
}

