public abstract class Meal
{
    abstract Carbs createCarbs();
    abstract Proteins createProteins();
    abstract Fats createFats();
}

class PaleoMeal extends Meal
{
    private static PaleoMeal mealFactory = null;
    String[] restrictions = {"Cheese","Bread","Lentils","Tofu","Sour Cream"};
    getFood food = new getFood();

    private PaleoMeal() {}

    public static PaleoMeal getInstance()
    {
        if (mealFactory == null)
        {
            mealFactory = new PaleoMeal();
        }
        return mealFactory;
    }

    @Override
    public Carbs createCarbs()
    {
        return food.getCarbs(restrictions);
    }

    @Override
    public Proteins createProteins()
    {
        return food.getProteins(restrictions);
    }

    @Override
    public Fats createFats()
    {
        return food.getFats(restrictions);
    }
}

class VeganMeal extends Meal
{
    private static VeganMeal mealFactory = null;
    String[] restrictions = {"Fish","Chicken","Beef","Tuna","Cheese","Sour Cream"};
    getFood food = new getFood();

    private VeganMeal() {}

    public static VeganMeal getInstance()
    {
        if (mealFactory == null)
        {
            mealFactory = new VeganMeal();
        }
        return mealFactory;
    }

    @Override
    public Carbs createCarbs()
    {
        return food.getCarbs(restrictions);
    }

    @Override
    public Proteins createProteins()
    {
        return food.getProteins(restrictions);
    }

    @Override
    public Fats createFats()
    {
        return food.getFats(restrictions);
    }
}

class NutAllergyMeal extends Meal
{
    private static NutAllergyMeal mealFactory = null;
    String[] restrictions = {"Pistachios","Peanuts"};
    getFood food = new getFood();

    private NutAllergyMeal() {}

    public static NutAllergyMeal getInstance()
    {
        if (mealFactory == null)
        {
            mealFactory = new NutAllergyMeal();
        }
        return mealFactory;
    }

    @Override
    public Carbs createCarbs()
    {
        return food.getCarbs(restrictions);
    }

    @Override
    public Proteins createProteins()
    {
        return food.getProteins(restrictions);
    }

    @Override
    public Fats createFats()
    {
        return food.getFats(restrictions);
    }
}

class NoRestrictionMeal extends Meal
{
    private static NoRestrictionMeal mealFactory = null;
    String[] restrictions = {};
    getFood food = new getFood();

    private NoRestrictionMeal() {}

    public static NoRestrictionMeal getInstance()
    {
        if (mealFactory == null)
        {
            mealFactory = new NoRestrictionMeal();
        }
        return mealFactory;
    }

    @Override
    public Carbs createCarbs()
    {
        return food.getCarbs(restrictions);
    }

    @Override
    public Proteins createProteins()
    {
        return food.getProteins(restrictions);
    }

    @Override
    public Fats createFats()
    {
        return food.getFats(restrictions);
    }
}

// Carbs, Protein, Fats repeating in each meal class, new class to hold these methods
class getFood
{
    public Carbs getCarbs(String[] restrictions)
    {
        CarbsFactory factory = CarbsFactory.getInstance();
        Carbs carb = factory.getRandomCarb();
        int restriction;
        // loop until valid carb is created
        while (true)
        {
            for (restriction = 0; restriction < restrictions.length; restriction++)
            {
                if (restrictions[restriction].equalsIgnoreCase(carb.getItem()))
                {
                    carb = factory.getRandomCarb();
                    break;
                }
            }
            // Valid carbs, break
            if (restriction == restrictions.length)break;
        }
        return carb;
    }

    public Proteins getProteins(String[] restrictions)
    {
        ProteinFactory factory = ProteinFactory.getInstance();
        Proteins protein = factory.getRandomProtein();
        int restriction;
        // loop until valid protein is created
        while (true)
        {
            for (restriction = 0; restriction < restrictions.length; restriction++)
            {
                if (restrictions[restriction].equalsIgnoreCase(protein.getItem()))
                {
                    protein = factory.getRandomProtein();
                    break;
                }
            }
            // Valid protein, break
            if (restriction == restrictions.length) break;
        }
        return protein;
    }

    public Fats getFats(String[] restrictions)
    {
        FatsFactory factory = FatsFactory.getInstance();
        Fats fat = factory.getRandomFats();
        int restriction;
        // loop until valid fat is created
        while (true)
        {
            for (restriction = 0; restriction < restrictions.length; restriction++)
            {
                if (restrictions[restriction].equalsIgnoreCase(fat.getItem()))
                {
                    fat = factory.getRandomFats();
                    break;
                }
            }
            // Valid fat, break
            if (restriction == restrictions.length)break;
        }
        return fat;
    }
}