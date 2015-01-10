package UebGenerics;

public class GenericTyp1 <T>{
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
	
	public static void main(String[] args) {
		GenericTyp1<Integer> iObjekt = new GenericTyp1<Integer>();
		GenericTyp1<String> sObjekt = new GenericTyp1<String>();
		
		iObjekt.setObjekt(new Integer(2));
		sObjekt.setObjekt("Java");
		
		System.out.println("iObjektWert = " + iObjekt.getObjekt()
				+ " * sObjektWert = "+sObjekt.getObjekt());
		
		System.out.println("iObjektTyp = " + iObjekt.getObjektTyp()
				+ " * sObjektTyp = "+sObjekt.getObjektTyp());
	}
}
