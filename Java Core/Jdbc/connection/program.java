package Jdbc.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class program {

	public static Connection getMySQLConnection() throws SQLException, ClassNotFoundException {
		return MySQLConnUtils.getMySQLConnection();

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("Get connection");
		Connection conn = program.getMySQLConnection();
		int luachon = 0;
		while (luachon != 5) {
			System.out.println("1.THEM HOC SINH GIOI");
			System.out.println("2.THEM HOC SINH KHA");
			System.out.println("3. XOA HOC SINH");
			System.out.println("4. HIEN THI DANH SACH");
			System.out.println("5.THOAT");
			Scanner sc = new Scanner(System.in);
			System.out.println("nhap lua chon");
			luachon = sc.nextInt();
			switch (luachon) {
			case 1:
				themhocsinhgioi(conn);
				break;
			case 2:
				themhocsinhkha_tb(conn);
				break;
			case 3:
				xoahocsinh(conn);
				break;
			case 4:
				hienthidanhsach(conn);
				break;

			}

		}
		conn.close();
	}

	public static List<HS> getHS(Connection connection) throws SQLException {
		Statement statement = connection.createStatement();
		String sql = "SELECT mahs,ten,tuoi,lop , hocluc, ngaysinh, diemtongket, gioitinh, thamgiadoituyenmon "
				+ "FROM hs ";
		ResultSet rs = statement.executeQuery(sql);
		List<HS> danhsach = new ArrayList<HS>();
		while (rs.next()) {

			int mahs = rs.getInt("mahs");
			String ten = rs.getString("ten");
			int tuoi = rs.getInt("tuoi");
			String lop = rs.getString("lop");
			String hocluc = rs.getString("hocluc");
			Date ngaysinh = rs.getDate("ngaysinh");
			float diemtongket = rs.getFloat("diemtongket");
			String gioitinh = rs.getString("gioitinh");
			String doituyenmon = rs.getString("thamgiadoituyenmon");
			// System.out.println(hocluc1);

			// in ra danhsach sau khi ketnoi voi database
			// in ra thong tin cua hoc sinh gom diem va hoc lua
			if (doituyenmon != null) {
				HocSinhGioi hsg = new HocSinhGioi();
				hsg.setMahs(mahs);
				hsg.setTen(ten);
				hsg.setTuoi(tuoi);
				hsg.setLop(lop);
				hsg.setHocluc(hocluc);
				hsg.setNgaysinh(ngaysinh);
				hsg.setDiemtongket(diemtongket);
				hsg.setGioiTinh(GioiTinh.fromValue(gioitinh));
				hsg.setMon(MonThiHSG.fromValue(doituyenmon));
				danhsach.add(hsg);
			}

			else {
				HocSinhKha_TB_Yeu hsk_tb = new HocSinhKha_TB_Yeu();
				hsk_tb.setMahs(mahs);
				hsk_tb.setTen(ten);
				hsk_tb.setTuoi(tuoi);
				hsk_tb.setLop(lop);
				hsk_tb.setHocluc(hocluc);
				hsk_tb.setDiemtongket(diemtongket);
				hsk_tb.setNgaysinh(ngaysinh);
				hsk_tb.setGioiTinh(GioiTinh.fromValue(gioitinh));
				danhsach.add(hsk_tb);
			}

		}
		return danhsach;

	}

	public static void hienthidanhsach(Connection connection) throws SQLException {
		{
			List<HS> danhsach = getHS(connection);
			for (HS hs : danhsach) {
				System.out.println(hs);
			}

		}
	}

	public static void themhocsinhgioi(Connection connection) throws SQLException {
		String sql = " INSERT INTO hs (ten,tuoi,lop , hocluc, ngaysinh, diemtongket, gioitinh, thamgiadoituyenmon )"
				+ " VALUES(?,?,?,'goi','2011-11-9',?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		Scanner input = new Scanner(System.in);
		System.out.println("nhap ten:");
		String ten = input.nextLine();
		System.out.println("nhap tuoi");
		int tuoi = input.nextInt();
		input.nextLine();
		System.out.println("nhap lop theo hoc");
		String lop = input.nextLine();
		// insert vao database
		float diemtongket;
		do {
			System.out.println("nhap diem tong ket");
			diemtongket = input.nextFloat();
		} while (diemtongket < 8);
		input.nextLine();
		String gioitinh;
		do {
			System.out.println("nhap gioi tinh");
			gioitinh = input.nextLine();
		} while ((gioitinh == "nam") || (gioitinh == "nu"));
		System.out.println("nhap mon tham gia thi hoc sinh gioi");
		String mon = input.nextLine();
		preparedStatement.setString(1, ten);
		preparedStatement.setInt(2, tuoi);
		preparedStatement.setString(3, lop);
		preparedStatement.setFloat(4, diemtongket);
		preparedStatement.setString(5, gioitinh);
		preparedStatement.setString(6, mon);
		int effectedRecordAmount = preparedStatement.executeUpdate();
		System.out.println(effectedRecordAmount);
	}

	public static void themhocsinhkha_tb(Connection connection) throws SQLException {
		String sql1 = " INSERT INTO hs (ten,tuoi,lop , hocluc, ngaysinh, diemtongket, gioitinh, thamgiadoituyenmon )"
				+ " VALUES(?,?,?,?,'2011-11-9',?,?,null)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql1);
		Scanner input = new Scanner(System.in);
		System.out.println("nhap ten:");
		String ten = input.nextLine();
		System.out.println("nhap tuoi");
		int tuoi = input.nextInt();
		input.nextLine();
		System.out.println("nhap lop theo hoc");
		String lop = input.nextLine();
		// insert vao database
		float diemtongket;
		do {
			System.out.println("nhap diem tong ket");
			diemtongket = input.nextFloat();
		} while (diemtongket >= 8);
		String hocluc = null;
		if (diemtongket >= 6.5)
			hocluc = "kha";
		if ((diemtongket < 6.5) && (diemtongket >= 4))
			hocluc = "tb";
		if (diemtongket < 4)
			hocluc = "yeu";
		input.nextLine();
		String gioitinh;
		do {
			System.out.println("nhap gioi tinh");
			gioitinh = input.nextLine();
		} while ((gioitinh == "nam") || (gioitinh == "nu"));
		preparedStatement.setString(1, ten);
		preparedStatement.setInt(2, tuoi);
		preparedStatement.setString(3, lop);
		preparedStatement.setString(4, hocluc);
		preparedStatement.setFloat(5, diemtongket);
		preparedStatement.setString(6, gioitinh);
		int effectedRecordAmount = preparedStatement.executeUpdate();
		System.out.println(effectedRecordAmount);
	}

	public static void xoahocsinh(Connection connection) throws SQLException {
		String sql3 = " DELETE FROM hs WHERE mahs=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql3);
		System.out.println("nhap mahs");
		Scanner sc = new Scanner(System.in);
		int mahs = sc.nextInt();
		preparedStatement.setInt(1, mahs);
		int rss1 = preparedStatement.executeUpdate();
		System.out.println(rss1);
	}

}
