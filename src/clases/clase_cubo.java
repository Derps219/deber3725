package clases;

public class clase_cubo {
int a, b, c;

    public clase_cubo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public clase_cubo() {
    }

    public int calculavolumen(int a, int b, int c){
        return a*b*c;
        
    }

    public static void main(String[] args) {
        
        int resultado = 0;
        
        clase_cubo ob1 = new clase_cubo();
        resultado = ob1.calculavolumen(3, 2, 6);
        System.out.println("volumen="+resultado);
        
   
        

    }
    
}