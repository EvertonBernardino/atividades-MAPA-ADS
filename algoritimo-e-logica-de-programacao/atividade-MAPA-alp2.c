#include <stdio.h>
#include <locale.h>
#include <string.h>
#define MAX 201	
int j=0;
typedef struct cadastro
{
	int codigo;
	char titulo[50];
	char nome[39];
	char descricao[100];
	int ano;
	char dataLim[10];
	char cliente[30];
	int tempo;
	char status[10];
}cad;

void menus(){
	system("cls");
	printf("\t ________________________\n");
	printf("\t|          Menu          |\n");
	printf("\t|1-Cadastrar Projetos    |\n");
	printf("\t|2-Listar todos Projetos |\n");
	printf("\t|3-Procurar por codigo   |\n");
	printf("\t|4-Iniciar um projeto    |\n");
	printf("\t|5-Enserra um projeto    |\n");
	printf("\t|6-Editar um projeto     |\n");
	printf("\t|0-Sair                  |\n");
	printf("\t|________________________|\n");
}
void cadastro(cad projeto[MAX])//op1
{
	int b;
	char n = 's';
	system("cls");
	while ((n!='n')&&(j<MAX))
	{
		j=j+1;
		printf("\ncadastrando projeto de codigo: %d", j);
		projeto[j].codigo = j;
		printf("\nDigite o titulo do projeto:\n");
		fflush(stdin);
		gets(projeto[j].titulo);
		printf("\nDigite o nome do responsavel pelo projeto:\n");
		fflush(stdin);
		gets(projeto[j].nome);
		printf ("\nDigite o tempo que ira dura o projeto(em meses )\n");
		fflush(stdin);
		scanf ("%d", &projeto[j].tempo);
		printf("\ndigites a descrição do projeto:");
		fflush(stdin);
		gets(projeto[j].descricao);
		printf("\nDigite o anos que ira começar o projeto:");
		fflush(stdin);
		scanf("%d", &projeto[j].ano);
		printf ("\nDigite a provavel data de termino do projeto:");
		fflush(stdin);
		scanf("%s", &projeto[j].dataLim);
		printf("\nDigite o nome do cliente");
		scanf("%s", &projeto[j].cliente);
		strcpy(projeto[j].status, "a fazer");
		b=0;
		while (b==0)
		{
			printf("\nDeseja cadastrar mais produtos?[s/n]");
			fflush(stdin);
			scanf("%s", &n);
			if ((n!='s') && (n!='n'))
			{
				printf("\nResponda com s ou n!");
			}
			else
			{
				b= 1;
			}
		}
	}
}
void todos_projetos(cad projeto[MAX])//op2
{
	int i;
	if(j==0)
	{
		system("cls");
		printf("\nNem um projeto cadastrado\n");
		system("pause");					
	}
		else
		{
			system("cls");
			for (i=1;i<=j;i++)
			{
				printf ("Codigo do projeto:%d\n", projeto[i].codigo);
				printf ("Titulo: %s\n", projeto[i].titulo);
				printf ("Responsavel: %s\n", projeto[i].nome);
				printf ("Descreção:%s\n", projeto[i].descricao);
				printf ("Ano de inicio:%d\n", projeto[i].ano);
				printf ("Posivel data de termino:%s\n",projeto[i].dataLim);
				printf ("Nome do cliente: %s \n", projeto[i].cliente);
				printf ("Duração:%d meses\n", projeto[i].tempo);
				printf ("Estatus:%s\n", projeto[i].status);
				printf ("\n");
			}
			system("pause");
		}
}
void procurar(cad projeto[MAX])//op3
{ int i;
	printf ("Digite o codigo que deseja procura");
				scanf ("%d", &i);
				printf ("Titulo: %s\n", projeto[i].titulo);
				printf ("Responsavei: %s\n", projeto[i].nome);
				printf ("Descreção:%s\n", projeto[i].descricao);
				printf ("Ano de inicio:%d\n", projeto[i].ano);
				printf ("Posivel data de termino:%s\n",projeto[i].dataLim);
				printf ("Nome do cliente: %s \n", projeto[i].cliente);
				printf ("Duração:%d meses\n", projeto[i].tempo);
				printf ("Estatus:%s\n", projeto[i].status);
				system("pause");
}
void iniciar(cad projeto[MAX])//op4
{
	system("cls");
	int i;
	printf("Digite o codigo do projeto que deseja iniciar:\n");
	fflush(stdin);
	scanf("%d", &i);
	strcpy(projeto[i].status, "Iniciado");
	printf ("Projeto:%s Com stato:%s com sucesso\n", projeto[i].titulo, projeto[i].status);
	system("pause");
}
void encerrar(cad projeto[MAX])//op5
{	
	system("cls");
	int i;
	printf("Digite o codigo do projeto que deseja encerar :\n");
	fflush(stdin);
	scanf("%d", &i);
	strcpy(projeto[i].status, "Encerrado");
	printf ("Projeto:%s Com statu:%s com sucesso\n", projeto[i].titulo, projeto[i].status);
	system("pause");
}
void editar(cad projeto[MAX])//op6
{ 	
	system("cls");
	int j;
	printf("Qual projeto deseja alterar? (digite o codigo)");
	scanf("%d", &j);
	printf("\nDigite o titulo do projeto:\n");
	fflush(stdin);
	gets(projeto[j].titulo);
	printf("\nDigite o nome do responsavel pelo projeto:\n");
	fflush(stdin);
	gets(projeto[j].nome);
	printf ("\nDigite o tempo que ira dura o projeto(em meses )\n");
	fflush(stdin);
	scanf ("%d", &projeto[j].tempo);
	printf("\ndigites a descrição do projeto:");
	fflush(stdin);
	gets(projeto[j].descricao);
	printf("\nDigite o anos que ira começar o projeto:");
	fflush(stdin);
	scanf("%d", &projeto[j].ano);
	printf ("\nDigite a provavel data de termino do projeto:");
	fflush(stdin);
	scanf("%s", &projeto[j].dataLim);
	printf("\nDigite o nome do cliente");
	scanf("%s", &projeto[j].cliente);
}
int main()
{
	struct cadastro projeto[MAX];
	int op;
	setlocale(LC_ALL, "Portuguese_Brazil");
	
	printf("\n\n");
	printf("\t**********************************************************\n");
	printf("\t*                                                        *\n"); 
	printf("\t* Nome do Desenvolvedor: Everton Carlos Silva Bernardino *\n");
	printf("\t* RA: 21086946-5                                         *\n");
	printf("\t* Curso:Tecnólogo-Analise e desenvolvimento de sistemas  *\n"); 
	printf("\t*                                                        *\n");
	printf("\t**********************************************************\n");
	printf("\n\n");
	
	system("pause");
	system("cls");
do{
	menus();
	scanf("%d", &op);
	switch (op)
	{
		
		case 1:
			cadastro(projeto);
			break;
		case 2:
			todos_projetos(projeto);
			break;
		case 3:
			procurar(projeto);
			break;
		case 4:
			iniciar(projeto);
			break;
		case 5:
			encerrar(projeto);
			break;
		case 6:
			editar(projeto);
		case 0:
			system("cls");
			printf("\n\n");
			printf("\tfazendo logoff...");
			printf("\n\n");
			break;
		default:
			printf("\n\n");
			printf("\tOpção não encontrada!\n");
			printf("\n\n");
			system("pause");
	}
}while(op!=0);
return(0);
}
