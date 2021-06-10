package testingsytem2;

import java.time.LocalDate;
import java.util.Random;

public class RANDO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		-- random 1  NGUYEN so ngau nhien
		
 Random Random = new Random();
   int i = Random.nextInt();
   System.out.println(+i);
     
	
	//-- random 1  thuc so ngau nhien
        Random Ran = new Random();
	   float b = Ran.nextFloat();
	   System.out.println(+b);
	   
	   
//	   Question 4:
//		   Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12-
//		   1995
	Random random = new Random();
	int minDay = (int) LocalDate.of(1995, 07, 24).toEpochDay();
	int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
	System.out.println(minDay);
	long randomInt = minDay + random.nextInt(maxDay - minDay);
	LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
	System.out.println(randomDay);
   // CAU lenh ham
	
	
	
	
	
	
	
	}	
	
}
