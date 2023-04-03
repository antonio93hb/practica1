package practica1;
import java.util.Scanner; //Importamos la librería para usar el scanner

//HOY ES UN NUEVO DÍA Y HEMOS REALIZADO OTROS CAMBIOS

/**
 * La calse notas representa las notas de cada alumno
 * calcularemos la nota total y sabremos si está aprobado 
 * o suspenso. Serán tres notas y cada una valdrá un porcentaje
 * de la nota total.
 * @version 1.0
 * @author antoniohb
 * @since 29/03/2023
 */
public class notas {
	//declaración de variables
	/**
	 * Variable que almacena la nota introducida
	 */
	double nota1, nota2, nota3;
	/**
	 *  Variables que almacenan las notas con su valor incluyendo el porcentaje y def es la suma de estas notas
	 */
	double notaPorcentaje1, notaPorcentaje2, notaPorcentaje3, notaDefinitiva;
	//utilizamos escaner para poder introducir datos
	/**
	 * Escaner de entrada de datos
	 */
	Scanner entrada = new Scanner(System.in);
	
	/**
	 * Método donde se ingresarán las notas
	 */
	
	public void ingresarNotasUf() {
		System.out.println("ingrese las notas del estudiante");
		
		System.out.print("ingrese nota 1: ");
		nota1= entrada.nextDouble();

		System.out.print("ingrese nota 2: ");
		nota2= entrada.nextDouble();
		
		System.out.print("ingrese nota 3: ");
		nota3= entrada.nextDouble();
	}
	
	/**
	 * Método para comprobar que las notas estén bien introducidas
	 */
	public void comprobarNotas(){
		
		if (nota1>10) {
			System.out.println(" nota1 mal introducida");
			
		}else {
			System.out.println(" nota1 correcta");
		}
		
		if (nota2>10) {
			System.out.println(" nota2 mal introducida");
			
		}else {
			System.out.println(" nota2 correcta");
		}
		if (nota3>10) {
			System.out.println(" nota3 mal introducida");
			
		}else {
			System.out.println(" nota3 correcta");
		}
	}
	
	/**
	 * Método para el cálculo de notas total, 
	 * la uf1 un 35%,
	 * la uf2 un 35%,
	 * la uf3 un 30% y
	 * def es la nota definitiva
	 * NO MUESTRA NADA, SOLO ALMACENA Y CALCULA
	 */
	public void calcularPorcentajeNotas() {
		notaPorcentaje1= nota1*0.35;
		notaPorcentaje2 = nota2 * 0.35;
		notaPorcentaje3 = nota3 * 0.30;
		
		notaDefinitiva = notaPorcentaje1 + notaPorcentaje2+ notaPorcentaje3;
		
	}
	/**
	 * Método para mostrar en pantalla las 3 notas introducidas,
	 *  las 3 notas con su porcentaje aplicado y la 
	 *  nota definitiva
	 */
	public void mostrarTodo() {
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + nota1);
		System.out.println(" nota2 = " + nota2);
		System.out.println(" nota3 = " + nota3);
		
		System.out.println(" acumuado 1 = "+ notaPorcentaje1);
		System.out.println(" acumuado 2 = "+ notaPorcentaje2);
		System.out.println(" acumuado 3 = "+ notaPorcentaje3);
		
		System.out.println(" nota definitiva es = "+ notaDefinitiva);
		
	}
	/**
 	 *  Método que comprueba si la nota definitiva es aprobada,
 	 *   suspensa o hay un error
 	 */
	public void comprobarAprobado() {
			
			if(notaDefinitiva<5 && notaDefinitiva>=0) {
				System.out.println("suspendio");
			}else {
				if (notaDefinitiva>=5 && notaDefinitiva<=10 ) {
				System.out.println("aprobado");
				}else {
					System.out.println(" error en la notas");
				}
			}
		}
		
	/**
	 * Clase de arranque donde instanciamos la clase notas y llamamos a todos los métodos uno tras otro
	 * @param args
	 */
	public static void main(String[] args) {
		notas fc= new notas();
		
		fc.ingresarNotasUf();
		
		fc.comprobarNotas();
		

		fc.calcularPorcentajeNotas();
		
		fc.mostrarTodo();
		
		fc.comprobarAprobado();	
	}
}

