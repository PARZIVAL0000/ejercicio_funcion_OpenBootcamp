public class Main{
	public static void main(String[] args){
	
		//Una funcion que tiene tres parametros que se suman entre si.
		suma(10, 20, 30);
	
		Coche miCoche = new Coche();
		auto.AumentarPuertas();
		System.out.println(miCoche.puertas);
	}
	
	
	public static void suma(int n1, int n2, int n3){
		System.out.println(n1 + n2 + n3);
	}
}

class Coche{
	public int puertas = 0;
	
	public void AumentarPuertas(){
		this.puertas++;
	}
	
	public void DisminuirPuertas(){
		this.puertas--;
	}
}

