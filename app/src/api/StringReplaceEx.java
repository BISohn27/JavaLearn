package api;

public class StringReplaceEx {

	public static void main(String[] args) {
		String oldStr = "�ڹٴ� ��ü������ �Դϴ�, �ڹٴ� ǳ���� API�� �����մϴ�.";
		String newStr = oldStr.replace("�ڹ�", "JAVA");
		
		System.out.println("old: " + oldStr);
		System.out.println("new: " + newStr);

	}

}
