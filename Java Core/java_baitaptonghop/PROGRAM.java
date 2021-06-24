package java_baitaptonghop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.graalvm.compiler.nodes.NodeView.Default;

public class PROGRAM {
	static List<HocSinh> danhsachhs = new ArrayList<HocSinh>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int luachonthemhs = 0;
		Scanner sc = new Scanner(System.in);

		while (luachonthemhs  !=7) {
			System.out.println("1.THEM HOC SINH GIÔI");
			System.out.println("2.THEM HOC SINH KHA");
			System.out.println("3.THEM HOC SINH YEU");
			System.out.println("4.TIM KIEM THEO HO TEN");
			System.out.println("5. TIM KIEM HOC SINH THEO DANH SACH");
			System.out.println("6.XOA HOC SINH CO TEN TRONG DANH SACH");
			System.out.println("nhap lua chon cho chuong trinh");
			luachonthemhs = sc.nextInt();
			switch (luachonthemhs) {
			case 1:
				System.out.println("them hoc sinhg gioi");
				themhocsinhgioi();
				break;
			case 2:
				System.out.println("them hoc sinh kha");
				themhocsinhkha();
				break;
			case 3:
				System.out.println("them hoc sinh yeu");
				themhocsinhyeu();
				break;
			case 4:
				System.out.println("HIEN THI DANH SACH");
				hienthidanhsach();
				break;
			case 5:
				System.out.println("TIM KIEM THEO HO TEN");
               timkiemtheoten();
               break;
			case 6:
				System.out.println("XOA THEO TEN");
				xoahocsinhcoten();
				break;
				default:
					System.out.println("THOAT");
				
			}
		}
	}

	public static void themhocsinhgioi() {
		int tuoi;
		Scanner input = new Scanner(System.in);
		System.out.println("tuoi");
		tuoi = input.nextInt();
		input.nextLine();
		System.out.println("email");
		String email;
		email = input.nextLine();
		System.out.println("hoten");
		String hoten;
		hoten = input.nextLine();
		System.out.println("sdt");
		String sdt;
		sdt = input.nextLine();
		System.out.println("nhap ten  tham gia doi tuyen mon");
		String monthamgiadoituyen = input.nextLine();
		Mon mon = Mon.fromValue(monthamgiadoituyen);
		HocSinhGioi hsg = new HocSinhGioi(tuoi, hoten, email, sdt, mon);
		danhsachhs.add(hsg);
	}

	public static void themhocsinhkha() {
		int tuoi;
		System.out.println("ten hoc sinh");
		Scanner input = new Scanner(System.in);
		System.out.println("tuoi");
		tuoi = input.nextInt();
		input.nextLine();
		System.out.println("email");
		String email;
		email = input.nextLine();
		System.out.println("hoten");
		String hoten;
		hoten = input.nextLine();
		System.out.println("sdt");
		String sdt;
		sdt = input.nextLine();
		System.out.println("diem trung binh");
		int diemtb = input.nextInt();
		HocSinhKha hsk = new HocSinhKha(tuoi, hoten, email, sdt, diemtb);
		danhsachhs.add(hsk);

	}

	public static void themhocsinhyeu() {
		int tuoi;
		System.out.println("ten hoc sinh");
		Scanner input = new Scanner(System.in);
		System.out.println("tuoi");
		tuoi = input.nextInt();
		input.nextLine();
		System.out.println("email");
		String email;
		email = input.nextLine();
		System.out.println("hoten");
		String hoten;
		hoten = input.nextLine();
		System.out.println("sdt");
		String sdt;
		sdt = input.nextLine();
		int diemthapnhat;
		System.out.println("nhap direm thap nhat");
		diemthapnhat = input.nextInt();
		int nam;
		System.out.println("nhap nam ");
		nam = input.nextInt();
		int thang;
		System.out.println("nhap thang");
		thang = input.nextInt();
		System.out.println("nhap ngay");
		int ngay = input.nextInt();
		LocalDate ngaynhap = LocalDate.of(nam, thang, ngay);
		HocSinhYeu hsy = new HocSinhYeu(tuoi, hoten, email, sdt, diemthapnhat, ngaynhap);
		danhsachhs.add(hsy);
	}

	public static void hienthidanhsach() {
		for (HocSinh hocSinh : danhsachhs) {
			System.out.println(hocSinh);
		}

	}

	public static void timkiemtheoten() {
		String tentimkiem;
		Scanner sc = new Scanner(System.in);
		System.out.println("NHAP TEN :");
		tentimkiem = sc.nextLine();
		if (tentimkiem == null)
			System.out.println("ban chua nhap ten nguoi can tim");
	   int dem =0;
		for (HocSinh hocSinh : danhsachhs) {
			if (tentimkiem.equals(hocSinh.getHoten()))
				{System.out.println(hocSinh);
				dem++;
				}
		}
		if(dem == 0)
			System.out.println("hoc sinh khong co ten trong danh sach");

	}
	public  static void xoahocsinhcoten() {
		List<HocSinh> danhsachxoa = new ArrayList<HocSinh>();
		String tencanxoa;
		Scanner sc = new Scanner(System.in);
		System.out.println("ten can xoa ");
		tencanxoa =sc.nextLine();
		if(tencanxoa==null)
			System.out.println("ban chua nhap ten");
	
		for (HocSinh hocSinh : danhsachhs) {
			if(tencanxoa.equals(hocSinh.getHoten()))
			{  danhsachxoa.add(hocSinh);
			    
			}
			
		}
		if(danhsachxoa.size()==0)
			System.out.println("hoc sinh nay ko co ten tring danh sach ");
		else
			danhsachhs.removeAll(danhsachxoa);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
