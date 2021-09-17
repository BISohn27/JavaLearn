package DB;
/*	< �н� ��ǥ >
 * 	-�ڹٿ����� DB�� ����ϱ�(JDBC)
 * 	-JDBC(Java Database Connectivity)�� �ڹٿ��� �����ͺ��̽��� ������ �� �ֵ��� �ϴ� �ڹ� API�̴�.
 * 		(Java�� �� DB���� ���� �� ���� ���� ���α׷���)
 * 	-JDBC�� �����ͺ��̽����� �ڷḦ �����ϰų� ������Ʈ�ϴ� ����� �����Ѵ�.
 * 	-JDBC�� �����ͺ��̽� ���ǹ��� �����Ͽ� ������ �����ͺ��̽�
 * 		(relational database)�� �����͸� �˻�, �����ϴ� ����� �����մϴ�.
 * 	-DB�� ������ java�� ȯ�濡 �°� �ڽŵ� ȸ���� ��ǰ�� �´� ���� ����� ������ Ÿ������ �����Ѵ�.
 * 	-�������̽� ��� ���α׷���
 * 		���� ��ü�� ����ϴ� ����� �ƴ϶� �������̽� ��� ��ü�� ����ϴ� ������� ���α׷����Ѵ�.
 * 
 *  - Query
 *  	�����͸� ��ȸ�ϴ� �� ���Ǵ� ���� ���ڵ尡 ���� ������ ������ ������(select) ������ �̿� ���Ѵ�..
 *  - DML(Data Manipulation Language)
 *  	�����͸� ó���ϴ� �κ����� ���ڵ忡 ���ο� ���� �߰�(insert), ����(update)
 *  	����(delete)�ϴµ� ����ϴ� ����̴�.
 *  - DDL(Data Definition Language)
 *  	�����͸� �����ϴµ� ���Ǵ� ���� ���̺��̳� ������ ����(create)�ϰų� ����(drop)�ϴ� �������̴�.
 *  - DCL(Data Control Language)
 *  	�����͸� �����ϴ� �� ���Ǵ� ���� DDL�� ������ �����ϰ� �� �� ���� �ο�(grant)���� ���⿡ ���Ѵ�.
 *  - �⺻������ SQL�� ���� ��� ��� �����Ѵ�.
 *  	select, insert, update, delete
 */
public class DBEx {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(driver);
			System.out.println("�����ͺ��̽� ����̹� �ε� ����!");
		}catch(Exception e) {
			System.out.println("�����ͺ��̽� ����̹� �ε� ����!");		
		}
	}
	
}
