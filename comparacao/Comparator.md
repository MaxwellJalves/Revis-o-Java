###  Estudo referente a classe a Interface Comparator e Comparable Objetivo :
Criar uma lista onde será armazenado o ponto dos usuarios onde será necessario uma Classe (Ponto) com os  -
- Atributos (matriculaFuncionario,nomeFuncionario,statusFuncionario)
- Crie uma lista que irá conter os dados do funcionario e o status
- exiba os dados pela ordenção de insersação,menor para o maior e ordem inversa
- utilize expressões lambdas e referencias
- crie uma nova classe e implement o Comparator. 

#Java.util.Compararators
- Java.util.Comparators	- Interface para defirinir classe com regra de ordenação
- java.util.Comparable 	- Interface para definir regra de ordenação em uma classe de domínio	

####Rascunho:
utilizado em Algoritimos de ordenaçãooUtilizado Primariamente em <b>java.util.List</b>Permite a ordenação de objetos complexos( cariados pelo usuário

####Observação:

 Quando utilizo list , e utilizado o metodo sort() não preciso implementar na classe que está sendo instanciada a Interface Comparator<Object> ou Comparable<Object>.
 Optando por utilizar a Collections.sort() é obrigado a implementação na classe que está sendo instanciada se não ocorrerá um erro de compilação.)


