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
