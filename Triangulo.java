
public class Triangulo {

	public Punto vertice1, vertice2, vertice3;
	
	public Triangulo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String coordenada;
		coordenada = "[" + vertice1 + "," + vertice2 + "," + vertice3 + "]";
		return coordenada;
	}

	
	public double HallarPerimetro()
	{
	double perimetro;
	perimetro=vertice1.HallarDistancia(vertice1)+vertice2.HallarDistancia(vertice2)+vertice3.HallarDistancia(vertice3);
	
	return perimetro;	
	}
	
	public String TipoTriangulo()
	{
	String Triangulo;
	Triangulo = null;
	if (vertice1.HallarDistancia(vertice1)==vertice2.HallarDistancia(vertice2) && vertice2.HallarDistancia(vertice2)==vertice3.HallarDistancia(vertice3))
	{
	Triangulo = "Equilatero";	
	
	}
	else
		if(vertice1.HallarDistancia(vertice1)==vertice2.HallarDistancia(vertice2) &&vertice2.HallarDistancia(vertice2)!=vertice3.HallarDistancia(vertice3))
			{
			Triangulo = "Isoceles";
			}
			else
				{
				Triangulo= "Escaleno";
				}
	
	
	return Triangulo;
	}
	
	
	
	
	
}
