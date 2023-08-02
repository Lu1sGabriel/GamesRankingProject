# PROJETO DE GERENCIAMENTO DE LISTAS DE JOGOS
<h2>Resumo do projeto</h2>
<p>O projeto é uma aplicação voltada para jogos, com o objetivo de gerenciar listas de jogos em diferentes categorias ou
    coleções. Através da aplicação, os usuários podem criar, visualizar e organizar suas listas personalizadas de jogos,
    além de obter informações detalhadas sobre cada jogo.</p>
<h2>SUMÁRIO</h2>
<ol>
    <li><a href="#funcionalidades">Funcionalidades</a></li>
    <li><a href="#tecnologias-utilizadas">Tecnologias Utilizadas</a></li>
    <li><a href="#configurações">Configurações</a></li>
    <li><a href="#como-executar">Como Executar</a></li>
    <li><a href="#classes-javas">Classes Javas</a></li>
    <li><a href="#endpoints">Endpoints</a></li>
    <li><a href="#pré-requisitos">Pré-requisitos</a></li>
    <li><a href="#como-executar">Como Executar</a></li>
    <li><a href="#autor">Autor</a></li>
    <li><a href="#contatos">Contatos</a></li>
</ol>
<h2 id="funcionalidades">Funcionalidades</h2>
<p>Listar todas as listas de jogos cadastradas.</p>
<p>Listar todos os jogos cadastrados.</p>
<p>Buscar informações detalhadas de um jogo pelo ID.</p>
<p>Buscar os jogos de uma lista específica.</p>
<p>Mover um jogo dentro de uma lista.</p>
<h2 id="tecnologias-utilizadas">Tecnologias Utilizadas</h2>
<p>
    - Java<br>
    - Spring Framework<br>
    - Spring Data JPA<br>
    - Spring Boot<br>
    - H2 Database<br>
    - PostgreSQL<br>
    - RESTful API
</p>
<h2 id="configurações do CORS">Configurações</h2>
<p>Configuração do CORS para permitir acesso a partir de diferentes origens.</p>
<h2 id="como-executar">Como Executar</h2>
<p>
    - Clone o repositório para o seu ambiente local.<br>
    - Abra o projeto em uma IDE (Eclipse, IntelliJ, etc.).<br>
    - Certifique-se de ter as tecnologias, JDK 17 ou superior e ter todas as dependências necessárias configuradas.<br>
    - Execute a aplicação através do main da classe principal.
</p>
<h2 id="classes-javas">Classes Javas</h2>
<details>
    <summary>Config</summary>
    <ul>
        <li>
            A classe <strong>WebConfig</strong> é uma classe de configuração em uma aplicação Spring que lida com a
            configuração do CORS
            (Cross-Origin Resource Sharing), permitindo que recursos de diferentes origens sejam solicitados e acessados
            de forma segura.
            Em resumo, a classe WebConfig é responsável por configurar o CORS em uma aplicação Spring, permitindo que
            diferentes origens acessem recursos de forma segura. As configurações definidas permitem que todas as URLs
            do aplicativo sejam afetadas pelo CORS, permitindo todas as requisições HTTP e especificando as origens
            permitidas através da propriedade corsOrigins.
        </li>
    </ul>
</details>
<details>
    <summary>Controllers</summary>
    <ul>
        <li>
            <strong>GameController</strong> é uma classe Java que gerencia requisições HTTP relacionadas aos recursos de
            "jogos". Ela
            possui dois endpoints: um para listar todos os jogos e outro para obter detalhes de um jogo específico com
            base no ID fornecido. As respostas são retornadas em formato JSON.
        </li>
        <li>
            <strong>GameListController</strong> é uma classe responsável por tratar requisições HTTP relacionadas às
            "listas de jogos".
            Ela possui três endpoints para listar todas as listas de jogos, obter detalhes de jogos em uma lista
            específica e realizar movimentações dentro da lista. As respostas são retornadas em formato JSON
        </li>
    </ul>
