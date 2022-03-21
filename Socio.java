import java.util.Scanner;
public class Socio {
	private Scanner teclado;
private String nombre;
private int antiguedad;
{
	teclado=new Scanner (System.in);
	System.out.print("Ingrese nombre: ");
	nombre=teclado.next();
	System.out.print("Ingrese antiguedad: ");
    antiguedad=teclado.nextInt();
}
public String retornarNombre()
{
	return nombre;

}
public int retornarAntiguedad()
{
	return antiguedad;
}


}
