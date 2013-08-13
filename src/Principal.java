import java.util.Scanner;


public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double x1,y1,x2,y2,x3,y3;
		Punto p1;
		Punto p2;
		Punto p3;
		
		System.out.print("Ingrese Coordenada X1: ");
		x1 =sc.nextDouble();
		System.out.print("Ingrese Coordenada Y1: ");
		y1 =sc.nextDouble();
		System.out.print("Ingrese Coordenada X2: ");
		x2 =sc.nextDouble();
		System.out.print("Ingrese Coordenada Y2: ");
		y2 =sc.nextDouble();
		System.out.print("Ingrese Coordenada X3: ");
		x3 =sc.nextDouble();
		System.out.print("Ingrese Coordenada Y3: ");
		y3 =sc.nextDouble();
		
		p1 = new Punto(x1,y1);
		p2 = new Punto(x2,y2);
		p3 = new Punto(x3,y3);
		
		Triangulo triangulo = new Triangulo(p1,p2,p3);
		
		System.out.println(triangulo.toString());
		
		System.out.println(triangulo.TipoTriangulo());
		System.out.println("Distancia P1 a P2: "+p1.HallarDistancia(p2));
		System.out.println("Distancia P2 a P3: "+p2.HallarDistancia(p3));
		System.out.println("Distancia P3 a P1: "+p3.HallarDistancia(p1));
		
	}

}
