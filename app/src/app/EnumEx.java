package app;

/*
 * 	Ŭ����ó�� ���̰� �ϴ� ���
 * 	���� ���� �ִ� ������� ��� �ɺ����� ��Ī�� �������� ������ ��
 * 	Enum Ŭ�������� ������� �� Ŭ������ ����
 * 	���ο� �������� �����ϸ�, ���������� Enum Ŭ������ ����� ���ο� Ŭ�������� �������
 */
public class EnumEx {

	public static void main(String[] args) {
//		ex1)
//		String seoul = City.SEOUL;
//		System.out.println(seoul);
//		City c1 = City.valueOf("����");
//		System.out.println(c1+"\n\n");
		for(City c : City.values())
			System.out.println(c);
	}
	
	public enum City{
		//����� ����
		����,�뱸,�λ�,����,����
	}
}

//enum�� ���� �� ���
class City{
	public final static String SEOUL = "����";
	public static final String BUSAN = "�λ�";
	public static final String DAEGU = "�뱸";
	public final static String GWANGJU = "����";
	public final static String DAEJEON = "����";
}