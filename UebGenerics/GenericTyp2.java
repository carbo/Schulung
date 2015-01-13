package UebGenerics;

public class GenericTyp2<T> {
	private T objekt;
	
	public GenericTyp2(T object) {
		this.objekt = object;
	}

	public T getObjekt() {
		return objekt;
	}

	public String getObjektTyp() {
		return objekt.getClass().getName();
	}
	
	public static void main(String[] args) {
		GenericTyp2<Integer> iObjekt = new GenericTyp2<Integer>(10);
		GenericTyp2<String> sObjekt = new GenericTyp2<String>("10");
		
		
		System.out.println("iObjektWert = " + iObjekt.getObjekt()
				+ " * sObjektWert = "+sObjekt.getObjekt());
		
		System.out.println("iObjektTyp = " + iObjekt.getObjektTyp()
				+ " * sObjektTyp = "+sObjekt.getObjektTyp());
	}

}
