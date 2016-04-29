#Explorando Marte - Elo7

### Tecnologias Utilizadas:
1. **Junit** Para realizar testes unitários da aplicação.
2. **RestEasy** Utilizei essa tecnologia para criação dos serviços JSON.
3. **JavaEE-API** Para validação das entradas do meu Request.
4. **log4j** Para logar erro caso tenha alguma exception.
5. **WildFly 8.2.0-Final** Container para roda a aplicação [Download do WildFly]( http://download.jboss.org/wildfly/8.2.0.Final/wildfly-8.2.0.Final.zip).
6. **Java 8** Línguagem de Programação versão 8.
7. **Maven** Para gerenciamento de dependências.

### Instruções:

* Foi criado um serviço Rest, onde você envia as Sondas e suas instruções para que elas se movam.
* Para isso, será necessário enviar o request para o serviço. Primeiro vamos subir o WildFly e realizar o deploy do WAR.
* Após subir o WildFly , o serviço POST que será utilizado é ``http://servername:port/explorando-marte-web/rest/explorarMarte  |  Content-Type "application-json``` . 
* Para facilitar o mapeamento do request, utilize o ![Request](https://github.com/eltonsimor/explorando-marte/blob/master/request.json "Request"), e o retorno será parecido com ![Respose](https://github.com/eltonsimor/explorando-marte/blob/master/response.json "Response").

>_OBS:_ Nesse projeto, se duas Sondas depois de realizarem seus movimentos e a posição final forem iguais somente uma Sonda aparecerá e as demais serão removidas. Indiferente se elas iniciaram nas mesmas posições ou posições diferentes.




