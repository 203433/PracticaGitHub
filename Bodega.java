// void enqueue( String ) --> Inserta String
// String dequeue( )      --> Remueve y regresa el siguiente elemento
// String peek( )         --> Muestra el siguiente elemento sin alterar la estructura
// boolean isEmpty( )     --> true si est� vacia; false si tiene elementos
// int size()             --> Implementar: Cantidad de elementos en la estructura

public class Bodega {
	public static final int DEFAULT_SIZE=200;
	private Cajas data[];
	private int index;
	public Bodega(){
		data=new Cajas[DEFAULT_SIZE];
	}

	public Bodega(int s){
		data=new Cajas[s];
	}
	
	public boolean isEmpty(){
		return index==0;
	}

	public void enqueue(Cajas obj) throws Exception{
		if(index == DEFAULT_SIZE){
			throw new Exception("Queue is full. Dequeue some objects");
		}
		this.data[index]=obj;
		this.index++;
	}
	
	public Cajas dequeue() throws Exception{
		if(isEmpty())throw new Exception("Queue is empty");
		Cajas obj=this.data[0];
		for(int i =0; i<this.index-1; i++){
			data[i]=data[i+1];
		}
		this.index--;
		return obj;
	}
	
	public Cajas peek() throws Exception{
		if(isEmpty())throw new Exception("Queue is empty");
			return this.data[0];
	}
	
	

}