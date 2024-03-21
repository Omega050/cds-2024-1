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

  ### Solicitações
  As APIs de REST se comunicam via solicitações de HTTP para executar funções padrão do banco de dados como criar, ler, atualizar e excluir registros (também conhecidos como CRUD) em um recurso. As solicitações mais comuns são: 
  
  * GET para recuperar um registro 
  * POST para criar um registro
  * PUT para atualizar um registro 
  * DELETE para excluir um registro
  
  Todos os métodos HTTP podem ser usados em chamadas da API. Uma API de REST bem projetada é semelhante a um website em execução em um navegador da web com funcionalidade HTTP integrada.

  ### Respostas 
  Ao receber uma solicitação do cliente, o servidor retorna um código de status HTTP padronizado para indicar o resultado da ação. As categorias de códigos são:

  * 2xx - Status de sucesso
  * 3xx - Categoria de redirecionamento
  * 4xx - Erro no Cliente
  * 5xx - Erro no server
  
  Cada código possui um significado específico para o cenário, e é papel do servidor retornar o status correto
  
  ### Boas Práticas
  A construção de API's Rest, geralmente se baseia em boas práticas, as quais podem ser vistas, por exemplo: no uso dos verbos HTTP citados anteriormente; na nomeação dos endpoints sem mesclar singular e plural, usando preferencialmente kebab-case e letra minúscula; e o foco principal em sempre retornar uma resposta para o cliente.
  
## Conclusão
  Dessa forma, uma Rest API atua de forma a possibilitar o acesso a certas funcionalidades de uma aplicação para outras, seguindo alguns padrões de modo a facilitar a troca de informações, bem como tornar o contato do cliente para com o servidor mais simples e compreensível. O que se dá, além da abstração de informações, pela padronização, a qual ocorre por meio das boas práticas citadas acima.
