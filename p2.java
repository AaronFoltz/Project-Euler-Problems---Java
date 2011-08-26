public class p2{
	static int[] array = new int[5000];
	public static void main(String[] args){
		array[1] = 1;
		array[2] = 1;
		int total =0;
		int test;
		for(int x =3; x<5000;x++){
			array[x] = array[x-1] +array[x-2];
			test = array[x-1] +array[x-2];
			System.out.println(test);
			if(test>4000000){
				break;
			}else{
				if((test % 2)==0){
					total +=test;
					System.out.println("added");
				}
			}		
			
		}
		System.out.println(total);



	}







}
