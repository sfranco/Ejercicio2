public class Punto {

	public double x;
	public double y;
	
	public Punto() {
		// TODO Auto-generated constructor stub
	}

	@Override
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
