import java.util.*;

public class p1 {
	int total = 0;
	public p1(){
		for(int x = 0; x<1000;x=x+3){
			total +=x;	
		}
		for(int x = 0; x<1000;x=x+5){
			total+=x;
		}
		for(int x = 0; x<1000; x=x+15){
			total-=x;
		}
		System.out.println(total);
	}
	public static void main(String[] args){
		p1 p = new p1();
	}
}
