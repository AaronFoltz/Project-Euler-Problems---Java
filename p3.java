public class p3{
	static int[] array = new int[5000];
	public static void main(String[] args){
		long x = 600851475143L;
		
		int square = (int) Math.sqrt(x);
		
        System.out.println("SQUARE: " + square);
        square--;

        for(int y = square; y>0; y=y-2){
			if((x%y)==0){
                System.out.println(y);
            }
        }
	}







}