package UebCollections;

import java.util.Comparator;

public class GehaltsComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		return ((Employee)o1).getGehalt() - ((Employee)o2).getGehalt();
	}

}
