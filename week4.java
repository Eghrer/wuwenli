public class dog {

	private String name;
	private int age;
	private String color;
	
	public dog() {
		super();
	}

	public dog(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "dog [name=" + name + ", age=" + age + ", color=" + color + "]";
	}
	
	
	
	
	
	
	
	
}



public class dogDriver {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//名字，年龄，颜色；
		dog dog1 = new dog("旺财",5,"black");
		dog dog2 = new dog();
		
		
		dog2.setName("财旺");
		dog2.setAge(4);
		dog2.setColor("white");
		
		System.out.println(dog1.toString());
		System.out.println(dog2.toString());
	}

}



public class User {

	private String userName;
	private int key;
	public static int userNum = 2;
	
	public User(){
		
	}
	
	public User(String userName) {
		this.userName = userName;
	}
	public User(String userName, int key) {
		this.userName = userName ;
		this.key = key;
		
	}
	
	public int getKey() {
		return key;
	}
	public void setkey(int key) {
		this.key = key;
	}
	
	@Override
	public String toString() {
		return ("用户[userName:"+userName+" key:"+key+"]");
	}
	
}





public class UserDriver {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		User user1 = new User("张三",12123);
		User user2 = new User("赵四");
		
		user2.setkey(17178);
		
		System.out.println(user1);
		System.out.println(user2);
		System.out.println("用户数："+User.userNum);
		
		
	}

}




