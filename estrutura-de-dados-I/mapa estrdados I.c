/* Curso SUPERIOR DE TECNOLOGIA EM AN�LISE E DESENVOLVIMENTO DE SISTEMAS
   Disciplina Estrutura de Banco de Dados
   Professor Pietro Martins
   Academico Cristine Siqueira Dias
   RA: 21072066-5  */

#include <stdio.h>
#include <stdlib.h>
//Necess�rio para usar setlocale
#include <locale.h> 
//Constante que define o tamaho max estrutura
#define tamanho 5

// Declara��o de pilha.
typedef struct tipo_pilha{
	int dados[tamanho];
	int ini;
	int topo;
}tipo_pilha;
//Criando uma variavel tipo_pilha para receber o primeiro empilhamento.
tipo_pilha pilha;
//Declara��o da nova pilha.
typedef struct tipo_repilha{
	int dados[tamanho];
	int ini;
	int topo;
}tipo_repilha;
//Criando uma variavel tipo_repilha para receber o segundo empilhamento.
tipo_repilha repilha;

//Procedimento que empilha um novo elemento no topo.
void empilha (int elemento){
	// Verifica se existe aiguma posi��o para uma inser��o.
	if(pilha.topo==tamanho){
		//Se pilha estiver cheia, n�o � possivel empilhar(preven��o para caso tenha insers�o por usu�rio).
		printf("Pilha cheia!\n");
		system("pause");
	}
	else{
		/*Se a pilha n�o estiver cheia:
		-Add novo elemento no topo
		-Incrementa o topo*/
		pilha.dados[pilha.topo]=elemento;
		pilha.topo++;
	}
}
//Fun��o desempilha e rotorna elemento topo retirado.
int desempilha(){
	//variavel que guarda um backup elemento desempilhado.
	int elemento;
	//verifica se existe algum elemento disponivel para remo��o(preven��o para caso tenha insers�o por usu�rio).
	if(pilha.topo==pilha.ini){
		printf("Pilha vazia!\n");
		system("pause");
	}
	else{
		/*Se a pilha n�o estiver vazia:
		-Decrementa o topo
		-Retorna o elemento que esta no topo*/
		pilha.topo--;
		elemento=pilha.dados[pilha.topo];
		return elemento;
	}
}

//Procedimento para fazer a nova pilha.
void novaPilha (int elemento){
	// verifica se existe aiguma posi��o para uma inser��o.
	if(repilha.topo==tamanho){
		//se pilha estiver cheia, n�o � possivel empilhar(preven��o para caso tenha insers�o por usu�rio).
		printf("Pilha cheia!\n");
		system("pause");
	}
	else{
		/*se a pilha n�o estiver cheia:
		-add novo elemento no topo
		-incrementa o topo*/
		repilha.dados[repilha.topo]=elemento;
		repilha.topo++;
	}
}
//Procedimento que mostra a cor do prado de acordo com o n�mero.
void corPratos(int valor){
	if(valor == 1){
		printf("\t\tVermelho(1)\n");
	}else
	if(valor == 2){
		printf("\t\tVerde(2)\n");
	}
	else
	if(valor == 3){
		printf("\t\tAzul(3)\n");
	}else
	if(valor == 4){
		printf("\t\tBranco(4)\n");
	}else
	if(valor == 5){
		printf("\t\tLaranja(5)\n");
	}else{
		printf("\t\tErro!\n");
	}
}
//Procedimento para incluir um cabe�alho.
void cabecalho(){
	printf("\n--------------------------------------------\n");
	printf("\tOrdena��o de pilha em entrada saida e \n\tinsers�o em uma nova pilha.\n");
	printf("---------------------------------------------\n");
}
// Implementa��o do c�digo.	
int main(int argc, char *argv[]) {
	//Configurar o idioma portugu�s.
	setlocale(LC_ALL, "Portuguese");	
	// Variaveis.
	pilha.ini=0;
	pilha.topo=0;
	//Vari�vel para o la�o "For".
	int i;
	
	cabecalho();
	
	printf("\n\t\t#Empilhamento!\n\n");
	//Implementa��o do empilhamento.	
	for(i=1;i<=tamanho;i++){
		empilha(i);
		corPratos(i);
	}
	
	printf("\n\t\t#Desempilhamento e Reempilhamento!\n\n");
	
	// Implementa��o do desempilhamento e empilhar em nova pilha(retorna apenas a nova pilha).
	for(i=tamanho;i>=1;i--){
		desempilha(i);
		novaPilha(i);
		corPratos(i);
	}
	system("pause");
	return 0;
}
