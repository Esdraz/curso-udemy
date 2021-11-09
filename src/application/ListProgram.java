package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListProgram {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        //adicionar elemento na posição 2 da lista.
        list.add(2, "Marco");

        //exibir o tamanho da lista
        System.out.println("List size: " + list.size());
        System.out.println("-----------------------");
        //Exibir a lista
        for (String x : list) {
            System.out.println(x);
        }
        //remove o elemento na posição 1.
        //list.remove(1);
        System.out.println("-----------------------");
        //remover por predicado todos os elementos começados com M.
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("-----------------------");
        //lista em qual posição o elemento está indexado.
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        //OBS: quando o elemento não existe na lista é mostrado o index -1
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        System.out.println("-----------------------");
        //listar elemento começado com a letra B.
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("-----------------------");
        //listar o primeiro elemento da lista que começa com A, caso não exista retorna null.
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);

    }
}
