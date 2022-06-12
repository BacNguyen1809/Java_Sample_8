/*
	* @author bacng
	* @ Date Jun 12, 2022
*/
package exercise3;

public class Ford extends Car {
	private int year;
	private int manifacturerDiscount;
	double getSalePrice() {
		return (getRegularPrice() - manifacturerDiscount );
		
	}
	public Ford() {
		super();
	}	
	public Ford(int year, int manifacturerDiscount) {
		super(150,20000,"xanh");
		this.year = year;
		this.manifacturerDiscount = manifacturerDiscount;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getManifacturerDiscount() {
		return manifacturerDiscount;
	}
	public void setManifacturerDiscount(int manifacturerDiscount) {
		this.manifacturerDiscount = manifacturerDiscount;
	}
	@Override
	public String toString() {
		return "Ford [year=" + year + ", manifacturerDiscount=" + manifacturerDiscount + ", getSalePrice()="
				+ getSalePrice() + ", getSpeed()=" + getSpeed() + ", getColor()=" + getColor() + "]";
	}
	

	
}
