
public class Customer
{
    private String name;
    private String dietPlan;
    private CustomerMeal myMeal;

    public Customer(String name, String dietPlan)
    {
        this.name = name;
        this.dietPlan = dietPlan;
    }
    public void newMeal(Meal newMeal)
    {
        // Catch error
        if (newMeal != null)
        {
            myMeal = new CustomerMeal();
            myMeal.mealCarbs = newMeal.createCarbs();
            myMeal.mealProtein = newMeal.createProteins();
            myMeal.mealFats = newMeal.createFats();
        }

    }
    public String getName()
    {
        return name;
    }
    public String getDietPlan()
    {
        return dietPlan;
    }
    public void setNewDietPlan(String dietPlan)
    {
        this.dietPlan = dietPlan;
        // Erase current meal to refelt new diet plan
        myMeal = null;
    }
    public void eatMeal()
    {
        if (myMeal != null)
        {
            System.out.println(getName() + "'s " + getDietPlan() + " meal consits of:");
            System.out.println(myMeal.returnMeal());
        }
        else
        {
            System.out.println(getName() + " does not have a meal.");
        }
    }

}

class CustomerMeal
{
    public Carbs mealCarbs;
    public Proteins mealProtein;
    public Fats mealFats;

    public String returnMeal()
    {
        return mealCarbs.getItem() + ", " + mealProtein.getItem() + ", and " + mealFats.getItem();
    }
}
