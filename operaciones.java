import java.util.Scanner;
public class operaciones {
    Scanner leer = new Scanner(System.in);
public lista insertarN(lista lis){
	System.out.println("No nodos = ");
	int nel = leer.nextInt();
	int dx;
	for (int i=1 ; i<=nel ; i++) {
		System.out.println("dato "+i+" :");
		dx= leer.nextInt();
		lis.insertar(dx);
	}
	return lis;
    }
	public void mostrar(lista lis)
	{
		nodo p = lis.primero;
		while(p!=null) {
			System.out.println(p.dato);
			p=p.sig;
		}
	}
	public void buscar(lista lis, int dato) {
		nodo elem=lis.primero;
		int contador=0;
		while(elem!=null) {
			if(dato==elem.dato) {
				contador++;
				System.out.println("el elemento encontrado es: "+elem.dato+" en la posicion "+contador);
				elem=elem.sig;
			}
			else {
				elem=elem.sig;
			}
		}
	}
	public void eliminar(lista lis, int dato) {
		nodo elem=lis.primero;
		while(elem!=null) {
			if(dato==elem.dato) {
				lis.primero=lis.primero.sig;
				elem=elem.sig;	
			}
			else {
				elem=elem.sig;
			}
		}
	}
	public void ordenar(lista lis) {
	nodo  p = lis.primero;
		while(p!=null) {
				nodo j=p.sig;
				while(j!=null) {
					if(p.dato > j.dato) {
						int aux = j.dato;
						j.dato=p.dato;
						p.dato=aux;
					}
					j=j.sig;
				}
			p=p.sig;	
		}
	
	}
}
