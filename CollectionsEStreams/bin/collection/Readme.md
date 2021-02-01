#Collection

Arrays s�o funcionalidades nativas que permite que variaveis tenha mais de uma posi��o ou podemos gravar mais de um valor. Conjunto de Dados || Estrutuda de dados.

A Java Collenction API Foi implementada para resolver os problemas com os arrays pois os arrays s�o static "Uma vez criado n�o podemos remover ou adicionar de forma dinamica  posi��es ou valores dentro do array.

##Java.util.Collection  
Interface Principal da Api de Collection com funcionalidades b�sicas e complexas.
 
 
##Interface Java.Util.List
  - ArrayList
  - Vector
 
 * Garante uma ordem de inser��o
 * Permite adi��o , atualiza��o, leitura e remo��o sem regras adicionais.
 * Permite ordena��o atrav�s de comparators
 
## Metodo Colletions.sort()  - Ordena os dados pela ordem alfabetica.

##Interface Java.util.Queue
- Implementa��o de Fila - O primeiro que entra deve ser o primeiro a sair.
- Java.util.LinkedList
* Garante a ordem de inser��o
* Permite adi��o,leitura e remo��o considerando a regra b�sica de uma fila : Primeiro que entra , primeiro que sai.
* N�o permite mudan�� de ordena��o.

#Metodos  -poll ,  -peel  e -element
poll() -retorna o primeiro item da fila e remove
peek() -retorna o primeiro item da fila e n�o remove
element() -retorn o primeiro item da fila e n�o remove porem se o retorno for nulo ir� gerar uma exception.

## Java.util.Set
- java.util.HashSet
- java.util.TreeSet
- java.util.LinkedHashSet

- Por padr�o , n�o garante a ordena��o
- n�o permite itens repediros.
- permite adi��o e remo��o normalmente, n�o possui busca por item e atualiza��o, para leitura , apenas navega��o.
- N�o permite mudan�a de ordena��o.

(HashSet) 
- Utilizar Quando n�o � necessario manter uma ordena��o.
- N�o � ordenado e n�o permite valores repetidos
- Por n�o ter repeti��o de valores e n�o ser ordenado , � a implementa��o mais perform�tica.

(LinkedHasSet)

- Quando � necess�rio manter a ordem de inser��o dos elementos.
- Mant�m a ordem de inser��o dos elementos
- E a implementa��o mais lenta por ser necess�ria manter a ordem

(TreeSet)
- Quando � necess�rio alterar a ordem atrav�s do uso de comparators
- Mant�m ordem e pode ser reordenado
- E permorm�tico para leitura. Para reordenar, sendo mais lento que o LinkedHashSet.

- first() - return o elemento do topo
- last()  - return o ultimo elemento da arvore
- lower() - retorn o elemento abaixo do parametrizado
- higher  - return o elemento acima do parametrizado
- pollFirst() - verifica o primeiro elemento e remove
- pollLast()  - Exibe e remove