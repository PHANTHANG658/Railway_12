package testingsytem2;

import java.util.Date;
import java.util.Scanner;

public class Inputfromconsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Exercise 5: Input from console
//		Question 1:
//		Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình

		nhapso();
		nhapsothuc();
		nhaphovaten();
		nhapngaysinh();
		q8();
		songuyenduongchan();
	}

	public static void nhapso() {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("moi ban nhap so a, b, c");
		int a = Scanner.nextInt();
		int b = Scanner.nextInt();
		int c = Scanner.nextInt();
		System.out.println("ba so ban vua nhap la: " + a + ":" + b + ":" + c);
	}
	// nhap 2 so thuc

	public static void nhapsothuc() {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("moi ban nhap so a, b");
		float a = Scanner.nextInt();
		float b = Scanner.nextInt();

	}

	// viet chuong trinhc ho ng dung nhap ca ho va ten

	public static void nhaphovaten() {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("moi ban nhap ho:");
		String ho = Scanner.nextLine();
		System.out.println("moi ban nhap  ten:");
		String ten = Scanner.nextLine();

	}
	// viet chuong trinh cho nguoi dung nhap vao ngay sinh nhat cua ho

	public static void nhapngaysinh() {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("moi ban nhap ngay sinh:");
		int ngay = Scanner.nextInt();
		System.out.println("moi ban nhap  thang sinh:");
		int thang = Scanner.nextInt();

		System.out.println("moi ban nhap  nam sinh:");
		int nam = Scanner.nextInt();
		System.out.println("ngay sinh nhat la :" + ngay + "-" + thang + "-" + nam);
	}

//	Question 5:
//		Viết lệnh cho phép người dùng tạo account (viết thành method)
//		Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào
//		chương trình sẽ chuyển thành Position.Dev, Position.Test,
//		Position.ScrumMaster, Position.PM
//	
	public static void q5() {
		Account acc = new Account();
		Scanner Scanner = new Scanner(System.in);
		// nap thong tin cho tung acc ount moi
		System.out.println("id:");
		acc.id = Scanner.nextInt();
		System.out.println("email:");
		acc.email = Scanner.nextLine();
		System.out.println("fullname:");
		acc.fullName = Scanner.nextLine();
		int stt;
		System.out.println(" moi nhap so tu 1 den 4");
		stt = Scanner.nextInt();
		switch (stt) {
		case 1:
			Position ps1 = new Position();
			ps1.id = 1;
			ps1.PositionName = PositionName.DEV;
			acc.position = ps1;
			break;
		case 2:
			Position ps2 = new Position();
			ps2.id = 2;
			ps2.PositionName = PositionName.TEST;
			acc.position = ps2;
			break;
		case 3:
			Position ps3 = new Position();
			ps3.id = 3;
			ps3.PositionName = PositionName.PM;
			acc.position = ps3;
			break;
		case 4:

			Position ps4 = new Position();
			ps4.id = 4;
			ps4.PositionName = PositionName.SCRUM_MASTER;
			acc.position = ps4;
			break;

		}

	}

//	Question 6:
//		Viết lệnh cho phép người dùng tạo department (viết thành method)
	public static void q6() {
		department dep = new department();
		// nhap thg tin account
		Scanner Scanner = new Scanner(System.in);
		System.out.println("nhap id");
		dep.id = Scanner.nextInt();
		System.out.println("nhap departname");
		dep.departmentName = Scanner.nextLine();
		System.out.println("thong tin vua nhap la " + dep.id + " ten :" + dep.departmentName);
	}

	public static void nhapsochan() {
		int sochan;
		do {
			Scanner Scanner = new Scanner(System.in);
			sochan = Scanner.nextInt();
			if (sochan % 2 != 0)
				System.out.println("khong phai so chan nhap lai lan nua");
		} while (sochan % 2 == 0);
		System.out.println("so chan la :" + sochan);

	}

