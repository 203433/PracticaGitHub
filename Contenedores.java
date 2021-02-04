public class Contenedores {
    private Cajas pila[];
	private int tope;
	
	public Contenedores(int capacidad){ 
		pila = new Cajas[capacidad];
		tope = -1;
	} 
	
	public boolean isEmpty() {return tope == -1;}
	
	public void push(Cajas i){
		if(tope+1 < pila.length)
			pila[++tope] = i;
	}
	public Cajas pop(){
		return  pila[tope--];
	}
	public Cajas peek(){
		return pila[tope];
	}


}
