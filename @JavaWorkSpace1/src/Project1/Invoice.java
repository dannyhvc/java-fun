/*
 * Project Name: Invoice.java
 * Purpose:
 * Coder: Daniel Herrera (0881570) for Section 03
 * Date: 2/14/2019 | Time: 3:18 PM
 */
package Project1;

public class Invoice implements Payable
{
  //properties
  private String invoiceNumber;
  private String partNumber;
  private String partDescription;
  private int quantity;
  private double unitPrice;

  //constructor
  Invoice( String invoiceNumber, String partNumber, String partDescription, int quantity, double unitPrice)
  {
    this.invoiceNumber = invoiceNumber;
    this.partNumber = partNumber;
    this.partDescription = partDescription;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
  }//end constructor

  //getters.
  public int getQuantity()
  {
    return quantity;
  }
  public double getUnitPrice()
  {
    return unitPrice;
  }
  public String getInvoiceNumber()
  {
    return invoiceNumber;
  }
  public String getPartDescription()
  {
    return partDescription;
  }
  public String getPartNumber()
  {
    return partNumber;
  }

  /**
   * Method Name: generatePaymentAmount()
   * Purpose    :
   * Accepts    :
   * Returns    :
   */
  @Override
  public String toString()
  {
    return "Invoice#:\t\t\tPartNumber:\t\t\tDescription:\t\t\tQuantity:\t\tunitPrice\n" +
        "\t\t\tTotal\n" +
        invoiceNumber + "\t\t\t" + partNumber + "\t\t\t" + partDescription + "\t\t\t" + quantity + "\t\t\t" + unitPrice
        + "\t\t\t" + generatePaymentAmount() + "\n";
  }//end toString()

  /**
   * Method Name: generatePaymentAmount()
   * Purpose    :
   * Accepts    :
   * Returns    :
   */ //***TODO TAYLOR
  @Override
  public double generatePaymentAmount()
  {
    return quantity * unitPrice;
  }

}//end Main class
