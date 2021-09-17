package InputOutput;

/*
 * 	���
 * 	- ��Ʈ�� : �Ϲ������� ������, ��Ŷ ���� �Ϸ��� ���Ӽ��� ���� �帧�� �ǹ��Ѵ�.(�帣�� ������ - ���� �帧)
 * 	- ��,��� ��Ʈ��: �����͸� �а� ���� ������ ���α׷��� ������ �𵨸� �� ���� ��
 * 	- ����: �����͸� �ӽ������� ��Ƶδ� ����
 * 
 * 	�ڹ��� ����� ��Ʈ�� ����
 * 	- �� �������� �帧
 * 	- ���۸� ���� �� �ִ�.
 * 	- FIFO(First In First Out)�� ����
 * 	- ����(Character Stream), ����Ʈ(Byte Stream)�� �з���.
 *
 * 	���� (Character Stream) ���� �ֻ��� ��Ʈ��
 * 	-Reader class
 * 		�Է� ��Ʈ�� : ���� �����͸� �о� ���̴� ��Ʈ��
 * 	-Writer class
 * 		��� ��Ʈ�� : ���� �����͸� ����ϱ� ���� ��Ʈ��
 * 
 * 	����Ʈ (Byte Stream) ����Ʈ �ֻ��� ��Ʈ��
 * 	-InputStream class
 * 		�Է� ��Ʈ�� : ����Ʈ �����͸� �о� ���̴� ��Ʈ��
 * 			(�Է� �ֻ��� ��Ʈ��)
 * 	-OutputStream class
 * 		��� ��Ʈ�� : ����Ʈ �����͸� ����ϱ� ���� ��Ʈ��
 * 			(��� �ֻ��� ��Ʈ��)
 */
public class IO1Ex {
	public void consoleCharIn() {
		System.out.print("�Է�: ");
		byte[] data = new byte[2];
		try {
			System.in.read(data);
		}catch(Exception e) {
			e.printStackTrace();
		}
		String str = new String(data,0,2);
		System.out.println("���: " + str);
	}
	
	public void consoleByteIn() {
		System.out.println("�Է�: ");
		char c = ' ';
		try {
			c = (char)System.in.read();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("���: " + c);
	}
	
	public static void main(String[] args) {
		IO1Ex ex = new IO1Ex();
		ex.consoleByteIn();
		ex.consoleCharIn();
	}
}