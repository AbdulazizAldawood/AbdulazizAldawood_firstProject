import java.util.Scanner;
public class simple {

	public static void main(String[]args){
		
	Scanner s=new Scanner (System.in);
	int[] array=new int[3];
	for(int i = 0 ; i < array.length ; i++){
		System.out.println("please enter the elment of index "+i);
		array[i] = s.nextInt();
	}
	for(int i=0 ; i<3 ; i++){
		System.out.println(array[i]);
	}
}
}