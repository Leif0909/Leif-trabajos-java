package tipos_variables;

import java.util.Scanner;

public class variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int numero, edad, caso =12 ;
			char sexo = 'f';
			boolean flag = true; // variables logicas  false / true
			double precio = 45.4;
			float cantidad = 77; 
			String nombre = "Leif";
			
			System.out.println("hola"+ precio);
			System.out.print("hola" + cantidad +"total");
			
			Scanner captura = new Scanner(System.in);
			
			while(flag) {
				System.out.println("Selecciona Menu una opcion");
				System.out.println("1. Suma ");
				System.out.println("2. Resta ");
				System.out.println("3. Salir");
				int op = captura.nextInt();
				
					int result,num1,num2;
					
					switch(op) {
					case 1: 
						System.out.println("Valor 1");
					    num1 = captura.nextInt(); 
						System.out.println("Valor 2");
						num2= captura.nextInt(); 
						result= num1+num2 ;
						System.out.println("Resultado: "+ result);
					case 2: 
						System.out.println("Valor 1");
						num1 = captura.nextInt(); 
						System.out.println("Valor 2");
						num2= captura.nextInt(); 
						result= num1-num2 ;
						System.out.println("Resultado: "+ result);
					case 3:
						flag = false;
						break; 
			}
	}}

}
