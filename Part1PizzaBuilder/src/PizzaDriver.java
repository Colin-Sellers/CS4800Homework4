
public class PizzaDriver
{

    public static void main(String[] args)
    {
        Pizza pizza1 = new PizzaBuilder("Pizza Hut","Small").addPepperoni(true).addSausage(true).addMushrooms(true).createPizza();
        Pizza pizza2 = new PizzaBuilder("Pizza Hut", "Medium").addBacon(true).addExtra_Cheese(true).addOnions(true).addPeppers(true).addOlives(true).addChicken(true).createPizza();
        Pizza pizza3 = new PizzaBuilder("Pizza Hut", "Large").addHam_and_Pineapple(true).addSpicy_Pork(true).addPesto(true).addBeef(true).addSpinach(true).addTomato_and_Basil(true).addOnions(true).addBacon(true).addSausage(true).createPizza();

        // Test builder with Pizza Hut chain
        // Chain and size of pizza are mandatory, Toppings are optional
        pizza1.eat();
        System.out.println();
        pizza2.eat();
        System.out.println();
        pizza3.eat();
        System.out.println("\n");

        // Just purchased two new pizza chains! New set of pizzas

        Pizza pizzaHut1 = new PizzaBuilder("Pizza Hut","Large").addBacon(true).addBeef(true).addChicken(true).createPizza();
        Pizza pizzaHut2 = new PizzaBuilder("Pizza Hut","Small").addPepperoni(true).addSausage(true).createPizza();
        pizzaHut1.eat();
        System.out.println();
        pizzaHut2.eat();
        System.out.println("\n");

        Pizza littleCaesars1 = new PizzaBuilder("Little Caesars", "Medium").addHam(true).addBeef(true).addChicken(true).addHam_and_Pineapple(true).addTomato_and_Basil(true).addSpicy_Pork(true).addSpinach(true).addMushrooms(true).createPizza();
        Pizza littleCaesars2 = new PizzaBuilder("Little Caesars", "Small").addOlives(true).addExtra_Cheese(true).addPesto(true).addBeef(true).addOnions(true).addPepperoni(true).createPizza();
        littleCaesars1.eat();
        System.out.println();
        littleCaesars2.eat();
        System.out.println("\n");

        Pizza dominos1 = new PizzaBuilder("Dominos", "Small").addPepperoni(true).createPizza();
        Pizza dominos2 = new PizzaBuilder("Dominos", "Large").addExtra_Cheese(true).addPepperoni(true).addOlives(true).createPizza();
        dominos1.eat();
        System.out.println();
        dominos2.eat();
        System.out.println("\n");

        // Concludes Test
    }

}
