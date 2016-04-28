# lpoo
Atividade em grupo do curso de Sistemas de Informação

1.	Crie um Aplicativo Java que irá simular um jogo de dados
a.	“Você lança dois dados. Cada dado tem seis faces que contém um, dois, três, quatro, cinco e seis pontos. Depois que os dados param de rolar, a soma dos pontos é calculada. Se a soma for 7 ou 11 no primeiro lance, o jogo acaba com vitória. Se a soma for 2, 3 ou 12 no primeiro lance, o jogo acaba com derrota. Se a soma for 4, 5, 6, 8, 9 ou 10 no primeiro lance, essa soma deve ser guardada e ela torna-se a pontuação do jogo. Assim, o jogo continua até que se obtenha um 7 (jogo acaba com derrota) ou que se obtenha o valor da pontuação do jogo (jogo acaba com vitória).
b.	Você deve criar as seguintes classes:
i.	Classe Dado que ficará responsável por se rodar e retornar qual seu valor
ii.	A geração dos valores dos dados tem que ser randômica
iii.	Classe Jogo que controlará a lógica do jogo apresentado terá 2 atributos do tipo Dado que representarão os dois dados do jogo. Pode ter mais atributos caso necessário.
iv.	Uma classe chamada TestaJogo que conterá o main e será responsável por inciar o jogo
v.	O seguinte log do jogo deve ser impresso na tela (coloque onde for mais conveniente).
1.	Caso de vitória na primeira rodada
a.	Dados: 5 + 6 = 11
b.	Vitória
2.	Caso de derrota na primeira rodada
a.	Dados: 1 + 2 = 3
b.	Derrota
3.	Caso de vitória após primeira rodada
a.	Dados: 5 + 4 = 9
b.	Pontuação: 9
c.	Dados: 2 + 2 = 4
d.	Dados: 2 + 8 = 8
e.	Dados: 4 + 2 = 6
f.	Dados: 3 + 6 = 9
g.	Vitória
4.	Caso de derrota após primeira rodada
a.	Dados: 2 + 6 = 8
b.	Pontuação: 8
c.	Dados: 5 + 1 = 6
d.	Dados: 2 + 1 = 3
e.	Dados: 1 + 6 = 7
f.	Derrota
