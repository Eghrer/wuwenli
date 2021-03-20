package wb;

public class week1 {
	
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
