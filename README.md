# Comparador de GPUs

Este é um programa em Java que permite ao usuário comparar o desempenho de diferentes placas de vídeo (GPUs) com base em suas especificações técnicas e desempenho estimado em dois jogos populares: **Cyberpunk 2077** e **CS2**.

## Funcionalidades

- **Seleção de GPUs**: O usuário pode escolher duas GPUs de uma lista de opções disponíveis para comparação.
- **Exibição de Especificações**: O programa exibe detalhes técnicos de cada GPU, incluindo:
  - Nome
  - VRAM
  - Consumo de energia
  - Clock base
  - Clock boost
  - Tipo de memória
  - Requisitos de fonte
  - Suporte a Ray Tracing
  - Suporte a Frame Generator (FG)
- **Desempenho em Jogos**: O desempenho de cada GPU em termos de FPS (frames por segundo) é estimado para os jogos selecionados.
- **Comparação de Desempenho**: O programa calcula e exibe qual GPU é superior em termos de FPS, indicando a porcentagem de vantagem.

## Como Usar

1. Compile o programa Java usando um IDE ou através da linha de comando.
2. Execute o programa.
3. Selecione duas GPUs da lista exibida.
4. O programa mostrará as especificações e o desempenho de cada GPU em **Cyberpunk 2077** e **CS2**.
5. O programa calculará e exibirá qual GPU é superior com base nas estimativas de FPS.
6. O usuário pode optar por voltar e fazer novas comparações.

## Estrutura do Código

- **GPU.java**: Define a classe `GPU`, que contém as especificações e métodos para estimar FPS em jogos.
- **GpuRepository.java**: Contém uma lista de GPUs disponíveis e seus desempenhos em jogos.
- **Main.java**: A classe principal que gerencia a interação com o usuário e a lógica de comparação.

## Tecnologias Usadas

- Java (versão 17)
- IDE (Eclipse ou VSCode)

## Contribuição

Se você deseja contribuir para este projeto, sinta-se à vontade.

## Licença

Este projeto é de uso pessoal e educativo. Sinta-se livre para usar e modificar conforme necessário.

## Melhorias Futuras

Pretendo melhorar este projeto em atualizações futuras, adicionando novas GPUs e opções de jogos para visualizar o FPS. Isso ampliará a funcionalidade e a usabilidade do comparador de GPUs.

## Créditos

Todos os dados utilizados neste programa foram retirados do site [technical.city](https://technical.city).



# UPDATE 1.0 

Adicionei novas placas em GPURepository 4060, 3060 e 1050 TI.

