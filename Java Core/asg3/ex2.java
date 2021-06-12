package asg3;

import java.util.Random;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// q1
//		float a = 5240.5f;
//		float b = 10970.055f;
//		System.out.println("so la tron cua a la :"+a);
//		int c = (int) a;
//		int d = (int) b;
//		// in ra 2 so do
//		System.out.println("so la tron cua a la :"+c);
//		System.out.println("so la tron cua b la :"+d);
//		Question 2:
//			Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm
//			có số 0 ở đầu cho đủ 5 chữ số)
		Random rd = new Random();
		int songaunhien = rd.nextInt(99999);
		if (songaunhien < 10000)
			songaunhien = songaunhien * 10;
		System.out.println(songaunhien);
		// Question 3:
//			Lấy 2 số cuối của số ở Question 2 và in ra.
//			Gợi ý:
//			Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
//			Cách 2: chia lấy dư số đó cho 100 
		int haisocuoi = songaunhien % 100;
//		System.out.println(haisocuoi);
//		Exercise 2 (Optional): Default value
//		Question 1:
//		Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi
//		tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo):
//	Email: "Email 1"
//	Username: "User name 1"
//		FullName: "Full name 1"
//		CreateDate:	

		Account[] accs = new Account[5];
		for (int i = 0; i < accs.length; i++) {
			accs[i] =new  Account();
			accs[i].email = "email" + i;
			accs[i].fullname = "fullname" + i;
			accs[i].username = "user" + i;
		}
		q1();
		q2();
		q3();
//		Exercise 4: String
//		Question 1:
//		Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có
//		thể cách nhau bằng nhiều khoảng trắng );

		    	Scanner scanner = new Scanner(System.in);
		    	System.out.println("Moi ban nhap vap chuoi");
		        String str = scanner.nextLine();
		        System.out.print("Số từ của chuỗi đã cho là: "
		                + countWords(str));
	}
		 
         public static int countWords(String input) {
		        if (input == null) {
		            return -1;
		        }
		        int count = 0;
		        int size = input.length();
		        boolean notCounted = true;
		        for (int i = 0; i < size; i++) {
		        	System.out.println(input.charAt(i));
		        	// kiểm tra dấu cách, tab, xuống dòng.
		            if (input.charAt(i) != ' ' && input.charAt(i) != '\t' 
		                    && input.charAt(i) != '\n') {
		                if(notCounted) {
		                    count++;
		                    notCounted = false;
		                }
		            } else {
		                notCounted = true;
		            }
		        }
		        return count;
		    }
      
        	 
        	 
      
//	Question 4:
//		Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng
	public static void thuong2so() {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap a=");
		a = sc.nextInt();
		do {
			System.out.println("nhap b=");
			b = sc.nextInt();
			if (b == 0)
				System.out.println("nhap lai gia tri cua b");
		} while (b == 0);
		int thuong = (int) a / b;

		System.out.println("thuong :" + thuong);

	}

	// Exercise 3(Optional): Boxing & Unboxing
//	Question 1:
//		Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
//		Sau đó convert lương ra float và hiển thị lương lên màn hình (với số
//		float có 2 số sau dấu thập phân)
	public static void q1() {
//		Integer luong = 5000;
//		float luong1 = (float) luong;
//		System.out.println("%2.2f",luong1);

	}
//	Question 2:
//		Khai báo 1 String có value = "1234567"
//		Hãy convert String đó ra số int
	
	public static void q2()
	{
	 String  d= "12345";
	 int i = Integer.parseInt(d);
	 System.out.println(i);
	}
//	Question 3:
//		Khởi tạo 1 số Integer có value là chữ "1234567"
//		Sau đó convert số trên thành datatype int
//	
	public static void q3()
	{  Integer i =12345;
	  int b = Integer.valueOf(i);
	  System.out.println(i);
	
	}
	// ham string
	
	
	
	
	
	
	
	
	
	
	
	
}
