package asg8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class progaram {

	public static void main(String[] args) {
		List<hocsinh> danhsach = new ArrayList<hocsinh>();
		danhsach.add(new hocsinh("nguyen van nam"));
		danhsach.add(new hocsinh("nguyen van huyen "));
		danhsach.add(new hocsinh("tran van nam"));
		danhsach.add(new hocsinh("nguyen van a"));
		// danhsachsomtoimuon( null, danhsach);

		// danhsachmuontoisom(null, danhsach);
		/*
		 * Question 3 (Optional): Set Tạo 1 student có property id, name Khai báo 1 Set
		 * students, sau đó làm các chức năng tương tự List
		 */
		Set<Student> ds = new HashSet<Student>();
		Student st1 = new Student("nguyen van manh");
		ds.add(st1);
		Student st2 = new Student("nguyen van manh");
		Student st3 = new Student("nguyen van manh");
		ds.add(st2);
		ds.add(st3);
		for (Student student : ds) {
			System.out.println(student);
		}
		Student st4 = new Student("nguyen van duc");
		ds.add(st4);
		System.out.println("in ra phan tu dau va cuoi");
		System.out.println(ds.size());
//		Question 4 (Optional): Set
//		Tạo 1 danh sách có chứa name của các student không trùng nhau
//		In ra set đó
	  
		
		/*
		 * public static void danhsachsomtoimuon(String hoten, List<hocsinh> danhsach) {
		 * for (hocsinh hocsinh : danhsach) { System.out.println(hocsinh); } }
		 */

		/*
		 * public static void danhsachmuontoisom(String hoten, List<hocsinh> danhsach) {
		 * Collections.reverse(danhsach); for (hocsinh hocsinh : danhsach) {
		 * System.out.println(hocsinh); }
		 */
		/*public void timkiemid(int id ,Set<Student> ds) {
			Iterator<Student> idIterator = ds.iterator();
		for ( student : ds) {
			if(student.this.id===id)*/
		
			

	}
}