//	Question 8:
//		Viết chương trình thực hiện theo flow sau:
//		Bước 1:
//		Chương trình in ra text "mời bạn nhập vào chức năng muốn sử
//		dụng"
//		Bước 2:
//		Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account
//		Nếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo
//		department
//		Nếu người dùng nhập vào số khác thì in ra text "Mời bạn nhập
//		lại" và quay trở lại bước
//	
	public static void q8()
	{
	 int sonhapvao;
	 do {
	// nhap so cho san
		 Scanner Scanner = new Scanner(System.in);
		 System.out.println("so nhap vao la :");
		 sonhapvao =  Scanner .nextInt();
		 switch(sonhapvao)
		 { case 1:
			 q5();
			 break;
		 case 2 :
			 q6();
			default : 
			System.out.println("so nhap vao khac 1 va 2 yeu cayu nhap lai")	;
		 } }while (sonhapvao !=1 && sonhapvao !=2);
	 
	}
	 public static void q9()
	 { department department1 = new department();
		department1.id = 1;
		department1.departmentName = "sale";
		department department2 = new department();
		department2.id = 2;
		department2.departmentName = "pm";
		department department3 = new department();
		department3.id = 3;
		department3.departmentName = "mkt";
		Position posittion1 = new Position();
		posittion1.id = 1;
		posittion1.PositionName = PositionName.DEV;
		Position posittion2 = new Position();
		posittion2.id = 2;
		posittion2.PositionName = PositionName.PM;

		Position posittion3 = new Position();
		posittion3.id = 3;
		posittion3.PositionName = PositionName.PM;

		// tạo ra group
		Group group1 = new Group();
		group1.id = 1;
		group1.groupName = "phong mkt";
		// group1.createDate = LocalDate.now();
		Group group2 = new Group();
		group2.id = 2;
		group2.groupName = "phong sale";
		// group1.createDate = LocalDate.now();
		Group group3 = new Group();
		group3.id = 3;
		group3.groupName = "phong dev";
		// group1.createDate = LocalDate.now();
		// tao account
		Account Account1 = new Account();
		Account1.id = 1;
		Account1.Department = department1;
		Account1.email = " nguyenvanmanh03@gmail.com ";
		Account1.fullName = "nguyenvanmanh";
		Account1.userName = "manhnguyen";
		Account1.position = posittion1;
		Account1.groups = new Group[] { group1, group2 };
		Account1.createDate = new Date(2020, 12, 1);
		Account Account2 = new Account();
		Account2.id = 2;
		Account2.Department = department2;
		Account2.email = " nguyenvanhinh03@gmail.com ";
		Account2.fullName = "nguyenvanhinh";
		Account2.userName = "manhhinh";
		Account2.position = posittion2;
		Account2.groups = new Group[] { group2, group3 };
		Account2.createDate = new Date(2019, 1, 2);
		Account Account3 = new Account();
		Account3.id = 3;
		Account3.Department = department3;
		Account3.email = " nguyenhoaianh03@gmail.com ";
		Account3.fullName = "nguyenhoaianh";
		Account3.userName = "hoaianh";
		Account3.position = posittion3;
		Account3.createDate = new Date(2018, 1, 2);

		// in ra tat ca ca usernam cho nguoidunh xem
		Account[] accs= {Account1 ,Account2, Account3};
		 for( int i=0;i<=accs.length;i++)
		 {
			 System.out.println("username la :"+accs[i].userName); 
		 }
		// nhap vao user name 
		 System.out.println("username la :");
		 
		 Scanner Scanner = new Scanner(System.in);
		 String username = Scanner.nextLine();
		 Group[] grs = { group1,  group2,  group3};
		 System.out.println("danh sach gr");
		 for( int i=0;i<=grs.length;i++)
		 {
			 System.out.println("gr  la :"+grs[i].groupName); 
		 }
        System.out.println("grname la :");
		 
		 String groupname = Scanner.nextLine();
		 
	 }
//	 Question 10: Tiếp tục Question 8 và Question 9
//	 Bổ sung thêm vào bước 2 của Question 8 như sau:
//	 Nếu người dùng nhập vào 3 thì sẽ thực hiện chức năng thêm group vào
//	 account
//	 Bổ sung thêm Bước 3 của Question 8 như sau:
//	 Sau khi người dùng thực hiện xong chức năng ở bước 2 thì in ra dòng
//	 text để hỏi người dùng "Bạn có muốn thực hiện chức năng khác
//	 không?". Nếu người dùng chọn "Có" thì quay lại bước 1, nếu người
//	 dùng chọn "Không" thì kết thúc chương trình (sử dụng lệnh return để
//	 kết thúc chương trình)
//	
	 public static void q10()
	 {
		 int sonhapvao;
		 String yc;
		 do {
		// nhap so cho san
			 Scanner Scanner = new Scanner(System.in);
			 System.out.println("so nhap vao la :");
			 sonhapvao =  Scanner .nextInt();
			 switch(sonhapvao)
			 { case 1:
				 q5();
				 break;
			 case 2 :
				 q6();
				 break;
			 case 3 :
				 q9();
				 break;
				 
			 } 
				System.out.println("ban co muon tiep tuc chuong trinh")	;
				
			 yc =  Scanner.nextLine();
				if (yc =="khong")
				{  
					System.out.println("thoat");
					return;
				}	
				if(yc =="co")
				{    sonhapvao =  Scanner .nextInt();
					 switch(sonhapvao)
					 { case 1:
						 q5();
						 break;
					 case 2 :
						 q6();
						 break;
					 case 3 :
						 q9();
						 break;
						 
					 } } } while (sonhapvao !=1 && sonhapvao !=2 && sonhapvao !=3);
		  
	 }

				
//	 Exercise 6 (Optional): Method
//	 Question 1:
//	 Tạo method để in ra các số chẵn nguyên dương nhỏ hơn 10
//		 
	 public static void songuyenduongchan()
	 { int i;
	  for(i=0;i<10;i+=2)
		  System.out.println(+i)  ;
	 }
//	 Question 1:
////		 Tạo method để in ra các số chẵn nguyên dương nhỏ hơn 10 
		 
	 { int i;
	  for(i=0;i<10;i++)
		  System.out.println(+i)  ;
	 }
	
	
	
	
	
	 
	 
	}

