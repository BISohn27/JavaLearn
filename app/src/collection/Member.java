package collection;

public class Member {
	private String name;
	private int age;
	
	public Member(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return (this.name.equals(member.name)) && (member.age == this.age);
		}
		return false;
	}
	
	
}