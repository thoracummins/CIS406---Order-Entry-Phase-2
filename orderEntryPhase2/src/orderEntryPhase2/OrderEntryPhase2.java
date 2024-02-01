//Thora Cummins
//CIS406
//Order Entry Phase 2
//

package orderEntryPhase2;
import java.util.Scanner;

public class OrderEntryPhase2 {

	//vars
	private double discount;
	private String itemDescription;
	private String itemNumber;
	private double itemPrice;
	private int itemQtyOrdered;
	private double netPrice;
	private double taxPercent;
	private double totalDiscount;
	private double totalTax;
	
	//Gather Inputs
	public void gatherInputs()
	{
		getItemDescription();
		getItemNumber();
		getItemPrice();
		getOrderedQuantity();
		getTax();
	}
	
	//Item Description
	private void getItemDescription()
	{
		Scanner itemOBJ = new Scanner(System.in);
		System.out.println("Enter Item Description: ");
		
		itemDescription = itemOBJ.nextLine();
	}
	
	//Item Number
	private void getItemNumber()
	{
		Scanner itemOBJ = new Scanner(System.in);
		System.out.println("Enter Item Number: ");
		
		itemNumber = itemOBJ.nextLine();		
	}
	
	//Item Price
	private void getItemPrice()
	{
		Scanner ipOBJ = new Scanner(System.in);
		System.out.println("Enter Item Price: ");
		
		itemPrice = ipOBJ.nextDouble();
	}
	
	//Quantity Ordered
	private void getOrderedQuantity()
	{
		Scanner oqOBJ = new Scanner(System.in);
		System.out.println("Enter Quantity Ordered: ");
		
		itemQtyOrdered = oqOBJ.nextInt();
	}
	
	//Tax Percent
	private void getTax()
	{
		Scanner txOBJ = new Scanner(System.in);
		System.out.println("Enter Tax Percent: ");
		
		taxPercent = txOBJ.nextDouble();
	}
	
	
	//Print Invoice
	public void printInvoice()
	{
		Double grossPrice = itemPrice*itemQtyOrdered;  // calc cost of item
		totalTax = grossPrice * taxPercent;  // Calc Total Tax
		
		System.out.println("\n Order Entry\n");
		System.out.println("Item Number  \tItem Description  \tItem Price \tQuantity \t Tax % \t Tax");
		System.out.println("  "+itemNumber+"\t   "+itemDescription+"\t\t   "+itemPrice+"\t\t    "+itemQtyOrdered+"\t\t"+taxPercent+"\t"+totalTax);
	}
	
	//-----------------------------------------------------------------------
	public static void main(String[] args) {
		OrderEntryPhase2 oep = new OrderEntryPhase2();
		
		// gather input data
		oep.gatherInputs();
		
		// print invoice
		oep.printInvoice();
		
		System.out.println("\nBye!!!");

	}

}
