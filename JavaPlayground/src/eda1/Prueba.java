package eda1;

public class Prueba implements Comparable<Prueba> {
	private String atributo1;
	private String atributo2;

	public Prueba(String at1, String at2) {
		this.atributo1 = at1;
		this.atributo2 = at2;
	}

	@Override
	public int compareTo(Prueba o) {
		int cmp = o.atributo1.compareTo(this.atributo1);
		return cmp != 0 ? cmp : this.atributo2.compareTo(o.atributo2);
	}

	public static void main(String[] args) {
		Prueba prueba01 = new Prueba("az", "az");
		Prueba prueba02 = new Prueba("az", "za");
		Prueba prueba03 = new Prueba("za", "az");
		System.out.println(prueba01.compareTo(prueba02) > 0);
		System.out.println(prueba01.compareTo(prueba03) > 0);
		System.out.println(prueba03.compareTo(prueba02) > 0);
	}

}
