import java.util.ArrayList;

//This class is to record student's personal curriculum
public class Curriculum extends Course{

	private ArrayList<String> Monday = new ArrayList<>();
	private ArrayList<String> Tuesday = new ArrayList<>();
	private ArrayList<String> Wednesday = new ArrayList<>();
	private ArrayList<String> Thursday = new ArrayList<>();
	private ArrayList<String> Friday = new ArrayList<>();
	
	public Curriculum() {
		// TODO Auto-generated constructor stub
		addTuesday(1, "Java 程式設計(I) , 授課教師: 李昆翰 , time: 09:10~12:00 , 學分:3 , 教室:G512 , code:2001\t");
		addTuesday(2, "計算機概論 , 授課教師: 盧東華 , time: 15:10~18:00 , 學分:3 , 教室:G313 , code:2002");

		addWednesday(1, "英文(一) , 授課教師: 賴雅俐 , time: 08:10~10:00 , 學分:2 , 教室:C607 , code:6001\t");
		
		addThursday(1,"離散數學 , 授課教師: 梁世聰 , time: 09:10~12:00 ,學分:3 ,  教室:G313 , code:2003\t");
		addThursday(2,"微積分I , 授課教師: 吳威良 , time: 13:10~15:00 , 學分:3 , 教室:G313 , code:2004");
	}
	
	public void addMonday(int time, String course) {
		Monday.add(time-1,course);
	}

	public void removeMonday(int time) {
		Monday.remove(time-1);
	}
	
	public void addTuesday(int time, String course) {
		Tuesday.add(time-1,course);
	}

	public void removeTuesday(int time) {
		Tuesday.remove(time-1);
	}
	
	public void addWednesday(int time, String course) {
		Wednesday.add(time-1,course);
	}

	public void removeWednesday(int time) {
		Wednesday.remove(time-1);
	}
	
	public void addThursday(int time, String course) {
		Thursday.add(time-1,course);
	}

	public void removeThursday(int time) {
		Thursday.remove(time-1);
	}
	
	public void addFriday(int time, String course) {
		Friday.add(time-1,course);
	}

	public void removeFriday(int time) {
		Friday.remove(time-1);
	}
	
	public void addCu(String code) {
		switch(code) {
		case "1001" :
			addMonday(1, getnewMonday(0)+"\t");
				break;
		
		case "1002" :
			addMonday(1, getnewMonday(1)+"\t");
				break;
		
		case "1003" :
			addMonday(1, getnewMonday(2)+"\t");
				break;
			
		case "1004" :
			addMonday(1, getnewMonday(3)+"\t");
				break;
			
		case "5001" :
			addMonday(2, getnewMonday(4)+"\t");
				break;
				
		case "5002" :
			addMonday(2, getnewMonday(5)+"\t");
				break;
				
		case "5003" :
			addMonday(2, getnewMonday(6)+"\t");
				break;
				
		case "5004" :
			addMonday(2, getnewMonday(7)+"\t");
				break;
				
				
		case "1005" :
			addWednesday(2, getnewWednesday(0)+"\t");	
				break;
				
		case "1006" :
			addWednesday(2, getnewWednesday(1)+"\t");
				break;
				
		case "1007" :
			addWednesday(2, getnewWednesday(2)+"\t");
				break;
				
		case "1008" :
			addWednesday(2, getnewWednesday(3)+"\t");
				break;
				
		case "1009" :
			addFriday(1, getnewFriday(0)+"\t");
				break;
				
		case "1010" :
			addFriday(1, getnewFriday(1)+"\t");
				break;
				
		case "1011" :
			addFriday(2, getnewFriday(2)+"\t");
				break;
				
		case "1012" :
			addFriday(2, getnewFriday(3)+"\t");
				break;
				
		}
	}
	
	public void removeCu(String code) {
		switch(code) {
		case "1001" :
			removeMonday(1);
				break;
		
		case "1002" :
			removeMonday(1);
				break;
		
		case "1003" :
			removeMonday(2);
				break;
			
		case "1004" :
			removeMonday(2);
				break;
			
		case "1005" :
			removeWednesday(2);	
				break;
				
		case "1006" :
			removeWednesday(2);
				break;
				
		case "1007" :
			removeWednesday(2);
				break;
				
		case "1008" :
			removeWednesday(2);
				break;
				
		case "1009" :
			removeFriday(1);
				break;
				
		case "1010" :
			removeFriday(1);
				break;
				
		case "1011" :
			removeFriday(2);
				break;
				
		case "1012" :
			removeFriday(2);
				break;
		}
	}
	
	
	public String toString() {
		return "Monday:" + Monday + "\nTuesday" + Tuesday + "\nWednesday" + Wednesday
				+ "\nThursday" + Thursday + "\nFriday" + Friday + "\n";
	}
}