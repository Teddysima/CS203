public class Uscurrency {
	private float amount;

	public static void main(String arrgs[]) {

		Uscurrency u = new Uscurrency();
		u.currency(11.56f);

	}

	public void currency(float amount) {

		int q = 0;
		int d = 0;
		int n = 0;
		int p = 0;

		int dollar = (int) amount;
		float cente = amount - dollar;

		int t = (int) (cente / 0.25f);
		if (t > 0) {
			q += t;
			cente -= t * 0.25;
		}

		t = (int) (cente / 0.10f);
		if (t > 0) {
			d += t;
			cente -= t * 0.10f;
		}

		t = (int) (cente / 0.05f);
		if (t > 0) {
			n += t;
			cente -= t * 0.05f;
		}

		t = (int) (cente / 0.01f);
		p += t;

		System.out.println("dollars: " + dollar);
		System.out.println("quarters: " + q);
		System.out.println("dimes: " + d);
		System.out.println("nickles: " + n);
		System.out.println("pennies: " + p);
	}
}
/*out put
dollars: 11
quarters: 2
dimes: 0
nickles: 1
pennies: 1*/