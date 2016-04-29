#Explorando Marte - Elo7

### Tecnologias Utilizadas:
1. **Junit** Para realizar testes unitários da aplicação.
2. **RestEasy** Utilizei essa tecnologia para criação dos serviços JSON.
3. **JavaEE-API** Para validação das entradas do meu Request.
4. **log4j** Para logar erro caso tenha alguma exception.
5. **WildFly 8.2.0-Final** Container para roda a aplicação [Download do WildFly]( http://download.jboss.org/wildfly/8.2.0.Final/wildfly-8.2.0.Final.zip).
6. **Java 8** Línguagem de Programação.
7. **Maven** Para gerenciamento de dependências.

### Instruções:

* Foi criado um serviço Rest, onde você envia as Sondas e suas instruções para que elas se movimentem.
* Para isso, será necessário enviar o request para o serviço. Primeiro vamos subir o WildFly e realizar o deploy do WAR.
* Após subir o WildFly , o serviço POST que será utilizado é "http://servername:port/explorando-marte-web/rest/explorarMarte" e Content-Type "applicatoin-json". 
* Para facilitar o mapeamento, utilize o [Request](), e o retorna terá que ser igual [Respose]().




