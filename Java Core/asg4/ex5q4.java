package les_4;

import java.util.Scanner;

public class ex5q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------chuong trinh quan ly tai lieu sach");
		int chonmuc;
		Scanner sc = new Scanner(System.in);
		chonmuc = sc.nextInt();
		
		switch (chonmuc) {
		case 1:
			System.out.println("1.Thêm mới tài liêu: Sách, tạp chí, báo.");
			themtailieu();
			break;
		case 2:
			System.out.println("2.Xoá tài liệu theo mã tài liệu.");
			xoatheomatailieu();
			break;
		case 3:
			System.out.println("3.Hiện thị thông tin về tài liệu.");
			hienthi();
			break;
		case 4:
			System.out.println("4.Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.");
			break;

		default:
			System.out.println("5.thoat");
			break;

		}
		sc.close();
	}

	// thuc hien chuong trinh theo tung case
	public static void themtailieu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("moi ban chon loai tai lieu");
		String tenluachon = sc.nextLine();
		switch (tenluachon) {
		case "sach":
			sach sach = new sach();
			System.out.println("ma sach");
			String masach = sc.nextLine();
			sach.setMatailieu(masach);
			System.out.println("nhap ten nha xuat ban");
			String tennhaxuatban = sc.nextLine();
			sach.setTennhasanxuat(tennhaxuatban);
			System.out.println("nhap so  ban phat hanh");
			int sophathanh = sc.nextInt();
			sach.setSobanphathanh(sophathanh);
			System.out.println("ten tac gia");
			String tentacgia = sc.nextLine();
			sach.setTentacgia(tentacgia);
			System.out.println(" so trang");
			int sotrang = sc.nextInt();
			sach.setSotrang(sotrang);
			break;
		case "tap chi":
			tapchi tapchi = new tapchi();
			System.out.println("ma tapchi");
			String matapchi = sc.nextLine();
			tapchi.setMatailieu(matapchi);
			System.out.println("nhap ten nha xuat ban");
			String tennhaxuatbantapchi = sc.nextLine();
			tapchi.setTennhasanxuat(tennhaxuatbantapchi);
			System.out.println("ten tac gia");
			String tentacgiatapchi = sc.nextLine();
			tapchi.setTennhasanxuat(tentacgiatapchi);
			System.out.println("so phat hanh");
			int sophathanhtapchi = sc.nextInt();
			tapchi.setSophathanh(sophathanhtapchi);
			System.out.println("so  ban phat hanh");
			int sobanphathanhtapchi = sc.nextInt();
			tapchi.setSobanphathanh(sobanphathanhtapchi);
			System.out.println("thang phat hanh");
			int thang = sc.nextInt();
			tapchi.setThangphathanh(thang);
			break;
		case "bao":
			bao bao = new bao();
			System.out.println("ma bao");
			String mabao = sc.nextLine();
			bao.setMatailieu(mabao);
			System.out.println("nhap ten nha xuat ban");
			String tennhaxuatbanbao = sc.nextLine();
			bao.setTennhasanxuat(tennhaxuatbanbao);
			System.out.println("nhap so  ban phat hanh");
			int sophathanhbao = sc.nextInt();
			bao.setSobanphathanh(sophathanhbao);
			System.out.println("ten tac gia");
			String tentacgiabao = sc.nextLine();
			bao.setTennhasanxuat(tentacgiabao);
			System.out.println("ngay phat hanh");
			String ngay = sc.nextLine();
			bao.setNgayphathanh(ngay);
			break;

		}
	}

	public static void xoatheomatailieu() {
		Scanner sc = new Scanner(System.in);
		String macanxoa = sc.nextLine();
		// vi di xoa cuon sach
		int m;
		System.out.println("so sach hien co");
		m = sc.nextInt();
		sach[] sachs = new sach[m];
		for (int i = 0; i < m; i++) {
			if (sachs[i].getMatailieu() == macanxoa)
				sachs[i] = null;
		}

	}

	public static void hienthi() { // vi du hien thi danh sach sach
		Scanner sc = new Scanner(System.in);
		int m;
		System.out.println("so sach hien co");
		m = sc.nextInt();
		sach[] sachs = new sach[m];
		for (sach s : sachs)
			System.out.println(s);

	}

}