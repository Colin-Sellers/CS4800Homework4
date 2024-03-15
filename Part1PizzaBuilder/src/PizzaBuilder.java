import java.util.ArrayList;

public class PizzaBuilder
{
    // Required Attributes, a pizza must have a size and chain
    private final String chain;
    private final String size;
    // Optional Attributes, a pizza may have toppings, order matters
    public boolean Pepperoni;
    public boolean Sausage;
    public boolean Mushrooms;
    public boolean Bacon;
    public boolean Onions;
    public boolean Extra_Cheese;
    public boolean Peppers;
    public boolean Chicken;
    public boolean Olives;
    public boolean Spinach;
    public boolean Tomato_and_Basil;
    public boolean Beef;
    public boolean Ham;
    public boolean Pesto;
    public boolean Spicy_Pork;
    public boolean Ham_and_Pineapple;

    public PizzaBuilder(String chain, String size)
    {
        this.chain = chain;
        this.size = size;
    }
    public PizzaBuilder addPepperoni(boolean Pepperoni)
    {
        this.Pepperoni = Pepperoni;
        return this;
    }
    public PizzaBuilder addSausage(boolean Sausage)
    {
        this.Sausage = Sausage;
        return this;
    }
    public PizzaBuilder addMushrooms(boolean Mushroom)
    {
        this.Mushrooms = Mushroom;
        return this;
    }
    public PizzaBuilder addBacon(boolean Bacon)
    {
        this.Bacon = Bacon;
        return this;
    }
    public PizzaBuilder addOnions(boolean Onions)
    {
        this.Onions = Onions;
        return this;
    }
    public PizzaBuilder addExtra_Cheese(boolean Extra_Cheese)
    {
        this.Extra_Cheese = Extra_Cheese;
        return this;
    }
    public PizzaBuilder addPeppers(boolean Peppers)
    {
        this.Peppers = Peppers;
        return this;
    }
    public PizzaBuilder addChicken(boolean Chicken)
    {
        this.Chicken = Chicken;
        return this;
    }
    public PizzaBuilder addOlives(boolean Olives)
    {
        this.Olives = Olives;
        return this;
    }
    public PizzaBuilder addSpinach(boolean Spinach)
    {
        this.Spinach = Spinach;
        return this;
    }
    public PizzaBuilder addTomato_and_Basil(boolean Tomato_and_Basil)
    {
        this.Tomato_and_Basil = Tomato_and_Basil;
        return this;
    }
    public PizzaBuilder addBeef(boolean Beef)
    {
        this.Beef = Beef;
        return this;
    }
    public PizzaBuilder addHam(boolean Ham)
    {
        this.Ham = Ham;
        return this;
    }
    public PizzaBuilder addPesto(boolean Pesto)
    {
        this.Pesto = Pesto;
        return this;
    }
    public PizzaBuilder addSpicy_Pork(boolean Spicy_Pork)
    {
        this.Spicy_Pork = Spicy_Pork;
        return this;
    }
    public PizzaBuilder addHam_and_Pineapple(boolean Ham_and_Pineapple)
    {
        this.Ham_and_Pineapple = Ham_and_Pineapple;
        return this;
    }

    public Pizza createPizza()
    {
        return new Pizza(chain, size, createList());
    }

    public ArrayList<String> createList()
    {
        ArrayList<String> listOfToppings = new ArrayList<>();
        if (Pepperoni) listOfToppings.add("Pepperoni");
        if (Sausage) listOfToppings.add("Sausage");
        if (Mushrooms) listOfToppings.add("Mushrooms");
        if (Bacon) listOfToppings.add("Bacon");
        if (Onions) listOfToppings.add("Onions");
        if (Extra_Cheese) listOfToppings.add("Extra Cheese");
        if (Peppers) listOfToppings.add("Peppers");
        if (Chicken) listOfToppings.add("Chicken");
        if (Olives) listOfToppings.add("Olives");
        if (Spinach) listOfToppings.add("Spinach");
        if (Tomato_and_Basil) listOfToppings.add("Tomato and Basil");
        if (Beef) listOfToppings.add("Beef");
        if (Ham) listOfToppings.add("Ham");
        if (Pesto) listOfToppings.add("Pesto");
        if (Spicy_Pork) listOfToppings.add("Spicy Pork");
        if (Ham_and_Pineapple) listOfToppings.add("Ham and Pineapple");
        return listOfToppings;
    }

}