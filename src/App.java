import java.util.Scanner;

/**
 * Essa classe deve exibir a tabuada de 1 a 10 baseado no numero de entrada 
 */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println(" digite o número da tabuada ");
        int numerodatabuada=in.nextInt();

        // y começa com o valor 1 e sera executado até
        // que y seja menor ou igual a 10!
        for (int y=1  ;y<=10  ;y=y+1 ){
         
            System.out.print(numerodatabuada+" X "+y+" = ");
            System.out.println(numerodatabuada *y);

        }
        /* 
        for (int x=2  ;x<=10  ;x=x+2 ){

            System.out.println("valor de x - "+x);

        }*/

        

    }
}
