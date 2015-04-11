package UebGenerics;

public class GenericTypmitWildcard<T> {
	private T objekt;

	public T getObjekt() {
		return objekt;
	}

	public void setObjekt(T objekt) {
		this.objekt = objekt;
	}
	
	public String getObjektTyp() {
		return objekt.getClass().getName();
	}
	
	public static void anzeige(GenericTypmitWildcard<?> tObjekt) {
		System.out.println("Objektwert = "+ tObjekt.getObjekt()
				+ " * ObjektTyp = "+ tObjekt.getObjektTyp());
	}
	
	public static void main(String[] args) {
		GenericTypmitWildcard<Integer> iObjekt = new GenericTypmitWildcard<Integer>();
		iObjekt.setObjekt(new Integer(10));
		anzeige(iObjekt);
		
		GenericTypmitWildcard<Float> fObjekt = new GenericTypmitWildcard<Float>();
		fObjekt.setObjekt(new Float(10.10));
		anzeige(fObjekt);
		
		GenericTypmitWildcard<Double> dObjekt = new GenericTypmitWildcard<Double>();
		dObjekt.setObjekt(new Double(10E+3));
		anzeige(dObjekt);
		
		
//		GenericTypmitWildcard<?> sObjekt = new GenericTypmitWildcard<Integer>();
//		sObjekt.setObjekt(5);
	}

}
