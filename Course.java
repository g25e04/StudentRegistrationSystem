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
		newMonday.add("����ø�e��R , �½ұЮv: ����� , time: 08:10~10:00 , �Ǥ�:2 , �Ы�:C513 , code:1001\n");
		newMonday.add("�y�歵�� , �½ұЮv: �հ��� , time: 08:10~10:00 , �Ǥ�:2 , �Ы�:A416 , code:1002	\n");
		newMonday.add("¾�P���R�P�W�� , �½ұЮv: ���ػT , time: 08:10~10:00 , �Ǥ�:2 , �Ы�:G401 , code:1003\n");
		newMonday.add("���d�P�ͬ� , �½ұЮv: ����� , time: 08:10~10:00 , �Ǥ�:2 , �Ы�:G415 , code:1004\n");
		newMonday.add("���(�@) , �½ұЮv: �B�R�� , time: 10:10~12:00 , �Ǥ�:2 , �Ы�:C213 , code:5001\n");
		newMonday.add("���(�@) , �½ұЮv: ���l�� , time: 10:10~12:00 , �Ǥ�:2 , �Ы�:C506 , code:5002\n");
		newMonday.add("���(�@) , �½ұЮv: ���L�� , time: 10:10~12:00 , �Ǥ�:2 , �Ы�:C510 , code:5003\n");
		newMonday.add("���(�@) , �½ұЮv: �οP�� , time: 10:10~12:00 , �Ǥ�:2 , �Ы�:T505 , code:5004\n");
		
		newTuesday.add("Java �{���]�p(I) , �½ұЮv: ������ , time: 09:10~12:00 , �Ǥ�:3 , �Ы�:G512 , code:2001\n");
		newTuesday.add("�p������� , �½ұЮv: �c�F�� , time: 15:10~18:00 , �Ǥ�:3 , �Ы�:G313 , code:2002\n");
		
		newWednesday.add("�^��(�@) , �½ұЮv: �ථ�W , time: 08:10~10:00 , �Ǥ�:2 , �Ы�:C607 , code:6001\n");
		newWednesday.add("���y , �½ұЮv: �L�s�� , time: 10:10~12:00 , �Ǥ�:2 , �Ы�:7F���y�� , code:1005\n");
		newWednesday.add("�вy , �½ұЮv: ����§ , time: 10:10~12:00  , �Ǥ�:2 , �Ы�:GB2�x�y�� , code:1006\n");
		newWednesday.add("��y , �½ұЮv: ����� , time: 10:10~12:00  , �Ǥ�:2 , �Ы�:B106��y�Ы� , code:1007\n");
		newWednesday.add("�x�y , �½ұЮv: �i�z�� , time: 10:10~12:00  , �Ǥ�:2 , �Ы�:B403�x�y�� , code:1008\n");
		
		newThursday.add("�����ƾ� , �½ұЮv: ��@�o , time: 09:10~12:00 , �Ǥ�:3 , �Ы�:G313 , code:2003\n");
		newThursday.add("�L�n��I , �½ұЮv: �d�¨} , time: 13:10~15:00 , �Ǥ�:3 , �Ы�:G313 , code:2004\n");
		
		newFriday.add("��¦��y , �½ұЮv: �����ڤ� , time: 08:10~10:00  , �Ǥ�:2 , �Ы�:TB107 , code:1009\n");
		newFriday.add("��¦��Z���y , �½ұЮv: ���w�� , time: 08:10~10:00  , �Ǥ�:2 , �Ы�:G302 , code:1010\n");
		newFriday.add("��¦�w�y , �½ұЮv: �L�u�� , time: 10:10~12:00  , �Ǥ�:2 , �Ы�:G314 , code:1011\n");
		newFriday.add("�ƾڸ�T�۰ʤ� , �½ұЮv: ������ , time: 10:10~12:00  , �Ǥ�:2 , �Ы�:G521 , code:1012\n");
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
