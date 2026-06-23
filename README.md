\# Sistema de Xadrez em Camadas ♟️



Projeto desenvolvido para a disciplina de Programação Orientada a Objetos, aplicando conceitos avançados de engenharia de software e arquitetura em camadas.



&#x20;  🚀 Funcionalidades Implementadas

\*   Mecânicas Básicas:\*\* Movimentação estrita de todas as peças, detecção de colisões e sistema de turnos.

\*   Sistema de Xeque:\*\* Validação automática de movimentos legais, impedindo que o jogador se coloque em xeque, e detecção de Xeque-Mate.

\*   Jogadas Especiais Oficiais:\*\* \* Roque (Pequeno e Grande)

&#x20;   En Passant

&#x20;   Promoção de Peão



&#x20;  🏗️ Arquitetura do Sistema

O sistema foi modularizado rigidamente:

\*   Board Layer (Camada de Tabuleiro):\*\* Responsável pelo gerenciamento da matriz do tabuleiro, posicionamento físico e validações de limites de posições.

\*   Chess Layer (Camada de Xadrez):\*\* Responsável pelas regras estritas do xadrez, controle de turnos, estados da partida e comportamento polimórfico das peças.



&#x20;  🛠️ Como Executar o Projeto



Certifique-se de ter o Java instalado em sua máquina.



1\. Acesse a pasta do projeto via terminal.

2\. Compile e execute o programa:

&#x20;  `javac application/Program.java`

&#x20;  `java application.Program`

