import java.util.ArrayList;

public class CourseOutline {

	private ArrayList<Object> initialMonday = new ArrayList<>();
	private ArrayList<Object> initialTuesday = new ArrayList<>();
	private ArrayList<Object> initialWednesday = new ArrayList<>();
	private ArrayList<Object> initialThursday = new ArrayList<>();
	private ArrayList<Object> initialFriday = new ArrayList<>();
	
	public CourseOutline() {
		// TODO Auto-generated constructor stub
		initialMonday.add("����ø�e��R , �Ǥ�:2  , �̧C�׽Ҧ~��:1 , ���O:���\n");
		initialMonday.add("�y�歵�� , �Ǥ�:2 , �̧C�׽Ҧ~��:1 , ���O:���\n");
		initialMonday.add("¾�P���R�P�W�� , �Ǥ�:2 , �̧C�׽Ҧ~��:1 , ���O:���\n");
		initialMonday.add("���d�P�ͬ� , �Ǥ�:2 , �̧C�׽Ҧ~��:1 , ���O:���\n");
		initialMonday.add("���(�@) , �Ǥ�:2 , �̧C�׽Ҧ~��:1 , ���O:�����");
		
		initialTuesday.add("Java �{���]�p(I) , �Ǥ�:3 , �̧C�׽Ҧ~��:1 , ���O:����\n");
		initialTuesday.add("�p������� , �Ǥ�:3 , �̧C�׽Ҧ~��:1 , ���O:�����");
		
		initialWednesday.add("�^��(�@) , �Ǥ�:2 , �̧C�׽Ҧ~��:1 , ���O:����\n");
		initialWednesday.add("���y , �Ǥ�:2 , �̧C�׽Ҧ~��:1 , ���O:���\n");
		initialWednesday.add("�вy , �Ǥ�:2 , �̧C�׽Ҧ~��:1 , ���O:���\n");
		initialWednesday.add("��y , �Ǥ�:2 , �̧C�׽Ҧ~��:1 , ���O:���\n");
		initialWednesday.add("�x�y , �Ǥ�:2 , �̧C�׽Ҧ~��:1 , ���O:���");
		
		initialThursday.add("�����ƾ� , �Ǥ�:3 , �̧C�׽Ҧ~��:1 , ���O:����\n");
		initialThursday.add("�L�n��I , �Ǥ�:3 , �̧C�׽Ҧ~��:1 , ���O:�����");
		
		initialFriday.add("��¦��y , �Ǥ�:2 , �̧C�׽Ҧ~��:1 , ���O:���\n");
		initialFriday.add("��¦��Z���y , �Ǥ�:2 , �̧C�׽Ҧ~��:1 , ���O:���\n");
		initialFriday.add("��¦�w�y , �Ǥ�:2 , �̧C�׽Ҧ~��:1 , ���O:���\n");
		initialFriday.add("�ƾڸ�T�۰ʤ� , �Ǥ�:2 , �̧C�׽Ҧ~��:1 , ���O:���");
	}
	
	public String toString() {
		return "Monday:" + initialMonday + "\nTuesday" + initialTuesday + "\nWednesday" + initialWednesday
				+ "\nThursday" + initialThursday + "\nFriday" + initialFriday + "\n";
	}
	
}
	

