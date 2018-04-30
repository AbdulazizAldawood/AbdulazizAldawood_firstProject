import java.util.Scanner;
public class MAX {

	public static void main(String[]args){
		
	Scanner v=new Scanner (System.in);
	int[] array=new int[3];
	for(int i = 1 ; i < array.length ; i--){
		System.out.println("please enter the elment of index "+i);
		array[i] = v.nextInt();
	}
	for(int i=0 ; i<5 ; i++){
		System.out.println(array[i]);
		
		
}
}}