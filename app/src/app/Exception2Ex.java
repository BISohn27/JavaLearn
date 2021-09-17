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
		//id가 aaa가 아니라면 NoExistIDException 발생
		if(!id.equals("aaa")) {
		throw new NoExistIDException("아이디가 존재하지 않습니다.");
		}
		//pw 111가 아니라면 WrongPasswordException 발생
		if(!pw.equals("111")) {
			throw new WrongPasswordException("패스워드가 틀립니다.");
		}
	}
}
