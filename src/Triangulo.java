
public class Triangulo {

	public Punto vertice1, vertice2, vertice3;

	public Triangulo(Punto vertice1, Punto vertice2, Punto vertice3) {
		super();
		this.vertice1 = vertice1;
		this.vertice2 = vertice2;
		this.vertice3 = vertice3;
	}


	public String toString() {
		// TODO Auto-generated method stub
		String coordenada;
		coordenada = "[" + " Vertice1: " + vertice1 + "," + " Vertice 2: " + vertice2 + "," + " Vertice 3: " + vertice3 + "]";
		return coordenada;
	}

	
	public double HallarPerimetro()
	{
	double perimetro;
	perimetro=vertice1.HallarDistancia(vertice2)+vertice2.HallarDistancia(vertice3)+vertice3.HallarDistancia(vertice1);
	return perimetro;	
	}
	
	public String TipoTriangulo()
	{
	String Triangulo;
	Triangulo = null;
	if (vertice1.HallarDistancia(vertice2)==vertice2.HallarDistancia(vertice3) && vertice2.HallarDistancia(vertice3)==vertice3.HallarDistancia(vertice1) && vertice3.HallarDistancia(vertice1)==vertice1.HallarDistancia(vertice2))
	{
	Triangulo = "Tipo de Triangulo: Equilatero";	
	
	}
	else
		if(vertice1.HallarDistancia(vertice2)!=vertice2.HallarDistancia(vertice3) && vertice2.HallarDistancia(vertice3)!=vertice3.HallarDistancia(vertice1)  && vertice3.HallarDistancia(vertice1)!=vertice1.HallarDistancia(vertice2))
			{
			Triangulo = "Tipo de Triangulo: Escaleno";
			}
			else
				{
				Triangulo= "Tipo de Triangulo: Isoceles";
				}
	return Triangulo;
	}

}
