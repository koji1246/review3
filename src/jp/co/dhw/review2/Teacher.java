package jp.co.dhw.review2;

public class Teacher extends User {
	public String subject;
	Teacher(Integer id, String firstName, String lastName,String subject) {
		//�����킩��Ȃ�����
		super(id, firstName, lastName);
		this.subject = subject;
	}

	
	public String getSubject(){
		return subject;
		
	}
	

}
