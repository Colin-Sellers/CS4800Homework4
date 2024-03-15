import java.util.Random;

public class FatsFactory
{
    private static FatsFactory factory = null;

    private FatsFactory(){}

    // Singleton
    public static FatsFactory getInstance()
    {
        if (factory == null)
        {
            factory = new FatsFactory();
        }
        return factory;
    }

    Random rand = new Random();
    Fats getRandomFats()
    {
        int random = rand.nextInt(4);
        if (random == 0)
        {
            return new Avocado();
        }
        else if (random == 1)
        {
            return new SourCream();
        }
        else if (random == 2)
        {
            return new Tuna();
        }
        else
        {
            return new Peanuts();
        }
    }
}

abstract class Fats
{
    abstract String getItem();
}

// Each type of Fats stores what type it is
// In a more Complete system, they could also
// Store nutrient facts / values

class Avocado extends Fats
{
    String type = "Avocado";
    @Override
    String getItem()
    {
        return type;
    }
}

class SourCream extends Fats
{
    String type = "Sour cream";
    @Override
    String getItem()
    {
        return type;
    }
}

class Tuna extends Fats
{
    String type = "Tuna";
    @Override
    String getItem()
    {
        return type;
    }
}

class Peanuts extends Fats
{
    String type = "Peanuts";
    @Override
    String getItem()
    {
        return type;
    }
}