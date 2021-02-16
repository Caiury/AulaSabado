package Copa;

public class Maior {

	public static double arrayMaior(double[] array) {
		double maior = 0;
		for (int i = 0; i < array.length; i++) {

			if (array[i] > maior) {
				maior=array[i];
			}

		}

		return maior;
	}

}
