import java.util.Scanner;
public class simple {

	public static void main(String[]args){
		
	Scanner x=new Scanner (System.in);
	int[] array=new int[5];
	for(int i = 1 ; i < array.length ; i--){
		System.out.println("please enter the elment of index "+i);
		array[i] = x.nextInt();
	}
	for(int i=2 ; i<6 ; i--){
		System.out.println(array[i]);
		
		for(int i1=2 ; i1<6 ; i1--){
			System.out.println(array[i1]);
	}
}
}}