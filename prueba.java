import java.util.Scanner;
public class prueba {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer= new Scanner(System.in);
        lista olis =new lista();
		operaciones oper = new operaciones();
        System.out.println("******************************************");
        System.out.println("ingrese el numero de elementos a insertar");
		olis = oper.insertarN(olis);
        System.out.println("los datos ingresados son: ");
		oper.mostrar(olis);
        System.out.println("ingrese dato a buscar ");
        int datoB= leer.nextInt();
        oper.buscar(olis, datoB);
	}
}
