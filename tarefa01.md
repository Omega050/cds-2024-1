# Rest API
## Conceito Básico de API
  API é um acrônimo de Application Programming Interface (Interface de Programação de Aplicações), em outras palavras, um conjunt o de rotinas e padrões que uma aplicação estabelece para disponibilizar funcionalidades dessa para outras aplicações. Dessa forma, dentre suas principais funções, pode-se destacar: 

  * Estabelecer comunicação entre diferentes serviços e tecnologias.
  * Intermediar trocas de informção entre esses.

## Conceito Básico de REST

  REST é um acrônimo para Representational State Transfer (ou Trasnferência de Estado representativo) é responsável por estabelecer regras e obrigações para a transferência de dados, geralmente por meio do protocolo HTTP. Para que uma API seja considerada como RESTful, é necessário que esta siga os padrões REST, que são: 
  
  1. Interface uniforme: A interface deve ser construída de maneira uniforme e com coerência, a fim de ser compreensível para o cliente. Podendo seguir padrões como o uso correto dos verbos HTTP; endpoints coerentes (todos os endpoints no plural, por exemplo); usar somente uma linguagem de comunicação (json) e não várias ao mesmo tempo; sempre enviar respostas 
 
  2. Desacoplamento do cliente-servidor: Aplicativos cliente e servidor devem ser completamente independentes um do outro. Possibilitando maior portabilidade do sistema, visto que os dados propriamente ditos se encontram no lado do servidor

  3. Sem estado definido: As APIs de REST não possuem estado definido, o que significa que cada solicitação precisa incluir todas as informações necessárias para processá-lo. Em outras palavras, as APIs de REST não requerem nenhuma sessão do lado do servidor. Os aplicativos do servidor não tem permissão para armazenar nenhum dado relacionado a uma solicitação de cliente.

  4. Capacidade de armazenamento em cache: É prioritário o armzenamento dos recursos em cache pelo cliente ou servidor. As respostas do servidor também precisam conter informações sobre as permissões de cache do recurso fornecido.  A fim de melhorar tanto o desempenho do lado do cliente quanto a escalabilidade no lado do servidor.

  5. Arquitetura de sistema em camadas: O acesso do cliente ocorre de modo a abstrair a complexidade da atuação do servidor na requisição que está sendo realizada.
     
  6. Código sob demanda: Não é obrigatório, porém pode ocorrer a disponibilização de códico para ser executado no lado do cliente.

## Funiconamento das API REST
  As APIs de REST se comunicam via solicitações de HTTP para executar funções padrão do banco de dados como criar, ler, atualizar e excluir registros (também conhecidos como CRUD) em um recurso. Por exemplo, uma API de REST usaria uma solicitação GET para recuperar um registro, uma solicitação POST para criar um registro, uma solicitação PUT para atualizar um registro e uma solicitação DELETE para excluir um registro. Todos os métodos HTTP podem ser usados em chamadas da API. Uma API de REST bem projetada é semelhante a um website em execução em um navegador da web com funcionalidade HTTP integrada.

## Conclusão
  Dessa forma, uma Rest API atua de forma a possibilitar o acesso a certas funcionalidades de uma aplicação para outras, seguindo alguns padrões de modo a facilitar a troca de informações, bem como tornar o contato do cliente para com o servidor mais simples e compreensível, por meio de abstrações.
