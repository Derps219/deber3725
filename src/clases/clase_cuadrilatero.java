package clases;

public class clase_cuadrilatero {
   int lado1, lado2; 

    public clase_cuadrilatero(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public clase_cuadrilatero(int lado1) {
        this.lado1 = this.lado2=lado1;
    }
   
    public int area(){
        return lado1*lado2;
    }
    
    public int perimetro(){
        return (lado1+lado2)*2;
    }
    public static void main(String[] args){
    clase_cuadrilatero ob1 = new clase_cuadrilatero(5 ,3 );
        System.out.println("rectangualo");
        System.out.println("area= "+ob1.area());
        System.out.println("perimetro= "+ob1.perimetro());

        clase_cuadrilatero ob2 = new clase_cuadrilatero(8);
        System.out.println("cuadrado");
        System.out.println("area= "+ob2.area());
        System.out.println("perimetro= "+ob2.perimetro());
        
    }
}