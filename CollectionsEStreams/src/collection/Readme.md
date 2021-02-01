#Collection

Arrays são funcionalidades nativas que permite que variaveis tenha mais de uma posição ou podemos gravar mais de um valor. Conjunto de Dados || Estrutuda de dados.

A Java Collenction API Foi implementada para resolver os problemas com os arrays pois os arrays são static "Uma vez criado não podemos remover ou adicionar de forma dinamica  posições ou valores dentro do array.

##Java.util.Collection  
Interface Principal da Api de Collection com funcionalidades básicas e complexas.
 
 
##Interface Java.Util.List
  - ArrayList
  - Vector
 
 * Garante uma ordem de inserção
 * Permite adição , atualização, leitura e remoção sem regras adicionais.
 * Permite ordenação através de comparators
 
## Metodo Colletions.sort()  - Ordena os dados pela ordem alfabetica.

##Interface Java.util.Queue
- Implementação de Fila - O primeiro que entra deve ser o primeiro a sair.
- Java.util.LinkedList
* Garante a ordem de inserção
* Permite adição,leitura e remoção considerando a regra básica de uma fila : Primeiro que entra , primeiro que sai.
* Não permite mudançã de ordenação.

#Metodos  -poll ,  -peel  e -element
poll() -retorna o primeiro item da fila e remove
peek() -retorna o primeiro item da fila e não remove
element() -retorn o primeiro item da fila e não remove porem se o retorno for nulo irá gerar uma exception.

## Java.util.Set
- java.util.HashSet
- java.util.TreeSet
- java.util.LinkedHashSet

- Por padrão , não garante a ordenação
- não permite itens repediros.
- permite adição e remoção normalmente, não possui busca por item e atualização, para leitura , apenas navegação.
- Não permite mudança de ordenação.

(HashSet) 
- Utilizar Quando não é necessario manter uma ordenação.
- Não é ordenado e não permite valores repetidos
- Por não ter repetição de valores e não ser ordenado , é a implementação mais performática.

(LinkedHasSet)

- Quando é necessário manter a ordem de inserção dos elementos.
- Mantém a ordem de inserção dos elementos
- E a implementação mais lenta por ser necessária manter a ordem

(TreeSet)
- Quando é necessário alterar a ordem através do uso de comparators
- Mantém ordem e pode ser reordenado
- E permormático para leitura. Para reordenar, sendo mais lento que o LinkedHashSet.

- first() - return o elemento do topo
- last()  - return o ultimo elemento da arvore
- lower() - retorn o elemento abaixo do parametrizado
- higher  - return o elemento acima do parametrizado
- pollFirst() - verifica o primeiro elemento e remove
- pollLast()  - Exibe e remove