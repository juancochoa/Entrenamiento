
public class BuilderSimulator {
	public enum Currency {
		PENNY(1), DIME(10), QUARTER(25);
		private int value;
		private Currency(int value){
			this.value=value;
		}
		public int getValue(){
			return this.value;
		}
	};

	public static void main(String[] args) {
		NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).calories(100).sodium(35).carbohydrate(37).build();
		System.out.println(cocaCola.getCarbohydrate());
		System.out.println(Currency.DIME.getValue());
		char prueba = 0;
		System.out.println((int)prueba);
	}
}
