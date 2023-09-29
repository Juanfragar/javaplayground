package eda1;
import java.util.Comparator;
import java.util.LinkedList;

public class ComparatorStr implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		return Integer.compare(o1.length(), o2.length());
	}

	public static void main(String[] args) {
		LinkedList<String> datos = new LinkedList<String>();
		datos.add("1234");
		datos.add("123");
		datos.add("12345");
		datos.add("1");
		datos.add("123456");
		datos.sort(new ComparatorStr());
		System.out.println(datos);
	}

}
