package jp.co.dhw.review2;

public class User{
	public Integer id;
	public String firstName;
	public String lastName;
	
	public void showName(){
		System.out.println(this.firstName+":"+lastName);
	}
	//�������@�@��������聖
	User(Integer id,String firstName,String lastName){
		this.id = id;
		this.firstName =firstName;
		this.lastName = lastName;
	}

	public static void main(String[] args){
		//�C���X�^���X����
		User user1 = new User(1,"���c","���� ");
		User user2 = new User(2,"���� ","�� ");
		User user3 = new User(3,"�ēc","�ɐD ");
		User user4 = new User(4,"����","�L��q ");
		User user5 = new User(5,"����","�^�� ");
		User user6 = new User(6,"�|��","���a ");
		User user7 = new User(7,"����","�G�� ");
		User user8 = new User(8,"����","�m�� ");
		User user9 = new User(9,"�|�}","��� ");
		User user10 = new User(10,"���c","��  ");
		
		//10�l���̕\��
		user1.showName();
		user2.showName();
		user3.showName();
		user4.showName();
		user5.showName();
		user6.showName();
		user7.showName();
		user8.showName();
		user9.showName();
		user10.showName();
	}
}
