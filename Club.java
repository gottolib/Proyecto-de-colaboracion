
public class Club {
	private Socio socio1, socio2, socio3;

	public Club() {
		socio1 = new Socio();
		socio2 = new Socio();
        socio3 = new Socio();
	}
	public void Registrar()
	{
		socio1.retornarNombre(); 
	    socio1.retornarAntiguedad();
	    socio2.retornarNombre(); 
	    socio2.retornarAntiguedad();
	    socio3.retornarNombre(); 
	    socio3.retornarAntiguedad();
	}
	public void imprimir()
	{
		System.out.println(socio1.retornarNombre () + " tiene " + socio1.retornarAntiguedad () + " años de antiguedad.");
		System.out.println(socio2.retornarNombre () + " tiene " + socio2.retornarAntiguedad () + " años de antiguedad.");
		System.out.println(socio3.retornarNombre () + " tiene " + socio3.retornarAntiguedad () + " años de antiguedad.");
	}
	public void mayorAntiguedad()
	{
		if (socio1.retornarAntiguedad()>socio2.retornarAntiguedad () && socio1.retornarAntiguedad()>socio3.retornarAntiguedad())
			
		{
			System.out.println("El socio con mayor antiguedad es el Socio Nª 1.");
		}
		else
		{
			if (socio2.retornarAntiguedad()>socio1.retornarAntiguedad () && socio2.retornarAntiguedad()>socio3.retornarAntiguedad())
			{
				System.out.println("El socio con mayor antiguedad es el Socio Nª 2.");
			}
			else
			{
				if (socio3.retornarAntiguedad()>socio1.retornarAntiguedad () && socio3.retornarAntiguedad()>socio2.retornarAntiguedad())
				{
					System.out.println("El socio con mayor antiguedad es el Socio Nª 3.");
				}
				else
				{
					System.out.println("Todos los socios tienen la misma antiguedad en el club.");
				}
			}
		}
	}
	public static void main (String [] ar)
	{
		Club club1 = new Club ();
		club1.Registrar();
		club1.imprimir();
		club1.mayorAntiguedad();
	}
	
}
