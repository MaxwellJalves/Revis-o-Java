###  Estudo referente a classe a Interface Comparator e Comparable Objetivo :
Criar uma lista onde ser� armazenado o ponto dos usuarios onde ser� necessario uma Classe (Ponto) com os  -
- Atributos (matriculaFuncionario,nomeFuncionario,statusFuncionario)
- Crie uma lista que ir� conter os dados do funcionario e o status
- exiba os dados pela orden��o de insersa��o,menor para o maior e ordem inversa
- utilize express�es lambdas e referencias
- crie uma nova classe e implement o Comparator. 

#Java.util.Compararators
- Java.util.Comparators	- Interface para defirinir classe com regra de ordena��o
- java.util.Comparable 	- Interface para definir regra de ordena��o em uma classe de dom�nio	

####Rascunho:
utilizado em Algoritimos de ordena��ooUtilizado Primariamente em <b>java.util.List</b>Permite a ordena��o de objetos complexos( cariados pelo usu�rio

####Observa��o:

 Quando utilizo list , e utilizado o metodo sort() n�o preciso implementar na classe que est� sendo instanciada a Interface Comparator<Object> ou Comparable<Object>.
 Optando por utilizar a Collections.sort() � obrigado a implementa��o na classe que est� sendo instanciada se n�o ocorrer� um erro de compila��o.)


