public class MacronutrientsFactory
{
    private static MacronutrientsFactory factory = null;

    private MacronutrientsFactory() {}

    // Singleton
    public static MacronutrientsFactory getInstance()
    {
        if (factory == null)
        {
            factory = new MacronutrientsFactory();
        }
        return factory;
    }

    public static Meal createMeal(String dietPlan)
    {
        if (dietPlan.equalsIgnoreCase("paleo"))
        {
            return PaleoMeal.getInstance();
        }
        else if (dietPlan.equalsIgnoreCase("vegan"))
        {
            return VeganMeal.getInstance();
        }
        else if (dietPlan.equalsIgnoreCase("nut allergy"))
        {
            return NutAllergyMeal.getInstance();
        }
        else if (dietPlan.equalsIgnoreCase("no restriction"))
        {
            return NoRestrictionMeal.getInstance();
        }
        else
        {
            System.out.println("Error, '" + dietPlan + "' is not a valid diet plan!");
            return null;
        }
    }
}