//Thora Cummins
//CIS406
//Order Entry Phase 2
//

package orderEntryPhase2;
import java.util.Scanner;

public class OrderEntryPhase2 {

	//vars
	private String itemDescription;
	private String itemNumber;
	private double itemPrice;
	private int itemQtyOrdered;
	private double netPrice;
	private double totalDiscount;
	private double totalTax;
	
	//Gather Inputs
	public void gatherInputs()
	{
		getItemDescription();
		getItemNumber();
		getItemPrice();
		getOrderedQuantity();
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
	
	
	//Print Invoice
	public void printInvoice()
	{
		System.out.println("\n Order Entry\n");
		System.out.println("Item Number  \tItem Description  \tItem Price \tQuantity");
		System.out.println("  "+itemNumber+"\t   "+itemDescription+"\t\t   "+itemPrice+"\t\t    "+itemQtyOrdered);
	}
	
	//-----------------------------------------------------------------------
	public static void main(String[] args) {
		OrderEntryPhase2 oep = new OrderEntryPhase2();
		
		oep.gatherInputs();
		oep.printInvoice();
		
		System.out.println("\nBye!!!");

	}

}
