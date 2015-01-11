package UebGenerics;

public class GenericTypMitExtend <T extends Number> {
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
	
	public static GenericTypMitExtend<? extends Number> anzeige(GenericTypMitExtend<? extends Number> tObjekt) {
		System.out.println("Objektwert = "+ tObjekt.getObjekt()
				+ " * ObjektTyp = "+ tObjekt.getObjektTyp());
		return tObjekt;
	}
	
	public static int add(GenericTypMitExtend<? extends Number> iObjekt, GenericTypMitExtend<? extends Number> sObjekt) {
		Number zahl1 = iObjekt.getObjekt();
		Number zahl2 = sObjekt.getObjekt();
		return zahl1.intValue()+ zahl2.intValue();
	}
	
	public static void main(String[] args) {
		//Die Variable, welche den Rückgabewert der Methode empfängt, muss
		// den gleichen Typ wie der Rückgabewert aufweisen.
		GenericTypMitExtend<? extends Number> obj;
		GenericTypMitExtend<Integer> iObjekt = new GenericTypMitExtend<Integer>();
		iObjekt.setObjekt(new Integer(10));
		//iObjekt = iObjekt.anzeige(iObjekt); //Fehler
		obj = anzeige(iObjekt);
		System.out.println("Typ des Rückgabewerts:"+obj.getObjektTyp());
		
		GenericTypMitExtend<Float> fObjekt = new GenericTypMitExtend<Float>();
		fObjekt.setObjekt(new Float(10.10));
		//iObjekt = iObjekt.anzeige(iObjekt); //Fehler
		obj = anzeige(fObjekt);
		System.out.println("Typ des Rückgabewerts:"+obj.getObjektTyp());
		
		GenericTypMitExtend<Double> dObjekt = new GenericTypMitExtend<Double>();
		dObjekt.setObjekt(new Double(10E+3));
		//iObjekt = iObjekt.anzeige(iObjekt); //Fehler
		obj = anzeige(dObjekt);
		System.out.println("Typ des Rückgabewerts:"+obj.getObjektTyp());
		
		int i1 = add(iObjekt, fObjekt);
		int i2 = add(fObjekt, dObjekt);
		
		System.out.println("Ergebnis der Addition:"+ i1 + "und "+i2);
		
	}

}
