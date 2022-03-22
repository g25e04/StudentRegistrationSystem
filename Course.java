import java.util.ArrayList;

public class Course {
	
	
	private ArrayList<Object> newMonday = new ArrayList<>();
	private ArrayList<Object> newTuesday = new ArrayList<>();
	private ArrayList<Object> newWednesday = new ArrayList<>();
	private ArrayList<Object> newThursday = new ArrayList<>();
	private ArrayList<Object> newFriday = new ArrayList<>();
	

	public Course() {
		// TODO Auto-generated constructor stub
//course : time ,code
		newMonday.add("中國繪畫賞析 , 授課教師: 何培齊 , time: 08:10~10:00 , 學分:2 , 教室:C513 , code:1001\n");
		newMonday.add("流行音樂 , 授課教師: 白偉毅 , time: 08:10~10:00 , 學分:2 , 教室:A416 , code:1002	\n");
		newMonday.add("職涯分析與規劃 , 授課教師: 蔡佩蓉 , time: 08:10~10:00 , 學分:2 , 教室:G401 , code:1003\n");
		newMonday.add("健康與生活 , 授課教師: 黃遵誠 , time: 08:10~10:00 , 學分:2 , 教室:G415 , code:1004\n");
		newMonday.add("國文(一) , 授課教師: 劉靜怡 , time: 10:10~12:00 , 學分:2 , 教室:C213 , code:5001\n");
		newMonday.add("國文(一) , 授課教師: 陶子珍 , time: 10:10~12:00 , 學分:2 , 教室:C506 , code:5002\n");
		newMonday.add("國文(一) , 授課教師: 楊馥菱 , time: 10:10~12:00 , 學分:2 , 教室:C510 , code:5003\n");
		newMonday.add("國文(一) , 授課教師: 翁燕玲 , time: 10:10~12:00 , 學分:2 , 教室:T505 , code:5004\n");
		
		newTuesday.add("Java 程式設計(I) , 授課教師: 李昆翰 , time: 09:10~12:00 , 學分:3 , 教室:G512 , code:2001\n");
		newTuesday.add("計算機概論 , 授課教師: 盧東華 , time: 15:10~18:00 , 學分:3 , 教室:G313 , code:2002\n");
		
		newWednesday.add("英文(一) , 授課教師: 賴雅俐 , time: 08:10~10:00 , 學分:2 , 教室:C607 , code:6001\n");
		newWednesday.add("撞球 , 授課教師: 林廣建 , time: 10:10~12:00 , 學分:2 , 教室:7F撞球場 , code:1005\n");
		newWednesday.add("羽球 , 授課教師: 黃紹禮 , time: 10:10~12:00  , 學分:2 , 教室:GB2籃球場 , code:1006\n");
		newWednesday.add("桌球 , 授課教師: 曾文錄 , time: 10:10~12:00  , 學分:2 , 教室:B106桌球教室 , code:1007\n");
		newWednesday.add("籃球 , 授課教師: 張慧瑛 , time: 10:10~12:00  , 學分:2 , 教室:B403籃球場 , code:1008\n");
		
		newThursday.add("離散數學 , 授課教師: 梁世聰 , time: 09:10~12:00 , 學分:3 , 教室:G313 , code:2003\n");
		newThursday.add("微積分I , 授課教師: 吳威良 , time: 13:10~15:00 , 學分:3 , 教室:G313 , code:2004\n");
		
		newFriday.add("基礎日語 , 授課教師: 村中恒仁 , time: 08:10~10:00  , 學分:2 , 教室:TB107 , code:1009\n");
		newFriday.add("基礎西班牙語 , 授課教師: 馬德睿 , time: 08:10~10:00  , 學分:2 , 教室:G302 , code:1010\n");
		newFriday.add("基礎德語 , 授課教師: 林吟霞 , time: 10:10~12:00  , 學分:2 , 教室:G314 , code:1011\n");
		newFriday.add("數據資訊自動化 , 授課教師: 陳億成 , time: 10:10~12:00  , 學分:2 , 教室:G521 , code:1012\n");
	}

	public Object getnewMonday(int code) {
		return newMonday.get(code);
	}

	public Object getnewWednesday(int code) {
		return newWednesday.get(code);
	}
	
	public Object getnewFriday(int code) {
		return newFriday.get(code);
	}
	
	public String toString() {
		return "Monday:" + newMonday + "\n\n\nTuesday" + newTuesday + "\n\n\nWednesday" + newWednesday
				+ "\n\n\nThursday" + newThursday + "\n\n\nFriday" + newFriday + "\n";
	}
	
	
}
