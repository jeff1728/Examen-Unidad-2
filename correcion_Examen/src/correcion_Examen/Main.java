package correcion_Examen;
import java.util.Scanner;
import java.util.Stack;
public class Main {

	public static void main(String[] args) throws Exception {
		Scanner leer=new Scanner(System.in);
		
		int opcion;
		ArbolBinario arbol = null;
		Stack pila=new Stack();
		int valor,valor1,valor2,valor3,valor4,valor5;
		Nodo a1, a2, a = null;
		
		do {
			System.out.println("opcion 1.- insertar Nodo"
					+ "\nopcion 2.- recorrido (preorden,inorden,postorden)"
					+ "\nopcion 3.- Numero de Nodos"
					+ "\nopcion 4.-Suma de Nodos"
					+ "\nopcion 5.- Salir");
			 opcion=leer.nextInt();
			switch(opcion) {
			case 1:
				 System.out.println("ingrese el valor del nodo principal: ");
				  valor=leer.nextInt();
				  System.out.println("ingrese el valor del nodo izquierdo: ");
				  valor1=leer.nextInt();
				  System.out.println("ingrese el valor del nodo derecho: ");
				  valor2=leer.nextInt();
				  a1 = ArbolBinario.nuevoArbol(null,valor1,null);
				  a2 = ArbolBinario.nuevoArbol(null,valor2,null);
				  a = ArbolBinario.nuevoArbol(a1,valor,a2);
				  pila.push(a);
				  
				  System.out.println("ingrese el valor del nodo principal: ");
				  valor3=leer.nextInt();
				  System.out.println("ingrese el valor del nodo izquierdo: ");
				  valor4=leer.nextInt();
				  System.out.println("ingrese el valor del nodo derecho: ");
				  valor5=leer.nextInt();
				  a1 = ArbolBinario.nuevoArbol(null,valor3,null);
				  a2 = ArbolBinario.nuevoArbol(null,valor4,null);
				  a = ArbolBinario.nuevoArbol(a1,valor5,a2);
				  pila.push(a);
				  
				  a2 = (Nodo) pila.pop();
				  a1 = (Nodo) pila.pop();
				  a = ArbolBinario.nuevoArbol(a1,valor,a2);
				  arbol = new ArbolBinario(a);
				  
				  
				
				break;
			case 2:
				System.out.println("Recorrido Preorden:");
	            ArbolBinario.preorden(arbol.raizArbol());

	            System.out.println("\nRecorrido Inorden:");
	            ArbolBinario.inorden(arbol.raizArbol());

	            System.out.println("\nRecorrido Postorden:");
	            ArbolBinario.postorden(arbol.raizArbol());
				break;
			case 3:
				System.out.println( ArbolBinario.numNodos(a));
				break;
			case 4:
			System.out.println(ArbolBinario.sumarElementos(a));
				break;
			case 5:
				System.out.println("ha salido del menu");
				break;
				default:
					System.out.println("opcion no disponible");
			}
		}while(opcion!=4);
       

	}

}
