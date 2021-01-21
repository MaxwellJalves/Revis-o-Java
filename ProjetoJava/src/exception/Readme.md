# Existe dois grupos de Exce��es no Java, onde podemos  compreender da seguinte forma:

###Checked Exceptions: [Exce��es checadas] - tratadas pelo Compilador javac

	- Exception  [Class pai de todas as Exception]
	- IOException [Class filha para tratar os erros de entrada e saida de dados]
	- SQLExceotion [Class por tratar erros de banco de dados]

As Exce��es do tipo "Checadas" fazem com que o programa n�o seja executado at� que a determinada Exce��o seja tratada.

###Unchecked Exception: [Exce��es n�o checadas]
	
	-RunTimeException [Erros de tempo de execu��o] [Class Pai das classes abaixo]
	-NullPointerException [Trata de erros de execu��o para  ponteiros nulos]
	-ArrayOutOfBoundsExceptions [trata erros de posi��es de arrays inexistente]
	
 As exce��es do tipo "N�o checadas" s� acontecem durante a execu��o do programa e desta forma n�o temos como saber , em grande parte dos casos, onde ela poder� ocorrer.