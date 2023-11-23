import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        //lista de numeros inteiros.
        List<String> list = new ArrayList<>();

       //ADICIONAR ELEMENTOS NA LISTA
        //adicionando nomes na lista.
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        //adicionando elemento na posicao 2, faço a sobrecarga.
        list.add(2, "Marco");

        //VER O TAMANHO DA LISTA
        //ver o tamanho da lista com size()
        System.out.println(list.size());
        //FAZENDO FOREACH PARA PERCORRER A LISTA
        //imprimindo a lista atraves do foreach que percorre a lista.
        System.out.println("---Nomes da lista apos adicionar elementos ");
        for (String nomes : list) {
            System.out.println(nomes);
        }

        System.out.println("---------------------------------");
        //REMOVER ELEMENTOS DA LISTA
        //remover um elemento da lista, onde a lista compara um valor com outro valor e remove, nesse caso a Anna.
        list.remove("Anna");
        //outra forma de remover um elemento da lista, nesse caso ele remove o elemento 1 da lista.
        list.remove(1);
        //e pode tambem remover da lista os elementos que atendam a um predicado. exemplo remover todos os nomes que começam com a letra 'M'.
        //essa funcao lambida dentro dos parenteses, chamamos de predicado, pq ela vai me retornar verdadeiro ou falso.
        list.removeIf(x -> x.charAt(0) == 'M');
        //imprimindo a lista atraves do foreach que percorre a lista.
        System.out.println("---Nomes da lista apos remover elementos ");
        for (String nomes : list) {
            System.out.println(nomes);
        }
        //ACHANDO ELEMENTOS DA LISTA, USANDO INDEXOF();
        //para achar um elemento na lista, usamos o indexOf().
        System.out.println("---Achando elementos na lista usando indexOf()");
        System.out.println("Index of Bob " + list.indexOf("Bob"));
        //para achar um elemento que nao esta na lista, nesse caso ele da o resultado -1.
        System.out.println("Index of Antonio " + list.indexOf("Antonio"));

        System.out.println("-------------------------------");
        //adicionando nomes na lista.
        list.add("Maria");
        list.add("Alex");
        list.add("Anna");
        System.out.println("---Nomes da lista ");
        for (String nomes : list) {
            System.out.println(nomes);
        }
        //FAZENDO FILTRO NA LISTA, FICA SOMENTE OS NOMES QUE COMECAM COM A LETRA 'A', TEM QUE USAR STREAM, E FILTER, E COLLECT E TOLIST.
        //quero que fique na lista somente esses elementos que começam com a letra 'A'.
        //tenho que pegar a minha lista e transformar ela para stream. esse stream ele aceita as expressoes lambda. e a partir desse stream vou chamar o filter, e esse filter recebe o predicado...
        //esse filter vai me devolver um stream filtrado conforme esse predicado..
        //mas esse stream nao é compativel com o list, entao tenho que pegar esse stream e converter de novo para lista,e  pra isso chamo a funcao collect
        //fica mais verboso mas essa foi a forma que o java8 arrumou pra manter a comptibilidade com o list que é um tipo antigo, e permitir que eu possa fazer operacoes de lambida com o tipo list.
        //**entao em resumo fica assim: primeiro eu converto a lista para strem, depois faço a operacao lambida que eu quero, e depois tenho que voltar ele para lista que é esse comando collect.
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        System.out.println("---Lista somente com nomes que começam com a letra 'A' ");
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("-------------------------------");
        //encontrar o primeiro elemento da minha lista que comeca com a letra 'A'.
        //usamos pra isso o findFirs() que vai pegar o primeiro elemento desse stream. e por fim chamo o orElse passando nulo.
        //ou seja esse findFirst() vai pegar o primeiro elemento do stream que atende ao predicado desejado, e se nao existir o predicado entao ele retorna nulo.
        //nao podemos esquecer que para filtrarmos uma lista, temos que usar o stream primeiro e depois o filter.
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
    }
}
