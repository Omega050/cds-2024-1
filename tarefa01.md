# Rest API
## Conceito Básico de API
  API é um acrônimo de Application Programming Interface (Interface de Programação de Aplicações), em outras palavras, um conjunt o de rotinas e padrões que uma aplicação estabelece para disponibilizar funcionalidades dessa para outras aplicações. Dessa forma, dentre suas principais funções, pode-se destacar: 

  * Estabelecer comunicação entre diferentes serviços e tecnologias.
  * Intermediar trocas de informção entre esses.

## Conceito Básico de REST

  REST é um acrônimo para Representational State Transfer (ou Trasnferência de Estado representativo) é responsável por estabelecer regras e obrigações para a transferência de dados, geralmente por meio do protocolo HTTP. Para que uma API seja considerada como RESTful, é necessário que esta siga os padrões REST, que são: 
  
  1. Interface uniforme: A interface deve ser construída de maneira uniforme e com coerência, a fim de ser compreensível para o cliente. Podendo seguir padrões como o uso correto dos verbos HTTP; endpoints coerentes (todos os endpoints no plural, por exemplo); usar somente uma linguagem de comunicação (json) e não várias ao mesmo tempo; sempre enviar respostas 
 
  2. Desacoplamento do cliente-servidor: Aplicativos cliente e servidor devem ser completamente independentes um do outro. A única informação que o aplicativo cliente deve receber é o URI do recurso solicitado. Ele não pode interagir com o aplicativo do servidor de qualquer outra forma. Da mesma forma, um aplicativo do servidor não deve modificar o aplicativo cliente, exceto para transferi-los aos dados solicitados via HTTP.

  3. Sem estado definido. As APIs de REST não possuem estado definido, o que significa que cada solicitação precisa incluir todas as informações necessárias para processá-lo. Em outras palavras, as APIs de REST não requerem nenhuma sessão do lado do servidor. Os aplicativos do servidor não tem permissão para armazenar nenhum dado relacionado a uma solicitação de cliente.

  4. Capacidade de armazenamento em cache. Quando possível, os recursos devem ser armazenados em cache pelo cliente ou servidor. As respostas do servidor também precisam conter informações sobre as permissões de cache do recurso fornecido. O objetivo é melhorar o desempenho do cliente, além de aumentar a escalabilidade do servidor.

  5. Arquitetura de sistema em camadas. Em APIs de REST, as chamadas e respostas passam por diferentes camadas. De maneira geral, não assuma que os aplicativos cliente e servidor se conectem diretamente um ao outro. Pode haver uma série de intermediários diferentes no loop de comunicação. As APIs de REST precisam ser projetadas para que nem o cliente e nem o servidor possam dizer se ele se comunica com o aplicativo final ou um intermediário.

  6. Código sob demanda: Não é obrigatório, porém pode ocorrer a disponibilização de códico para ser executado no lado do cliente.
