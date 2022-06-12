/*
	* @author bacng
	* @ Date Jun 12, 2022
*/
package exercise3;

public class MyOwnAutoShop {
	public static void main(String[] args) {
		Sedan sedan = new Sedan(0);
		sedan.getSalePrice();
		System.out.println(sedan.toString());
		Ford ford = new Ford(1996, 2000);
		Ford ford1 = new Ford(1155,2541);
		ford.getSalePrice();
		ford1.getSalePrice();
		System.out.println(ford.toString());
		System.out.println(ford1.toString());
	}

}
