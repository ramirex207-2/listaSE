import java.util.Scanner;
public class prueba {
    public static void main(String[] args) {

        Scanner leer= new Scanner(System.in);
        lista olis =new lista();
		operaciones oper = new operaciones();
		int op;
		do {
        System.out.println("****************OPERACIONES CON UNALISTA ENLAZADA**************************\n\n");
        System.out.println("**********************************************************");
        System.out.println("1. LLenar lista enlazada");
        System.out.println("2. Mostrar lista enlazada");
        System.out.println("3. Ordenar lista enlazada");
        System.out.println("4. Buscar elemento en la lista enlazada");
        System.out.println("***********************************************************");
        op = leer.nextInt();
        switch(op) {
		case 1:
			System.out.println("ingrese el numero de elementos a insertar");
			olis=oper.insertarN(olis);
			break; 
		case 2:		
			oper.mostrar(olis);
			break;
		case 3:
			oper.ordenar(olis);
			System.out.println("La lista ordena de manera asendente es: ");
			oper.mostrar(olis);
			break;
		case 4:
			System.out.println("ingrese el dato a buscar");
			int dato=leer.nextInt();
			oper.ordenar(olis);
			oper.buscar(olis, dato);
			break;
        }
		}while (op!=0); 
	}
}
