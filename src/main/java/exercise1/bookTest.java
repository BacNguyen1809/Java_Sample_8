/*
	* @author bacng
	* @ Date Jun 11, 2022
*/
package exercise1;

import java.util.Scanner;

public class bookTest {
	public static void main(String[] args) {
		Book[] book = new Book[30];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < book.length; i++) {
			book[i] = new Book();
			System.out.println("input book name:" +(i+1));
			String x = scanner.nextLine();
			book[i].setBookName(x);
			System.out.println("input book isbn:" +(i+1));
			book[i].setISBN(Integer.parseInt(scanner.nextLine()));
			System.out.println("input book author:" +(i+1));
			book[i].setAuthorName(scanner.nextLine());
			System.out.println("input book publisher:" +(i+1));
			book[i].setPublisher(scanner.nextLine());
		}
		scanner.close();
		for (int i = 0; i < book.length; i++) {
			System.out.println(book[i].getBookInfo());
		}
	}

}
