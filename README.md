# Linguagem de Programacao I
Profª Adriana da Silva Jacinto

Repositório designado para as atividades da disciplina Linguagem de Programação I 

# TESTES DE MESA
TAREFA ESTRUTURA DE DADOS EM JAVA
# EX78
Passo 1: Inicializando uma lista de nomes com 10 exemplos:
lista_nomes = ["Ana", “Bob", “Carlos", “David", “Eva", “Fábio", “Giselle", “Hugo", “Ivan", “Julia"]

Passo 2: Definindo o nome a ser verificado:
nome_verificar = “Carlos"

Passo 3: Verificando se o nome está presente na lista:
Comparando “Carlos” com o primeiro elemento da lista, que é “Ana” - Não corresponde.
Comparando “Carlos” com o segundo elemento da lista, que é “Bob” - Não corresponde.
Comparando “Carlos” com o terceiro elemento da lista, que é ele mesmo, ou seja, também é igual a 'Carlos' - Corresponde.
Como encontramos um correspondente na lista de nomes, a condição if nome_verificar in lista_nomes se torna verdadeira.
Portanto, o programa exibe a mensagem 'ACHEI'.
Resultado: O programa imprime 'ACHEI' porque encontrou 'Carlos' na lista de nomes.

# EX79
Passo 1: Inicialização das notas da turma:
{8.0, 7.5, 6.8, 9.2, 5.5, 7.0, 8.5, 6.0, 7.2, 8.8, 6.5, 7.9, 8.2, 7.3, 9.0, 6.7, 8.3, 7.7, 7.8, 8.7}

Passo 2: Cálculo da média da turma:
Soma de notas: 8.0 + 7.5 + 6.8 + 9.2 + 5.5 + 7.0 + 8.5 + 6.0 + 7.2 + 8.8 + 6.5 + 7.9 + 8.2 + 7.3 + 9.0 + 6.7 + 8.3 + 7.7 + 7.8 + 8.7 = 151.8
Média da turma: 151.8 / 20 = 7.59

Passo 3: Contagem de alunos com notas acima da média:
Agora, vamos verificar quantos alunos obtiveram notas acima da média (7.59).
8.0 > 7.59 (acima da média)
7.5 > 7.59 (acima da média)
6.8 > 7.59 (abaixo da média)
9.2 > 7.59 (acima da média)
5.5 > 7.59 (abaixo da média)
7.0 > 7.59 (abaixo da média)
8.5 > 7.59 (acima da média)
6.0 > 7.59 (abaixo da média)
7.2 > 7.59 (abaixo da média)
8.8 > 7.59 (acima da média)
6.5 > 7.59 (abaixo da média)
7.9 > 7.59 (acima da média)
8.2 > 7.59 (acima da média)
7.3 > 7.59 (abaixo da média)
9.0 > 7.59 (acima da média)
6.7 > 7.59 (abaixo da média)
8.3 > 7.59 (acima da média)
7.7 > 7.59 (abaixo da média)
7.8 > 7.59 (abaixo da média)
8.7 > 7.59 (acima da média)
O resultado é que 9 alunos obtiveram notas acima da média.

Passo 4: Exibição da saída:
A saída do programa será:
A média da turma é: 7.59
9 alunos tiveram notas acima da média.

# EX80
Passo 1: Inicialização das notas da turma:
{8.0, 7.5, 6.8, 9.2, 5.5, 7.0, 8.5, 6.0, 7.2, 8.8, 6.5, 7.9, 8.2, 7.3, 9.0, 6.7, 8.3, 7.7, 7.8, 8.7}

Passo 2: Cálculo da média da turma:
Soma das notas = 8.0 + 7.5 + 6.8 + 9.2 + 5.5 + 7.0 + 8.5 + 6.0 + 7.2 + 8.8 + 6.5 + 7.9 + 8.2 + 7.3 + 9.0 + 6.7 + 8.3 + 7.7 + 7.8 + 8.7 = 151.6

Agora, calculamos a média:
Média da turma = Soma das notas / Número de alunos = 151.6 / 20 = 7.58(APROXIMADAMENTE)

Passo 3: Contagem de alunos com notas acima da média:
Notas acima da média: 8.0, 7.5, 9.2, 8.5, 7.9, 8.2, 9.0, 8.3, 7.8, 8.7
Há 10 alunos com notas acima da média.

Passo 4: Saída esperada:
A média da turma é: 7.58
10 alunos tiveram notas acima da média.

# EX81
Entrada: Vamos ler o vetor Q novamente.
Suponhamos que os números sejam os mesmos do exercício anterior: 10, 5, 8, 12, 15, 20, 7, 18, 25, 22, 11, 14, 9, 30, 19, 28, 23, 21, 17, 16.
O programa deve encontrar o menor elemento do vetor e a posição em que ele se encontra.
O menor elemento é 5, na posição 1 (índice 1).
Saída esperada: O programa escreve o valor do menor elemento (5) e a respectiva posição (1).

# EX82
Entrada: Vamos ler um vetor A de 10 números e depois ler mais um número X.
Suponhamos que o vetor A seja: [3, 6, 9, 12, 15, 18, 21, 24, 27, 30] e X seja 5.
O programa multiplica cada elemento de A pelo valor X e armazena em um vetor M.
O vetor M será: [15, 30, 45, 60, 75, 90, 105, 120, 135, 150].
Saída esperada: O programa escreve o vetor M.

# EX83
Entrada: Vamos ler 20 números e armazenar em um vetor.
Suponhamos que os números sejam: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20.
Após a leitura, o programa deve escrever esses 20 números na ordem inversa.
Saída esperada: O programa escreve os números na ordem inversa: 20, 19, 18, ..., 3, 2, 1.

# EX84
Entrada: Vamos ler um valor N (tamanho dos vetores) e depois ler dois vetores A e B de tamanho N.
Suponhamos que N seja 5, e os vetores A e B sejam:
A: [1, 2, 3, 4, 5]
B: [6, 7, 8, 9, 10]
O programa deve calcular um vetor Soma, que é a soma dos elementos de A com os de B nas mesmas posições.
O vetor Soma será: [7, 9, 11, 13, 15].
Saída esperada: O programa escreve o vetor Soma.

# EX85
Entrada: Vamos ler um vetor com as temperaturas médias de todos os dias do ano.
Suponhamos que as temperaturas sejam: [20.0, 22.5, 24.0, ..., 18.5] (um valor para cada dia do ano).
O programa deve calcular:
a. A menor temperatura do ano.
b. A maior temperatura do ano.
c. A temperatura média anual.
d. O número de dias no ano em que a temperatura foi inferior à média anual.
Suponhamos que a menor temperatura seja 15.0, a maior seja 28.0, a média anual seja 22.5 e o número de dias com temperatura inferior à média seja 100.
Saída esperada: O programa escreve os resultados, por exemplo:
a. Menor temperatura do ano: 15.0
b. Maior temperatura do ano: 28.0
c. Temperatura média anual: 22.5
d. Número de dias com temperatura inferior à média anual: 100.

# EX86
Entrada: Vamos ler um vetor de 10 números.
Suponhamos que os números sejam: [9, 2, 7, 1, 5, 10, 3, 8, 6, 4].
O programa deve ordenar os números no vetor em ordem crescente usando o Bubble Sort.
Saída esperada: O programa escreve o vetor ordenado em ordem crescente, por exemplo: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10].

