import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class TipoArray {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

//        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(11);
        numeros.add(8);
        numeros.add(9);
        numeros.add(15);
        numeros.add(39);
        numeros.add(1);
        numeros.add(4);
        numeros.add(83);

        //metodo funcional o imperativo
        System.out.println("el primer valor de la lista es "+numeros.get(0));

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
