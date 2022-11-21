package filaed;

public class Fila {
	
	Elemento inicio;
	Elemento cabeca;
	int tamanho;
	
	Fila() {
		cabeca = null;
		inicio = null;
		tamanho = 0;
	}
	
	public String front() {
		
		if (cabeca == null) {
			return null;
		}
		return cabeca.info;
		
	}
	
	public boolean isEmpty() {
		return inicio == null;
	}
	
	public void enqueue(String info) {
		
		Elemento elemento = new Elemento();
		elemento.info = info;
		elemento.proximo = inicio;
		inicio = elemento;
		
		if(tamanho == 0) {
			cabeca = elemento;
		}
		tamanho++;
	
	}
	
	public String dequeue() {
		
		if (isEmpty()) {
			return null;
		}
		
		String info = cabeca.info;
		
		if (tamanho == 1) {
			inicio = null;
			cabeca = null;
		} else {
			Elemento local = inicio;
			while (local.proximo != cabeca) {
				local = local.proximo;
			}
			cabeca = local; 
			cabeca.proximo = null;
		}
		return info;
	}
	public int size() {
		return tamanho;
	}
}
