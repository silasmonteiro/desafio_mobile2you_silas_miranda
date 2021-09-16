# desafio_mobile2you_silas_miranda

<b>Desafio Proposto:</b>

Utilizando a API do The Movie DB, você deverá implementar uma tela com as informações de algum filme da
sua escolha. Somente a tela principal.

<b>Requisitos:</b>

1-Usar algum design pattern: MVP, MVVM, MVVM-C, VIPER <br>
2-As informações do filme devem vir do endpoint getMovieDetails<br>
3-Usar o vote_count que retorna da API para apresentar o número de likes<br>
4-Substituir o "3 of 10 watched" por "<popularity> views", utilizando o valor retornado da API e mantendo algum ícone ao lado<br>
5-O ícone de like(coração) deve mudar quando clicado, alternando entre preenchido e vazop.<br>
6-Deve haver uma lista de filmes abaixo dos detalhes<br>
7-O app deve ser desenvolvido utilizando a linguagemm Swift<br>
8-O projeto deve ser disponibilizado em um repositório aberto no GitHub. Envie a URL assim que possível<br>

<b>Comentários</b>

O projeto foi desenvolvido com arquitetura MVVM pelo fato de a arquitetura recomendada pelo Google e a mais utilizada no mercado atual. Dei o meu melhor
para fazer o codigo mais limpo possivel , usei o coroutines para melhorar o desempenho do app designando qual linha de execução a ser usada, usei também o Retrofit 
para fazer a coneção com a API indo buscar as informação nos <i>Endpoints</i>.<br><br>

Usei o <i>LiveData</i> para receber e armazenar os observers, usei também o <i> Picasso </i> para o carregamento das imagens e basicamente é isso.

Obrigado por experiência, estou a disposição! 
