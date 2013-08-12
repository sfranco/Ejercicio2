public class Punto {

	public double x;
	public double y;
	
	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public String toString() {
		// TODO Auto-generated method stub
		String coordenada;
		coordenada = "[" + x + "," + y + "]";
		return coordenada;
	}
	
	public double HallarDistancia(Punto z)
	{
		double coordenada;
		coordenada=0;
		coordenada=Math.sqrt(Math.pow(this.x-z.x,2)+Math.pow(this.y-z.y,2));
		return coordenada; 
		
	}
	

}

