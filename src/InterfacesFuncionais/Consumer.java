/**
* Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
* É utilizada principalmente para realizar ações ou efeitos colaterais nos elementos do Stream sem modificar ou retornar um valor
**/

package InterfacesFuncionais;

import java.util.Arrays;
import java.util.List;

public class Consumer {

    public static void main(String[] args) {

        //criar uma lista de números inteiros

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //usar o Consumer como expressão lambda para imprimir números pares
        java.util.function.Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        //usar o Consumer para imprimir números pares
//        numeros.stream().forEach(imprimirNumeroPar);
        numeros.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });
    }
}
