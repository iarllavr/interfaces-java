/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente utilizada para criar ou fornecer novos objetos de um determinado tipo.
 **/

package InterfacesFuncionais;

import java.util.List;
import java.util.stream.Stream;

public class Supplier {

    public static void main(String[] args) {
        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        java.util.function.Supplier<String> saudacao = () -> "Olá, seja bem vindo(a)";

        // Usar o Supplier para obter uma lista com 5 expressões
        List<String> listaSaudacoes = Stream.generate(saudacao).toList()
                .stream().limit(3)
                .toList();

        // Imprimir as saudações geradas usando o method reference (sugerido pela IDE)
        listaSaudacoes.forEach(System.out::println);
    }

}
