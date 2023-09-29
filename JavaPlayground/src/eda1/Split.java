package eda1;
import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		System.out.println(Arrays.toString("user00@dot.com;---user01@dot.com;---user02@dot.com;---user03@dot.com".split(";-")));

	}

}
