package jp.co.dhw.review2;

public class User{
	public Integer id;
	public String firstName;
	public String lastName;
	
	public void showName(){
		System.out.println(this.firstName+":"+lastName);
	}
	//初期化　　＊ここ苦手＊
	User(Integer id,String firstName,String lastName){
		this.id = id;
		this.firstName =firstName;
		this.lastName = lastName;
	}

	public static void main(String[] args){
		//インスタンス生成
		User user1 = new User(1,"武田","憲隆 ");
		User user2 = new User(2,"高木 ","香 ");
		User user3 = new User(3,"柴田","伊織 ");
		User user4 = new User(4,"長尾","有希子 ");
		User user5 = new User(5,"酒見","真吾 ");
		User user6 = new User(6,"竹末","憲和 ");
		User user7 = new User(7,"国崎","宏治 ");
		User user8 = new User(8,"割鞘","洋介 ");
		User user9 = new User(9,"榎枝","大悟 ");
		User user10 = new User(10,"今田","尭  ");
		
		//10人分の表示
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
