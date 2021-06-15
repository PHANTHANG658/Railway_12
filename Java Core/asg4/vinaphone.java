package les_4;

import java.util.Scanner;

public class vinaphone extends phone {

	@Override
	public void insertcontacts(String name, int phone) {
		// TODO Auto-generated method stub
		contact contact = new contact();
		// nhap- ten
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ten");
		String ten = sc.nextLine();
		contact.setName(ten);
	}

	@Override
	public void itimkiemcontact(String name, int phone) {
		// TODO Auto-generated method stub
		int soluong;
		Scanner sc = new Scanner(System.in);
		System.out.println("ten tim kiem");
		 String tentimkiem = sc.nextLine();
		  soluong = sc.nextInt();
		contact[] contacts = new contact[soluong];
		for (int i = 0; i < soluong; i++) {
			if (contacts[i].getName().equals(tentimkiem)) {
				System.out.println(contacts[i]);
		
	}}

}}
