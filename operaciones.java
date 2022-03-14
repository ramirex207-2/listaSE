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
	public void mostrar(lista lis){
		nodo p = lis.primero;
		while(p!=null) {
			System.out.println(p.dato);
			p=p.siguiente;
		}
	}
    public void buscar(lista lis, int dat){
        nodo elemento_lis = lis.primero;
        while(elemento_lis!=null){
            if(dat==elemento_lis.dato){
                System.out.println("el elemento encontrado es: "+elemento_lis.dato);
                elemento_lis= elemento_lis.siguiente;
                break;
            }
            else{
                elemento_lis=elemento_lis.siguiente;
            }
        }
    }
    public void contar(lista lis, int dato){
        nodo elemento= lis.primero;
        int contador=0;
        while(elemento!=null){
            contador++;
            if(elemento.dato==dato){
                System.out.println(" "+contador);
            }
            elemento=elemento.siguiente;
        }
        //System.out.println("la lista tiene "+contador+" elementos");
    }
}
