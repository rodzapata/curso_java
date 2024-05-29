import java.util.List;
import java.util.OptionalDouble;

public class App {
    public static void main(String[] args) throws Exception {
        //metodo declarativo
        List<Integer> numeros= List.of(11, 8, 9, 15, 39, 1, 4, 83);

        int contador=0;
        for (int valor : numeros) {
            if (valor>10){
                contador++;
            }
        }
        System.out.println("la cantidad de elementos mayores que 10 son: "+contador);

        System.out.println("el primer valor de la lista es "+numeros.get(0));
        //metodo funcional o imperativo
        Long resultado = numeros.stream().filter(num -> num > 10).count();
        Double suma= numeros.stream().mapToDouble(e -> e).sum();
        Long contar= numeros.stream().mapToLong(e-> e).count();
        OptionalDouble promedio= numeros.stream().mapToDouble(e -> e).average();
        System.out.println("la suma es "+suma);
        System.out.println("Cantidad de elementos "+contar);
        System.out.println("promedio "+promedio);
        System.out.println("el resultado es : "+resultado);

    }
}
