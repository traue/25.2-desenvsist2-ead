# Aula síncrona 

Data: 22/09

Esta pasta contem as anotações da aula sincrona sobre padrões **GRASP**.


## Information Expert

Ideia: atribuir uma responsabildiade à classe que possui as informações necessárias para cupri-las.

Exemplo: Quem deve calcular o subtotal de um pedido? É uma classe que tem a informação para tal, com por exmeplo, ItemPedido ou ItemComprato etc., pois conhece a quantidade e o preço unitário.


## Creator

Ideia: Uma classe deve ser responsável por criar instancias de outra, se:
 - contém ou agraga objetos dela
 - usa diretamente seus objetos
 - tem as informacoes necessárias para inicializá-la

Exemplo: Em um processo de "Compra" quem deve criar os objetos do tipo "ItemComprado"? A própria "Compra", pois ela quem conhece e contém as informaçoes dos itens do pedido (produto + quantidade)


## Controller

Ideia: criar classes controladoras que recebem e coordenam os eventos de sistema.

Pontos a serem considerados:
 - Não sao parte da interface de usuário
 - Normalmente estão na camada de lógica de negócio (não é regra) ou em uma camada própria de controladores
 - Pode haver controladores por aotr ou por caso de uso


## Low Coupling

Ideia: reduzir dependências entre classes, para facilitar a manutençao e a reutilização.

Problema: quanto mais uma classe depende de outra(s), mais frágil fica o sistema a mudanças

Prática: repensar o design e distribuir responsabildiades de forma que as dependências sejam mínimas


## High Cohesion

Ideia: garantir que cada classe tenha responsabilidades focadas e relacionadas entre si

Problema: classes com baixa coesão são difíceis de entender, manter e reutilizar

Exemplo: evitar classes que são tipo "canivete suiço", ou seja, que acoumulam funções desconexas.

---

Vide projeto implementado para exemplos de aplicações dos padro˜es discutidos aqui.