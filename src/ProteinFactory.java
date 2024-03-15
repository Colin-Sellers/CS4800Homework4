import java.util.Random;

public class ProteinFactory
{
    private static ProteinFactory factory = null;

    private ProteinFactory(){}

    // Singleton
    public static ProteinFactory getInstance()
    {
        if (factory == null)
        {
            factory = new ProteinFactory();
        }
        return factory;
    }

    Random rand = new Random();
    Proteins getRandomProtein()
    {
        int random = rand.nextInt(4);
        if (random == 0)
        {
            return new Fish();
        }
        else if (random == 1)
        {
            return new Chicken();
        }
        else if (random == 2)
        {
            return new Beef();
        }
        else
        {
            return new Tofu();
        }
    }
}

abstract class Proteins
{
    abstract String getItem();
}

// Each type of Proteins stores what type it is
// In a more Complete system, they could also
// Store nutrient facts / values

class Fish extends Proteins
{
    String type = "Fish";
    @Override
    String getItem()
    {
        return type;
    }
}

class Chicken extends Proteins
{
    String type = "Chicken";
    @Override
    String getItem()
    {
        return type;
    }
}

class Beef extends Proteins
{
    String type = "Beef";
    @Override
    String getItem()
    {
        return type;
    }
}

class Tofu extends Proteins {
    String type = "Tofu";

    @Override
    String getItem() {
        return type;
    }
}