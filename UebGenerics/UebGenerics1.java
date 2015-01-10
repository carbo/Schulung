package UebGenerics;

import java.util.ArrayList;
import java.util.List;

public class UebGenerics1 {
	public static void main(String[] args) {
		List<String> str = new ArrayList<>();
		str.add("1");
		str.add("2");
		str.add("3");
		for (String string : str) {
			System.out.println(string);
		}
	}

}
