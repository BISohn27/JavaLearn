package app;

public class Exception2Ex {

	public static void main(String[] args) {//throws Exception {
		try {	
		login("aaa","123");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void login(String id, String pw) throws NoExistIDException, WrongPasswordException{
		//id�� aaa�� �ƴ϶�� NoExistIDException �߻�
		if(!id.equals("aaa")) {
		throw new NoExistIDException("���̵� �������� �ʽ��ϴ�.");
		}
		//pw 111�� �ƴ϶�� WrongPasswordException �߻�
		if(!pw.equals("111")) {
			throw new WrongPasswordException("�н����尡 Ʋ���ϴ�.");
		}
	}
}