</details>
<details>
    <summary>DTOS</summary>
    <ul>
        <li>
            <strong>GameDto</strong> é uma classe Java que representa um objeto de transferência de dados (DTO) para
            recursos de "jogo" em
            uma aplicação. Ela possui propriedades para armazenar informações sobre o jogo, como ID, título, ano,
            gênero,
            plataformas, pontuação, URL da imagem e descrições curtas e longas. A classe também inclui anotações do
            Lombok
            para geração automática de getters e setters, bem como um construtor personalizado para converter objetos
            GameModel em GameDto.
        </li>
        <li>
            <strong>GameListDto</strong> é uma classe Java que representa um objeto de transferência de dados (DTO) para
            recursos de "lista de jogos" em uma aplicação. Ela possui duas propriedades: id e name, que armazenam
            informações sobre a lista de jogos. A classe inclui anotações do Lombok para geração automática de um
            construtor
            padrão sem argumentos e métodos getters para as propriedades. Também possui um construtor personalizado que
            recebe um objeto GameList e atribui seus valores às propriedades correspondentes do GameListDto.
        </li>
        <li>
            <strong>GameMinDto</strong> é uma classe Java que representa um objeto de transferência de dados (DTO) para
            recursos de "jogo" em uma versão resumida. Ela armazena informações essenciais do jogo, como ID, título,
            ano, URL da imagem e descrição curta. A classe possui construtores para converter objetos GameModel e
            GameMinProjection em GameMinDto, permitindo a transmissão de dados resumidos de jogos em situações
            específicas.
        </li>
        <li>
            A classe <strong>ReplacementDTO</strong> é responsável por representar os dados necessários para a operação
            de troca de posição de um jogo em uma lista de jogos. Ela possui duas propriedades: sourceIndex (índice de
            origem) e destinationIndex (índice de destino), que indicam as posições que devem ser trocadas na lista.
            Essa classe é usada para transferir informações sobre a operação de troca entre diferentes camadas da
            aplicação, tornando o processo de movimentação de jogos mais simples e organizado.
        </li>
    </ul>

</details>
<details>
    <summary>Models</summary>
    <ul>
        <li>
            A classe <strong>Belonging</strong> é uma entidade JPA (Java Persistence API) que mapeia uma tabela de banco
            de dados chamada "TB_BELONGING". Ela representa o relacionamento entre um GameModel e uma GameList em uma
            posição específica na lista
        </li>
        <li>
            A classe <strong>BelongingPrimaryKey</strong> é uma classe embutida (embeddable) que representa a chave
            primária composta da entidade Belonging. Ela é usada para encapsular dois atributos que formam a chave
            primária: gameModel e gameList. Essa classe é responsável por representar a chave primária composta da
            entidade Belonging, que é formada pela combinação das chaves estrangeiras gameModel e gameList. Ao
            encapsular esses atributos em uma classe separada, é possível reutilizá-la em outras entidades que possam
            ter uma chave primária composta semelhante.
        </li>
    </ul>
</details>
<details>
    <summary>Projections</summary>
    <ul>
        <li>A interface GameMinProjection é usada como uma projeção (uma forma de seleção específica de colunas) para
            buscar dados resumidos de jogos em uma consulta. Ela define métodos que correspondem aos atributos
            necessários para retornar informações mínimas de jogos.
            Essa interface é utilizada em consultas onde somente os dados mínimos do jogo são necessários, evitando
            carregar informações adicionais e melhorando a performance das consultas. Ela é especialmente útil quando se
            deseja buscar apenas alguns atributos específicos de um grande conjunto de dados, como em casos de listagens
            e visualizações resumidas.
        </li>
    </ul>
