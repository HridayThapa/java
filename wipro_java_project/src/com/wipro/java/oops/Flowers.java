/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
public class Flowers {
//behaviors
	String namevalue;
	String colorvalue;
	String smellvalue;
	int pricevalue;
	/**
	 * 
	 */
	public Flowers(String name,String color,String smell,int price) {
		// TODO Auto-generated constructor stub
	this.namevalue=name;
	this.colorvalue=color;
	this.smellvalue=smell;
	this.pricevalue=price;
	}
	void display()
	{
		System.out.println("Name: "+namevalue+",Color: "+colorvalue+",Smell: "+smellvalue+",Price:"+pricevalue);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flowers flower1=new Flowers("Rose","Red","Fragnant",100);
		Flowers flower2=new Flowers("Lavendar","Purple","Sweet",150);
		flower1.display();
		flower2.display();
	}

}
