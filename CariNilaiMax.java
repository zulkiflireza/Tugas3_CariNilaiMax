class CariNilaiMax {
	public static void main (String[] args) {
		int angka1 = 80;
		int angka2 = 75;
		int angka3 = 90;

		int max = 0;

		max = angka1 >= max ? angka1 : max;
		max = angka2 >= max ? angka2 : max;
		max = angka3 >= max ? angka3 : max;

		System.out.println("Angka Terbesar adalah "+max);
	}
  }