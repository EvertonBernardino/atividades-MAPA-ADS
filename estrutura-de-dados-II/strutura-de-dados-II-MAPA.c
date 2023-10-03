//Bibliotecas
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>

//Constantes
#define E 0
#define D 1
#define R -1

//Tipo n�
typedef struct NO {
	int dado;
	struct NO *esq;
	struct NO *dir;
	struct NO *pai;
} NO;

//Tipo �rvore
typedef struct ARVORE{
	NO *raiz;
}ARVORE;

//Declara��o da �rvore
ARVORE a;

//Prot�tipos das fun��es
void inicializaArvore(ARVORE arv);
void inicializaNo(NO* n, int val);
void insereNoArvoreOrdenada(int valor);
void preOrdem(NO* raiz);


//fun��o principal
int main(int argc, char *argv[]) {
	
	setlocale(LC_ALL, "Portuguese");
	
	inicializaArvore(a);
	
	//Cria��o da arvore a partir do meu RA
	insereNoArvoreOrdenada(2);
	insereNoArvoreOrdenada(1);
	insereNoArvoreOrdenada(0);
	insereNoArvoreOrdenada(8);
	insereNoArvoreOrdenada(6);
	insereNoArvoreOrdenada(9);
	insereNoArvoreOrdenada(4);
	insereNoArvoreOrdenada(6);
	insereNoArvoreOrdenada(5);
	
	printf("\nBusca pre ordem: \n");
	
	//chamando a busca
	preOrdem(a.raiz);
	
	return 0;
}

//Fun��o que sempre deve ser chamada ao se criar uma nova �rvore
void inicializaArvore(ARVORE arv)
{
	arv.raiz = NULL;
}

//Fun��o utilizada para inicializar um novo n� na �rvore
void inicializaNo(NO* n, int val){
	if(!n)
	{
		printf("Falha de alocacao.\n");
		return;
	}
	n->pai = NULL;
	n->esq = NULL;
	n->dir = NULL;
	n->dado = val;
}

//Fun��o que realiza a inser��o de maneira ordenada
//Valores menores  v�o � esquerda
//Valores maiores ou iguais v�o � direita
void insereNoArvoreOrdenada(int valor)
{
	NO* corrente = a.raiz;
	NO* pai;

	NO* novoNo = (NO*) malloc(sizeof(NO));
	inicializaNo(novoNo, valor);
	printf("Inserindo no %d. \n", novoNo->dado);
	
	if(corrente == NULL)
	{
		a.raiz = novoNo;
		printf("No inserido na raiz. \n");
		return;
	}
	
	while(corrente){
		pai = corrente;
		if(novoNo->dado < corrente->dado){
			corrente = corrente->esq;
			if(!corrente){
				printf("No inserido � esquerda do no %d. \n", pai->dado);
				pai->esq = novoNo;
				return;
			}
		}
		else{
			corrente = corrente->dir;
			if(!corrente){
				printf("No inserido � direita do no %d. \n", pai->dado);
				pai->dir = novoNo;
				return;
			}
		}
	}
}

//Executa o caminhamento pr�-ordem a partir do n� indicado por "raiz"
void preOrdem(NO* raiz){
	if(raiz){
		printf("%d \t", raiz->dado);
		preOrdem(raiz->esq);
		preOrdem(raiz->dir);
	}
}



