public class classList {
	private int semester;
	private int year;
	private Subject sub;
	private Student s1;
	private Student s2;
	public classList(int semester, int year, Subject sub, Student s1, Student s2) {
		super();
		this.semester = semester;
		this.year = year;
		this.sub = sub;
		this.s1 = s1;
		this.s2 = s2;
	}
	public classList() {
		super();
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Subject getSub() {
		return sub;
	}
	public void setSub(Subject sub) {
		this.sub = sub;
	}
	public Student getS1() {
		return s1;
	}
	public void setS1(Student s1) {
		this.s1 = s1;
	}
	public Student getS2() {
		return s2;
	}
	public void setS2(Student s2) {
		this.s2 = s2;
	}
	
	
	public String toString() {
		String info="";
		info=this.year+"学年\t"+this.semester+"学期\n";
		info+=this.sub.toString()+"\n";
		info+="学号\t姓名\n";
		info+="=======================\n";
		info+=this.s1.toString()+"\n";
		info+=this.s2.toString();
		return info;
	}
	
	
}




import java.util.Scanner;

public class Driver {

	public static classList list=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choose=menu();
		while(choose!=3){
			switch(choose){
			case 1:createList();break;
			case 2:printList();break;
			default:System.out.println("无效的选择！");
			}
			choose=menu();
		}
		System.out.println("欢迎下次使用！");
	}
	
	public static int menu(){
		int choose=0;
		Scanner scan= new Scanner(System.in);
		System.out.println("========WTU选课系统=======");
		System.out.println("1:create list");
		System.out.println("2:print list");
		System.out.println("请输入操作选择:");
		choose=scan.nextInt();
		return choose;
	}

	public static void createList(){
		if(list != null) {
			System.out.println("是否重新输入？（y/n）：");
			Scanner scan = new Scanner(System.in);
			String ch = scan.next();
			if(ch.equals("n")) {
				return;
			}
		}
		
		Scanner scan= new Scanner(System.in);
		System.out.println("请输入学年:");
		int year=scan.nextInt();
		System.out.println("请输入学期（1-2）:");
		int semester=scan.nextInt();
		System.out.println("请输入学科代码:");
		String subid=scan.next();
		System.out.println("请输入学科名称:");
		String subname=scan.next();		
		System.out.println("请输入学生1姓名:");
		String s1name=scan.next();
		System.out.println("请输入学生1学号:");
		String s1id=scan.next();
		System.out.println("请输入学生2姓名:");
		String s2name=scan.next();
		System.out.println("请输入学生2学号:");
		String s2id=scan.next();
		Student s1=new Student(s1name,s1id);
		Student s2=new Student(s2name,s2id);
		Subject sub=new Subject(subname,subid);
		list=new classList(semester,year,sub,s1,s2);
	}
	
	public static void printList(){
		if(list == null) {
			System.out.println("请先输入！");
			return;
		}
		System.out.println(list.toString());
		
	}
}





public class Student {
	private String name;
	private String id;
	
	
	public Student() {
		super();
	}
	public Student(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return this.id+"\t"+this.name;
	}
	
	
}






public class Subject {
	private String name;
	private String id;
	public Subject(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	public Subject() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		String info="";
		info= "学科代码:"+this.id+"\t"+"学科名称:"+this.name;
		return info;
	}
	
}
