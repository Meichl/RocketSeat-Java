package PrimeirasAulas;
/*
 * HelloWorld = Nome da minha classe
 * public = tipo de acesso da classe
 * class = tipo da classe
 */

public class HelloWorld {
    //Todo Conteudo deverá ser inserido aqui dentro
    public static void main(String[] args) {
        /*
         * Valores (int, double, float, long)
         * Texto (String)
         * Booleanos
         */
        int numero = 10;

         //if - else
         if (numero == 10){
            System.out.println("Bacana");
         } else if (numero == 12){
            System.out.println("Não bacana");
         } else{
            System.out.println("Bacana 2");
         }

         //While (Enquanto algo for verdadeiro, faça alguma coisa)
         int numero2 = 0;
         while(numero2 < 3) {
            System.out.println("Valor menor que 3");
            numero2++;
         }

         //for
         for (int i=0; i<4; i++){
            System.out.println("Valor i é : " + i);
         }
    }
}
