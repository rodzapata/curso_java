
public class LambdaFunction {
    //anotacion para declarar la funcion
    @FunctionalInterface

    public interface operacion {
        //metodo anbstracto
        public double suma(double x, double y);
        
    }  

    public static void main(String[] args) {
        //espresion lambda
        operacion l = (x,y) -> x + y;
        System.out.println(l.suma(5, 6));
    }
}
