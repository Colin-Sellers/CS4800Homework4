import java.util.ArrayList;

public class Pizza
{
    private String chain;
    private String size;
    private ArrayList<String> listOfToppings;

    public Pizza(String chain, String size, ArrayList<String> listOfToppings)
    {
        this.chain = chain;
        this.size = size;
        this.listOfToppings = listOfToppings;
    }

    public void eat()
    {
        System.out.print(chain + " " + size + " pizza with toppings: ");
        if (listOfToppings.size() == 0)
        {
            System.out.println("No Toppings");
        }
        else
        {
            printToppings();
        }
    }

    public void printToppings()
    {
        for (int topping = 0; topping < listOfToppings.size(); topping++)
        {
            if (topping % 3 == 0)
            {
                System.out.print("\n");
            }
            System.out.print(listOfToppings.get(topping) + " / ");
        }
        System.out.println();
    }
}
