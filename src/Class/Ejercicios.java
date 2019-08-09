package Class;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios {
	
	private void OrdenarMayorAMenor(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int aux = array[i];
					array[i] = array[j];
					array[j] = aux;					
				}
			}
		}
	}
	
	private String NumPerfecto(int num){
		int val = 0;
		for (int i = 1; i < num; i++) {			
			if(0 == num%i){
				val += i;
			}
		}
		return val==num ? "El numero "+ num +" Es perfecto" : "El numero "+ num +" NO es perfecto";
	}
	
	private String Palindromo(String str){
		for (int i = 0, j = str.length()-1; i < str.length() && j >= 0; i++, j--) {
			if(str.charAt(i) == str.charAt(j)){
				return "La palabra es PALINDROMO";
			}
		}
		return "La palabra NO es PALINDROMO";
	}
	
	private void Menu(){
		int num = -1; int numA = 0; int numB = 0;
		while (num != 0) {
			System.out.println("-----BIENVENIDO-----");
			System.out.println("1- SUMAR");
			System.out.println("2- RESTAR");
			System.out.println("3- MULTIPLICAR");
			System.out.println("4- DIVIDIR");
			System.out.println("0- SALIR");
			Scanner reader = new Scanner(System.in);
			num = reader.nextInt();
			switch (num) {
			case 1:
				System.out.println("Ingrese los numeros a sumar");
				System.out.println("valor A: ");
				numA = reader.nextInt();
				System.out.println("valor B: ");
				numB = reader.nextInt();
				System.out.println("La suma es: "+ (numA+numB));
				break;
			case 2:
				System.out.println("Ingrese los numeros a restar");
				System.out.println("valor A: ");
				numA = reader.nextInt();
				System.out.println("valor B: ");
				numB = reader.nextInt();
				System.out.println("La resta es: "+ (numA-numB));
				break;
			case 3:
				System.out.println("Ingrese los numeros a multiplicar");
				System.out.println("valor A: ");
				numA = reader.nextInt();
				System.out.println("valor B: ");
				numB = reader.nextInt();
				System.out.println("La multiplicación es: "+ (numA*numB));
				break;
			case 4:
				System.out.println("Ingrese los numeros a dividir");
				System.out.println("valor A: ");
				numA = reader.nextInt();
				System.out.println("valor B: ");
				numB = reader.nextInt();
				if(numB == 0){
					System.out.println("Error");
				}
				else
				{
					System.out.println("La división es: "+ (numA/numB));
				}				
				break;
			case 0:
				break;

			default:
				System.out.println("El numero ingresado no está en el menu!!!");
				break;
			}
		}
		
		if(num == 0){
			System.out.println("CHAO");
		}
	}
		
	private int Factorial(int num){
		int fac = 1;
		for (int i = 1; i <= num; i++) {
			fac = fac*i;				
		}
		return fac;
	}
	
	private void mostrarFactorial(int num){
		int fac = 1;
		String cadena = "";
		for (int i = 1; i < num; i++) {
			cadena += ""+i+" x ";
		}
		cadena = num+"! = " + cadena + num + " = " + Factorial(num);
		System.out.println(cadena);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicios ej = new Ejercicios();
		
		/*int[] arr = {4,2,3,1,5,-1,0,100,-11};
		ej.OrdenarMayorAMenor(arr);
		System.out.println(Arrays.toString(arr));*/
		
		//Perfecto si la suma de sus divisores es el mismo
		//Ejemplo 6 xq 3+2+1=6
		/*System.out.println(ej.NumPerfecto(6));
		System.out.println(ej.NumPerfecto(8128));*/
		
		//Palindromo si sus letras son iguales si se lee al derecho o alrevez
		//Ej sus
		/*System.out.println(ej.Palindromo("sus"));
		System.out.println(ej.Palindromo("sugus"));
		System.out.println(ej.Palindromo("amor a roma"));*/
		
		//Menu		
		//ej.Menu();
		
		//Factorial
		//System.out.println("El numero factorial es: "+ej.Factorial(6));
		
		ej.mostrarFactorial(10);
	}

}
