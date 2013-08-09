
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p1;
		Punto p2;
		Punto p3;
		
		p1 = new Punto(1,2);
		p2 = new Punto(3,7);
		p3 = new Punto(4,4);
		
		Triangulo triangulo = new Triangulo(p1,p2,p3);
		
		System.out.println(triangulo.TipoTriangulo());
		
		
	}

}
