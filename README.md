#REVISAO JAVA 

# Existe dois grupos de Exceções no Java, onde podemos  compreender da seguinte forma:

###Checked Exceptions: [Exceções checadas] - tratadas pelo Compilador javac

	- Exception  [Class pai de todas as Exception]
	- IOException [Class filha para tratar os erros de entrada e saida de dados]
	- SQLExceotion [Class por tratar erros de banco de dados]

As Exceções do tipo "Checadas" fazem com que o programa não seja executado até que a determinada Exceção seja tratada.

###Unchecked Exception: [Exceções não checadas]
	
	-RunTimeException [Erros de tempo de execução] [Class Pai das classes abaixo]
	-NullPointerException [Trata de erros de execução para  ponteiros nulos]
	-ArrayOutOfBoundsExceptions [trata erros de posições de arrays inexistente]
	
 As exceções do tipo "Não checadas" só acontecem durante a execução do programa e desta forma não temos como saber , em grande parte dos casos, onde ela poderá ocorrer.
 
 
 ##Package comparacao
 ###  Estudo referente a classe a Interface Comparator e Comparable Objetivo :
Criar uma lista onde será armazenado o ponto dos usuarios onde será necessario uma Classe (Ponto) com os  -
- Atributos (matriculaFuncionario,nomeFuncionario,statusFuncionario)
- Crie uma lista que irá conter os dados do funcionario e o status
- exiba os dados pela ordenção de insersação,menor para o maior e ordem inversa
- utilize expressões lambdas e referencias
- crie uma nova classe e implement o Comparator.


#Java.util.Compararator

- Java.util.Comparators	- Interface para defirinir classe com regra de ordenaçã

- java.util.Comparable 	- Interface para definir regra de ordenação em uma classe de domínio


####Rascunho:
utilizado em Algoritimos de ordenação
Utilizado Primariamente em <b>java.util.List</b
Permite a ordenação de objetos complexos( cariados pelo usuário

####Observação:

 Quando utilizo list , e utilizado o metodo sort() não preciso implementar na classe que está sendo instanciada a Interface Comparator<Object> ou Comparable<Object>.
 Optando por utilizar a Collections.sort() é obrigado a implementação na classe que está sendo instanciada se não ocorrerá um erro de compilação.
