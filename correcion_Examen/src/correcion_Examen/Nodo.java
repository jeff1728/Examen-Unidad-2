package correcion_Examen;

public class Nodo {
	protected Object dato;
	protected Object izdo;
	protected Object dcho;
	
	public Nodo(Object valor) {
		dato=valor;
		izdo=dcho=null;
		
	}

	public Nodo(Object ramaIzdo, Object valor, Object ramaDcho) {
		dato = valor;
		izdo = ramaIzdo;
		dcho = ramaDcho;
	}
	
	public Object valorNodo() {
		return dato;
	}
	
	public Nodo subarbolIzdo() {
		return (Nodo) izdo;
	}
	public Nodo subarbolDcho() {
		return (Nodo) dcho;
	}
	public void nuevovalor(Object d) {
		dato=d;
	}
	public void ramaIzdo(Nodo n) {
		izdo=n;
	}
	public void ramaDcho(Nodo n ){
		dcho=n;
	}
	
	public void visitar() {
		System.out.println(dato+" ");
	}	
}
