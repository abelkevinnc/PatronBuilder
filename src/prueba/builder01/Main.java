package prueba.builder01;

public class Main {

	public static void main(String[] args) {
		NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
		.calories(100).sodium(35).carbohydrate(27).build();
		
		NutritionFacts galleta = new NutritionFacts.Builder(250, 3).sodium(50).build();
		
		System.out.println(galleta);
		System.out.println(cocaCola);
		

	}

}
