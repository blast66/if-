import java.util.Scanner;
public class dac {
    public static void main(String []args) {
		int grade;

		
		Scanner intput = new Scanner(System.in);
		System.out.println("ENTER YOU grade");
		grade = intput.nextInt();
		
		if(grade<60){
		System.out.println("E");
		}
		
		else if (grade>=60 && grade<=69){
		System.out.println("D");
		}
		
		else if (grade>=70 && grade<=79){
		System.out.println("C");
		}
		
		else if (grade>=80 && grade<=89){
		System.out.println("B");
		}
		
		else if (grade>=90 && grade<=100){
		System.out.println("A");
		}
	}
	


}