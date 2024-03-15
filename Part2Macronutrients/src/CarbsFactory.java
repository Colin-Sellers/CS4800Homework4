import java.util.Random;

public class CarbsFactory
{
    private static CarbsFactory factory = null;

    private CarbsFactory(){}

    // Singleton
    public static CarbsFactory getInstance()
    {
        if (factory == null)
        {
            factory = new CarbsFactory();
        }
        return factory;
    }

    Random rand = new Random();
    Carbs getRandomCarb()
    {
        int random = rand.nextInt(4);
        if (random == 0)
        {
            return new Cheese();
        }
        else if (random == 1)
        {
            return new Bread();
        }
        else if (random == 2)
        {
            return new Lentils();
        }
        else
        {
            return new Pistachio();
        }
    }
}

abstract class Carbs
{
    abstract String getItem();
}

// Each type of Carb stores what type it is
// In a more Complete system, they could also
// Store nutrient facts / values

class Cheese extends Carbs
{
    private final String type = "Cheese";
    @Override
    String getItem()
    {
        return type;
    }
}

class Bread extends Carbs
{
    private final String type = "Bread";
    @Override
    String getItem()
    {
        return type;
    }
}

class Lentils extends Carbs
{
    private final String type = "Lentils";
    @Override
    String getItem()
    {
        return type;
    }
}

class Pistachio extends Carbs
{
    private final String type = "Pistachio";
    @Override
    String getItem()
    {
        return type;
    }
}

