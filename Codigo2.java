package tipos_variables;

import java.util.Scanner;

public class Codigo2 {
	
double x1, y1, x2, y2, x3, y3;
double ab, bc, ca;

Scanner sc = new Scanner(System.in);

System.out.println("Escribe los valores del punto A:");
System.out.print("x1: ");
x1 = sc.nextDouble();
System.out.print("y1: ");
y1 = sc.nextDouble();

System.out.println("Escribe los valores del punto B:");
System.out.print("x2: ");
x2 = sc.nextDouble();
System.out.print("y2: ");
y2 = sc.nextDouble();

System.out.println("Escribe los valores el punto C:");
System.out.print("x3: ");
x3 = sc.nextDouble();
System.out.print("y3: ");
y3 = sc.nextDouble();


ab = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
bc = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
ca = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

System.out.printf("EL lado AB es = %.2f%n", ab);
System.out.printf("El lado BC es = %.2f%n", bc);
System.out.printf("El lado CA es = %.2f%n", ca);
System.out.printf("El lado CA es = %.2f%n", ca);

if (ab == bc && bc == ca) {
    System.out.println("El triángulo es Equilátero.");
} else if (ab == bc || bc == ca || ca == ab) {
    System.out.println("El triángulo es Isósceles.");
} else {
    System.out.println("El triángulo es Escaleno.");
}

sc.close();
}
}