</details>
<details>
    <summary>Repositories</summary>
    <ul>
        <li>
            A interface <strong>GameListRepository</strong> é uma extensão da interface JpaRepository, que é fornecida
            pelo Spring Data JPA. Essa interface é usada para realizar operações de persistência e consulta no banco de
            dados para a entidade GameList.
            Em resumo, essa interface define um repositório personalizado para a entidade GameList, permitindo a
            execução de uma consulta SQL nativa para atualizar a posição de um jogo na tabela tb_belonging.
        </li>
        <li>
            A interface <strong>GameRepository</strong> é uma extensão da interface JpaRepository, fornecida pelo Spring
            Data JPA. Essa interface é usada para realizar operações de persistência e consulta no banco de dados para a
            entidade GameModel.
            Em resumo, essa interface define um repositório personalizado para a entidade GameModel, permitindo a
            execução de uma consulta SQL nativa para buscar os jogos associados a uma lista específica, ordenados pela
            posição na lista. Os resultados são mapeados para a interface GameMinProjection, que contém apenas os
            atributos mínimos necessários para representar os dados dos jogos.
        </li>
    </ul>
</details>
<details>
    <summary>Service</summary>
    <ul>
        <li>A classe <strong>GameListService</strong> é uma classe de serviço em uma aplicação Spring que lida com a
            lógica de negócios
            relacionada às listas de jogos.
            Em resumo, a classe GameListService é responsável por gerenciar as operações de negócios relacionadas às
            listas de jogos. Ela permite buscar todas as listas de jogos e realizar a operação de movimentação de um
            jogo dentro de uma lista específica. As transações são gerenciadas para garantir a consistência dos dados no
            banco de dados durante as operações.
        </li>
        <li>
            A classe GameService é uma classe de serviço em uma aplicação Spring que gerencia a lógica de negócios
            relacionada aos jogos.
            Em resumo, a classe GameService é responsável por gerenciar as operações de negócios relacionadas aos jogos.
            Ela permite buscar todos os jogos, buscar jogos específicos por ID e buscar todos os jogos associados a uma
            lista específica. As transações são gerenciadas para garantir a consistência dos dados no banco de dados
            durante as operações. As respostas são encapsuladas em objetos ResponseEntity que permitem retornar tanto
            dados de jogo quanto possíveis mensagens de erro com os respectivos códigos de status HTTP.
        </li>
    </ul>
</details>

<h2 id="endpoints">Endpoints</h2>


```http
GET /games
```
```http
GET /games/1
```
```http
GET /lists
```
```http
GET /lists/2/games
```
```http
POST /lists/2/replacement
```

<h2 id="pré-requisitos">Pré-Requisitos</h2>
<p>
    Para executar o projeto, certifique-se de ter o JDK 17 ou uma versão superior instalada na sua máquina. Além disso,
    é necessário ter o banco de dados PostgreSQL instalado, configurado e em execução. Adicionalmente, você precisará de
    um software como Insomnia ou Postman para realizar as requisições HTTP.
</p>
<h2 id="como-executar">Como executar</h2>

<ol>
    <li>Certifique-se de ter um banco de dados PostgreSQL configurado e em execução.</li>
    <li>
        Verifique as configurações no arquivo "application.properties", especialmente as propriedades relacionadas ao
        perfil ativo e às origens permitidas para acesso CORS.
    </li>
    <li>Garanta que todas as dependências necessárias estejam presentes no ambiente.</li>
    <li>Inicie a aplicação executando a classe principal anotada com "@SpringBootApplication".</li>
    <li>
        Após a inicialização, você pode testar as APIs através de um cliente REST ou navegador, utilizando os endpoints
        disponíveis nas classes "GameController" e "GameListController".
    </li>
    <li>Lembre-se de realizar testes adequados para garantir o funcionamento correto das APIs.</li>
</ol>
    Ao seguir esses passos, você estará pronto para explorar e utilizar o projeto com sucesso. Caso surjam dúvidas ou
    problemas, verifique os logs de execução e as configurações para identificar possíveis causas e soluções.
    Mantenha-se atento à documentação e boa exploração!
<h2 id="autor">Autor</h2>
<p>Luis Gabriel Goés De Santana</p>
<h2 id="contatos">Contato</h2>
<p>luis.santana.profissional@gmail.com</p>
<p>https://www.linkedin.com/in/luisgabrielsantana/</p>
