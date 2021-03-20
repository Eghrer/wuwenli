package wb;

import java.util.Scanner;

public class week2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int nums;
		int he;
		int wei[]=null;
		wei=new int[7];
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(n);
		
		for(num=(int)Math.pow(10, n-1);num<(int)Math.pow(10, n);num++){
			nums=num;
			he=0;
			for(int i=0;i<n;i++){
				wei[i]=nums%10;
				nums=(nums-wei[i])/10;
				
			}
			for(int i=0;i<n;i++){
				he=he+(int)Math.pow(wei[i], n);
			}
			if(he==num){
				System.out.println(num);
			}
			
		}
				
	}
}
/*package wb;

public class week2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cheng;
		int count=0;
		for(cheng=1;cheng<6;cheng++) {
			count=0;
			int cheng77777777 = 0;
			for(int i=0;i<2*(5-cheng77777777);i++) {
				System.out.print(" ");
				count++;
			}
			System.out.print("*");
			count++;
			for(int j=0;j<(cheng-1);j++) {
				System.out.print("  *");
				count=count+3;
			}
			while(count<13){
				System.out.print(" ");
				count++;
			}
			System.out.println("");
		}
	}

}
*/
