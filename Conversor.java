
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package conversor;

import java.util.Scanner;

/**
*
* @author -Daniel
*/
public class Conversor {
    Scanner scanner = new Scanner(System.in);
    public double tasaPD = 0.00034;
    public double tasaD = 2923;
    public double tasaE = 3486;
    public double tasaPE = 0.00029;
    
    public int contador(int x){
        x=x+1;
        return (x);
    }
    public double positivo(double cant){
        while(cant<0){
            System.out.println("ingrese un valor positivo: ");
            cant=scanner.nextDouble();
        }
        return cant;
    }
    public double euros_a_pesos(double cant){
        return cant*tasaE;
    }
    public double pesos_a_euros(double cant){
        return cant*tasaPE;
    }
    public double dolares_a_pesos(double cant){
        return cant * tasaD;
    }
    
    public double pesos_a_dolares(double cant){
        return cant * tasaPD;
    }

    /**
    * @param args the command line arguments
   
     * @param args */
    public static void main(String[] args) {
        Conversor c = new Conversor();
        c.convertir();
    }

    void convertir(){
        int x=0;
        double cantidad;
        int op;
        double resultado;
        int break_while = 1;

        while(break_while == 1){
            System.out.println(" ");
            System.out.println("1. Pesos a Dolares");
            System.out.println("2. Dolares a pesos");
            System.out.println("3. pesos a euros");
            System.out.println("4. euros a pesos");
            System.out.println("5. Salir");
            System.out.print("Seleccione la operacion deseada: ");
            //Scanner scanner = new Scanner(System. in); 
            op = scanner.nextInt();

            switch(op){
                case 1:
                    System.out.println("Ingrese los pesos a convertir");
                    cantidad = scanner.nextDouble();
                    cantidad = positivo(cantidad);
                    resultado=pesos_a_dolares(cantidad);
                    System.out.println(resultado);
                    System.out.println("conversiones hechas: "+contador(x));
                    break;
                case 2:
                    System.out.println("Ingrese los dolares a convertir");
                    cantidad = scanner.nextDouble();
                    cantidad = positivo(cantidad);
                    resultado=dolares_a_pesos(cantidad);
                    System.out.println(resultado);
                    System.out.println("conversiones hechas: "+contador(x));
                    break;
                
                case 3:
                    System.out.println("Ingrese los pesos a convertir");
                    cantidad = scanner.nextDouble();
                    cantidad = positivo(cantidad);
                    resultado=pesos_a_euros(cantidad);
                    System.out.println(resultado+contador(x));
                    System.out.println("converciones hechas: "+contador(x));
                    break;
                case 4:
                    System.out.println("Ingrese los euros a convertir");
                    cantidad = scanner.nextDouble();
                    cantidad = positivo(cantidad);
                    resultado=euros_a_pesos(cantidad);
                    System.out.println(resultado);
                    System.out.println("conversiones hechas: "+contador(x));
                    break;
                case 5:
                    break_while = 0;
                    break;
            }
        }
    }
}
