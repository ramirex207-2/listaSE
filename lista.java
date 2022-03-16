public class lista {
    nodo primero;
	public lista() {
		primero=null;
	}
	public void inicializar() {
		primero = null;
	}
	public boolean lista_Vacia() {
		return primero==null;
	}
	public void insertar(int d) {
		nodo nuevo= new nodo(d);
		nuevo.sig=primero;
		primero=nuevo;
	}
	public void eliminar(){
		if(!lista_Vacia())
		{
			primero= primero.sig;
		}
	}
    
}
