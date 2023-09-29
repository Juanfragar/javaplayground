package eda1;

import java.util.ArrayList;

public class Ejercicio1 {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> datos = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> aux = null;
		for (int i = 0; i < 4; i++) {
			aux = new ArrayList<Integer>();
			for (int j = 0; j < 5; j++) {
				aux.add(j);
			}
			aux.sort(i % 2 != 0 ? new Greater<Integer>() : new Less<Integer>());
			datos.add(aux);
			aux = null;
		}
		System.out.println(datos);
	}
}
