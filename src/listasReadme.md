*tamanho da lista
size()

*inserir elementos na lista
add(obj)
add(int, obj)

*remover elementos da lista
remove(obj)
remove(int)
removeIf(predicado)

*encontrar posicao de elemento
indexOf(obj)
lastIndexOf(obj)

*filtrar lista com base no predicado
List<Integer> result = list.stream().filter(x -> x > 4).collect(collectors.toList());

*encontrar primeira ocorrencia com base em predicado
Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
----------------------------------------------------------------------------------
obs uma List é uma interface, ela nao pode ser instanciada, entao temos que fazer uma classe que implementa a interface, que pode ser uma classe ArrayList. 
obs o ArrayList é tao usado pq ele pega o melhor do vetor e da lista. 
obs a lista nao aceita tipos primitivos, ja o vetor aceita tipos primitivos. por isso na lista usamos o <Integer> por exemplo que é uma classe Wrapper, ao inves de usar int que seria...
para tipos primitivos.
obs o que fica entre < >  é o generics, ou seja é poder parametrizar o tipo de lista que esta trabalhando.  
obs da pra remover elemento pelo pre
