package filaed;

public class FilaMain {

	public static void main(String[] args) {
		
		Fila f = new Fila();
		
		f.enqueue("a");
		f.enqueue("b");
		f.enqueue("c");
		
		System.out.println(f.size());
		while (!f.isEmpty()) {
				System.out.println(f.dequeue());
		}
		
		System.out.println();
		System.out.println(f.size());
	}

}
