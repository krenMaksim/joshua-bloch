package joshua.bloch.article2.pizza;

public class Test {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
	Pizza nyPizza = new NyPizza.Builder(NyPizza.Size.MEDIUM).addTopping(NyPizza.Topping.MUSHROOM)
	                                                        .build();

	Pizza calzone = new Calzone.Builder().sauceInside()
	                                     .addTopping(NyPizza.Topping.MUSHROOM)
	                                     .build();
    }
}
