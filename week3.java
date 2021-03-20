package wb;

import java.util.Scanner;

public class week3 {
/*public static double score[];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int choose=menu();
			while(choose!=5){
				switch(choose){
				case 1:input();break;
				case 2:average();break;
				case 3:highest();break;
				case 4:lowest();break;
				default:System.out.println("not choose or choose error,please choose again");break;
				}
				choose=menu();
			}
			System.out.println("exit,welcome use me again");
	}
	public static int menu(){
		int choice=0;
		System.out.println("=======bank mune=======");
		System.out.println("1:input");
		System.out.println("2:average   3:highest");
		System.out.println("4:lowest   5:exit");
		System.out.print("please choose(1-5):");
		Scanner scan=new Scanner(System.in);
		choice=scan.nextInt();
		return choice;
	}
	
	public static void input(){
		score=new double[5];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<score.length;i++){
			score[i]=scan.nextDouble();
		}
	}
	
	public static void average(){
		double average=0;
		for(int i=0;i<score.length;i++){
			average+=score[i];
		}
		System.out.println("average="+(average/score.length));
	}
	
	public static void highest(){
		double max=score[0];
		for(int i=1;i<score.length;i++){
			if(score[i]>max){
				max=score[i];
			}
		}
		System.out.println("highest score is:"+max);
	}
	
	public static void lowest(){
		double min=score[0];
		for(int i=1;i<score.length;i++){
			if(score[i]<min){
				min=score[i];
			}
		}
		System.out.println("lowest score is:"+min);
	}
}
*/
	public static void main(String[] args) {
		int number;
		int success=0;
		number=1+(int)(Math.random()*1000);
		System.out.println(number);
		System.out.println("i have a number between 1 to 1000");
		System.out.println("can you guess this number?");
		System.out.println("type your guess !");
		
		Scanner scan=new Scanner(System.in);
		int j=1;
		while(true){
			int i;

			System.out.println("this is your "+j+" play");
			for(i=0;i<5;i++){
				int guess=scan.nextInt();
				if(guess==number){
					System.out.println("Excellent! you guess the number!");
					success++;
					break;
				}
				else{
					if(guess<number){
						System.out.println("too low! please guess it again!");
					}
					else{
						System.out.println("too hign! please guess it again!");
					}
				}	
				System.out.println("left"+(5-i));
			}
			if(success==1){
				System.out.println("success,you cost "+i);
			}
			else{
				System.out.println("you fail!");
			} 
			System.out.println("Game over!");
			
			
			System.out.println("if you want to play it again?");
			System.out.println("if yes print 1,if not print 0");
			int chance=scan.nextInt();
			if(chance!=1){
				break;
			}
			++j;
		}
	}
	}