# EX87
Entrada: Vamos ler um vetor de 10 números e depois ler mais um número.
Suponhamos que o vetor seja: [2, 4, 6, 8, 10, 12, 14, 16, 18, 20] e o novo número seja 15.
O programa deve ordenar os números no vetor em ordem crescente usando o Bubble Sort e, em seguida, inserir o novo número na posição correta para manter a ordem crescente.
Saída esperada: O programa escreve o vetor com o novo número inserido na posição correta, por exemplo: [2, 4, 6, 8, 10, 12, 14, 15, 16, 18, 20].

# EX88
Entrada: Vamos ler um vetor de 20 números positivos.
Suponhamos que os números sejam: [5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100].
O programa deve ler mais um número, por exemplo, 45, e verificar se esse número existe no vetor.
Como 45 existe no vetor, o programa deve gerar um novo vetor sem esse número.
Saída esperada: O programa escreve o novo vetor sem o número, por exemplo: [5, 10, 15, 20, 25, 30, 35, 40, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100].

# EX89
Entrada: Vamos ler dois vetores V1 e V2 de 15 números cada.
Suponhamos que V1 seja: [3, 5, 2, 7, 8, 4, 9, 6, 1, 10, 12, 15, 11, 14, 13].
E suponhamos que V2 seja: [3, 6, 2, 8, 8, 4, 9, 6, 1, 11, 12, 15, 11, 14, 13].
O programa deve calcular e escrever a quantidade de vezes que V1 e V2 possuem os mesmos números e nas mesmas posições.
Neste exemplo, ambos têm 11 números em posições correspondentes iguais.
Saída esperada: O programa escreve a quantidade de vezes que os vetores possuem os mesmos números nas mesmas posições, por exemplo: "Quantidade de vezes que V1 e V2 possuem os mesmos números nas mesmas posições: 11".

# EX90
Entrada: Vamos ler um vetor de 30 números.
Suponhamos que os números sejam: [10, 15, 20, 10, 25, 30, 35, 40, 10, 45, 50, 55, 10, 60, 65, 70, 10, 75, 80, 85, 10, 90, 95, 100, 10, 105, 110, 115, 120, 10].
O programa deve ler mais um número, por exemplo, 10, e calcular quantas vezes esse número aparece no vetor.
Como o número 10 aparece 10 vezes no vetor, a saída esperada é: "O número 10 aparece 10 vezes no vetor."

# EX91
Entrada: Vamos ler 50 números e armazenar em um vetor VET.
Suponhamos que os números sejam: [5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 5, 60, 65, 70, 75, 80, 85, 90, 95, 100, 105, 110, 115, 120, 125, 130, 135, 140, 145, 150, 155, 160, 165, 170, 175, 180, 185, 190, 195, 200, 205, 210, 215, 220, 225, 230, 235, 240, 245, 250].
O programa deve verificar se existem números repetidos no vetor VET e, se existirem, escrever em quais posições eles se encontram.
Neste exemplo, os números 5 e 10 se repetem.
Saída esperada: O programa escreve as posições em que os números repetidos se encontram, por exemplo:
"Número 5 encontrado nas posições: 0, 9."
"Número 10 encontrado nas posições: 1, 10."

