package eclipse_cloud;

public class triangulo {

    public static void main(String[] args) {
       
  
       
 
        System.out.println();
        for(int altura = 1; altura<=4; altura++){
            //Espacios en blanco
            for(int blancos = 1; blancos<=4-altura; blancos++){
                System.out.print(" ");
            }
 
            //Asteriscos
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
