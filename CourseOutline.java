import java.util.ArrayList;

public class CourseOutline {

	private ArrayList<Object> initialMonday = new ArrayList<>();
	private ArrayList<Object> initialTuesday = new ArrayList<>();
	private ArrayList<Object> initialWednesday = new ArrayList<>();
	private ArrayList<Object> initialThursday = new ArrayList<>();
	private ArrayList<Object> initialFriday = new ArrayList<>();
	
	public CourseOutline() {
		// TODO Auto-generated constructor stub
		initialMonday.add("中國繪畫賞析 , 學分:2  , 最低修課年級:1 , 類別:選修\n");
		initialMonday.add("流行音樂 , 學分:2 , 最低修課年級:1 , 類別:選修\n");
		initialMonday.add("職涯分析與規劃 , 學分:2 , 最低修課年級:1 , 類別:選修\n");
		initialMonday.add("健康與生活 , 學分:2 , 最低修課年級:1 , 類別:選修\n");
		initialMonday.add("國文(一) , 學分:2 , 最低修課年級:1 , 類別:必選修");
		
		initialTuesday.add("Java 程式設計(I) , 學分:3 , 最低修課年級:1 , 類別:必修\n");
		initialTuesday.add("計算機概論 , 學分:3 , 最低修課年級:1 , 類別:必選修");
		
		initialWednesday.add("英文(一) , 學分:2 , 最低修課年級:1 , 類別:必修\n");
		initialWednesday.add("撞球 , 學分:2 , 最低修課年級:1 , 類別:選修\n");
		initialWednesday.add("羽球 , 學分:2 , 最低修課年級:1 , 類別:選修\n");
		initialWednesday.add("桌球 , 學分:2 , 最低修課年級:1 , 類別:選修\n");
		initialWednesday.add("籃球 , 學分:2 , 最低修課年級:1 , 類別:選修");
		
		initialThursday.add("離散數學 , 學分:3 , 最低修課年級:1 , 類別:必修\n");
		initialThursday.add("微積分I , 學分:3 , 最低修課年級:1 , 類別:必選修");
		
		initialFriday.add("基礎日語 , 學分:2 , 最低修課年級:1 , 類別:選修\n");
		initialFriday.add("基礎西班牙語 , 學分:2 , 最低修課年級:1 , 類別:選修\n");
		initialFriday.add("基礎德語 , 學分:2 , 最低修課年級:1 , 類別:選修\n");
		initialFriday.add("數據資訊自動化 , 學分:2 , 最低修課年級:1 , 類別:選修");
	}
	
	public String toString() {
		return "Monday:" + initialMonday + "\nTuesday" + initialTuesday + "\nWednesday" + initialWednesday
				+ "\nThursday" + initialThursday + "\nFriday" + initialFriday + "\n";
	}
	
}
	

