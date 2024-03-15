import java.util.ArrayList;

public class MealRunner
{
    public static void main(String[] args)
    {
        MacronutrientsFactory.getInstance();

        // Create list of customers to test system on
        ArrayList<Customer> listOfCustomers = new ArrayList<>();
        Customer thisCustomer = null;

        listOfCustomers.add(new Customer("John","No Restriction")); // No restriction type meal
        listOfCustomers.add(new Customer("Bob","Vegan")); // Vegan type meal
        listOfCustomers.add(new Customer("Alice","Paleo")); // Paleo type meal
        listOfCustomers.add(new Customer("Chuck","Nut Allergy")); // Nut Allergy type meal
        listOfCustomers.add(new Customer("George","Vegan")); // Vegan type meal
        listOfCustomers.add(new Customer("Marry","No Restriction")); // No restriction type meal

        for (int customer = 0; customer < listOfCustomers.size(); customer++)
        {
            thisCustomer = listOfCustomers.get(customer);
            thisCustomer.newMeal(MacronutrientsFactory.createMeal(thisCustomer.getDietPlan()));
            thisCustomer.eatMeal();
            System.out.println();
        }

        // Extra tests
        thisCustomer.eatMeal(); // Same meal
        System.out.println();
        thisCustomer.newMeal(MacronutrientsFactory.createMeal(thisCustomer.getDietPlan()));
        thisCustomer.eatMeal(); // Different meal and new meal is generated (small chance that random will pick same meal)
        System.out.println();

        // Error type tests
        Customer error = new Customer("Erik","SuperDiet");
        error.newMeal(MacronutrientsFactory.createMeal(error.getDietPlan())); // Invalid meal type
        error.eatMeal(); // No meal generated
    }
}