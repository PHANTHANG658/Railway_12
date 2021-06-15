package les_4;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// isert them 1 contatact
		contact contact = new contact();
		// nhap- ten
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ten");
		String ten = sc.nextLine();
		contact.setName(ten);
		// tim kiem contact theo ten
		String tentimkiem;
		System.out.println(" nhao ten tim kiem ");
		tentimkiem = sc.nextLine();
		int soluong;
		System.out.println("so luong");
		soluong = sc.nextInt();
		contact[] contacts = new contact[soluong];
		for (int i = 0; i < soluong; i++) {
			if (contacts[i].getName().equals(tentimkiem)) {
				System.out.println(contacts[i]);

			}
		}
		
	}
}
