package Capitulo05;

public class Empregado {
private String endereco;
private int idade;

 void setEndereco(String endereco) {
this.endereco=endereco;
}
 void setIdade(int idade) {
	 this.idade=idade;
 }
 
 String mostrarDados (){
	 return endereco + idade;
 }
}
