public class Main
{
    public static void main(String[] args)
    {
        double itemCost = 35.47;
        double Tax =.05;
        double priceTax = itemCost * Tax;
        double totalPrice;

        System.out.println("The price of your item is "+itemCost+" and your sales tax is  "+Tax);

        totalPrice = itemCost + priceTax;

        System.out.println("Your total price is "+totalPrice);

    }
}