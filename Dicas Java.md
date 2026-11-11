###### **Conceito método 'main':**

* O método 'main' que identifica se a classe pode ser executada, ou seja, é a partir da classe com este método que o sistema se inicia.



\--------------------------------------------------------------------

###### **Conceito de Workspace:**

* Pode ser criados vários workspaces, um para cada projeto em pastas distintas podendo ser configurado a IDE para cada projeto diferente.



\--------------------------------------------------------------------

###### **Atalhos:**

1. Escrever '*main*' pressionar \[*Ctrl + Space*] e escolher a opção '*main*' para criar a estrutura '*public static void main*'
2. \[Ctrl + M] - Abre o 'Package Explorer'(menu lateral das pastas)
3. No cmd, digital ***jshell*** para testes igual a um interpretador e para sair digitar '/exit'



\--------------------------------------------------------------------

###### **Dicas:**

* No Java quando as ***divisões*** são realizadas com números inteiros o resultado sempre será um numero inteiro. Para divisões que o resultado tenha que ser um float, a divisão deverá ser float. Ex: 5/9 => 0 ; 5.0/9.0 => 0.5555555555555556



* ***Constantes*** por convenção precisam ser em maiúsculas. Ex: final double FATOR = 5.0/9.0



\--------------------------------------------------------------------

###### **Javac:** (compilador java)

* *Javac* é o compilador do java para gerar o arquivo .class, ou seja, se estiver desenvolvendo o código no VSCode e consequentemente não gerar o arquivo .class, pode ser executado pelo cmd o *javac* para compilar este arquivo, gerar assim o .class .
* **Exemplo**: Navegue até o diretório do projeto java pelo cmd e execute o comando *javac nomeArquivo.java* para assim gerar o arquivo .class



\--------------------------------------------------------------------

###### **Métodos:**

* Por convenção, o nome de um método eh feito em CamelCase mas com a primeira letra em minúsculo, diferente da classe

&#x20;   **Ex:** Metodo -> nomeDoMetodo

&#x20;       Classe -> NomeDaClasse

* **Obs. 1:** Pode ser criado dois métodos com o mesmo nome mas com assinaturas diferentes. A assinatura seria o nome do método + quantidade e tipo de parâmetros. Ou seja, Se eu tiver 'nome e quantidade tipo' de parâmetros iguais em outro método da erro.
* Mas se eu tiver: -> 'nome igual, quantidade de parâmetros igual com tipos diferentes' da certo. Ou

&#x20;                   -> 'nome igual, quantidade de parâmetros diferentes com tipos iguais' da certo. Ou

&#x20;**Ex**

&#x20;precoComDesconto(int x , int y, int b); -> Erro

&#x20;precoComDesconto(int x , int y, int b); -> Erro

&#x20;----------

&#x20;precoComDesconto(int x , int y, int b); -> OKA

&#x20;precoComDesconto(int x , int y);        -> OK

&#x20;----------

&#x20;precoComDesconto(int x    , int y   , int b   ); -> OK

&#x20;precoComDesconto(double x , double y, double b); -> OK

&#x20;

**Obs. 2:** Quando se cria um método sem parâmetros, o Java consegue executar pois ao chamar a classe para inserir os valores de variáveis da classe, estes valores já estão dentro da classe. Então por conta disso o método sem parâmetros passados ira funcionar.

**Obs. 3:** Métodos **static** só conseguem utilizar atributos de classes, se estas classes estiverem estanciadas dentro do método, ou se o próprio atributo for **static**.(**Ex**. verificar classe **PrimeiroTrauma**)



\--------------------------------------------------------------------

###### **Construtores:**

* O construtor em Java garante que os atributos da classe recebam os valores inicias válidos, preparando os objetos para uso e pode ser usado para alocar recursos necessários.
* Quanto se cria uma classe, o Java criar implicitamente um construtor padrão sem parâmetros, para que a classe seja executada corretamente. Contudo, esta garantia de que os atributos iram receber os valores corretamente, não é garantida.
* Então para isso é criado um CONTRUTOR EXPLICITAMENTE para que esta garantida  de valores dos atributos seja realizada.
* **Obs. 1:** Pode ser criado mais de um construtor dentro de uma classe com mesmo nome, mas com a assinatura diferente.
* **Obs. 2:** Pode ser criado um construtor padrão caso seja necessário para garantir o funcionamento do sistema onde objetos foram criados sem a utilização de algum construtor explicito.
* **Obs. 3:** Construtores não retornam valores.



\--------------------------------------------------------------------

###### **Static:**

* O benefício da utilização de atributos e métodos **static** é que eles pertencem à classe e não às instâncias. Dessa forma, podem ser acessados sem a necessidade de criar objetos da classe. Além disso, atributos **static** possuem apenas uma única cópia compartilhada entre todos os objetos, enquanto atributos não estáticos possuem uma cópia para cada instância.
* **Obs1:** para acessar um atributo **static** que pertence somente a classe, não é necessário estanciar a classe para utiliza-lo, basta somente chamar a classe e o atributo **static** dela.

  * **Ex:** class Math { static double PI = 3.14; } -> System.out.println(Math.PI)
* **Obs2:** Pode ser realizada a alteração de valores de atributo **static**, mas ao realizar esta alteração, será alterado o valor para todas as estancias onde este atributo é chamado/utilizado. Quase como se fosse uma variável global.
* **Dica:** geralmente os atributos *static* estão em *itálico* na IDE. Ex: System.***out***.println(...)
* Da mesma forma que se pode **criar um atributo estático** pode ser criados **métodos estáticos**.



\--------------------------------------------------------------------

###### **Valor vs. Referência:**

* Quando é realizada uma atribuição de tipo primitivo para outro tipo primitivo, são criados dois locais de armazenamento iguais com rótulos de identificação diferente. Ou seja, caso altere um dos tipos primitivos, não impactará no outro.(**Ex:** Verificar classe *ValorVsReferencia*).
* Quando é realizada uma atribuição de uma estancia de classe para outra classe, são criados dois e locais de armazenamento iguais com rótulos diferentes, mas com o local de endereçamento do armazenamento do objeto iguais. Ou seja, caso algum atributo seja alterado em alguma das duas estancias de classes, impactará na outra, isso se dá por conta que as duas estancias criadas por atribuição apontam para o mesmo endereço de memória.(**Ex:** Verificar classe *ValorVsReferencia*).



\--------------------------------------------------------------------

###### **This. e This():**

* A utilização do '**this.'** é para identificar a qual atributo se refere dentro de um construtor ou classe **public**, para classes **static** não é possível utilizar o '**this.'**.
* A utilização do **this()** pode ser utilizado somente dentro de construtor, isso para identificar que irá chamar outro construtor. E esta identificação se dá pela quantidade de parâmetros passados(assinatura) de cada construtor. Ou seja, posso ter vários construtores com assinaturas diferentes, então quando usar o **this()** precisará passar a quantidade de parâmetros corretos para chamar o construtor que deseja. *Isso é bom que evita repetição de código e escritas desnecessárias.*(Ex. Verificar classe **Data**)



\--------------------------------------------------------------------

###### **Variáveis Locais:**

* O conceito de variável local, se dá por conta de quando uma variável é criada dentro de um método, e por regra de segurança para evitar uso de lixo de memória, está não são inicializadas implicitamente com o valor padrão de cada tipo primitivo, ou seja, **variáveis locais devem ser inicializadas explicitamente**.
* Já **variáveis de classe(estáticas) ou estancia** são inicializadas implicitamente pelo Java.
* As **variáveis constantes( final )** também necessitam ser inicializadas explicitamente, podem também ser inicializadas na declaração, em blocos de inicialização ou no construtor, e só podem receber valor uma única vez.



\--------------------------------------------------------------------

###### **Equals e Hashcode:**

* Por padrão, o método **equals** sempre estará disponível em qualquer classe existente ou criada no java, assim como outros métodos nativos.
* E como estará disponível, alguns destes métodos possibilitam serem implementados e ajustados/sobrescrever(**override**) para atender os critérios específicos do seu sistema desenvolvido.



\--------------------------------------------------------------------

###### **Collections:**

* Collections em Java são uma arquitetura unificada (Framework) que armazena, manipula e organiza grupos de objetos como uma única unidade. Localizadas no pacote java.util, substituem arrays limitados, oferecendo **interfaces** como **List, Set, Queue e Map**, facilitando operações como adicionar, remover, ordenar e buscar dados de forma eficiente.
* **Set** (Conjunto): Coleção que não permite elementos duplicados. Útil para garantir unicidade (*ex: HashSet, TreeSet*).

  * Em Java, o **HashSet não aceita tipos primitivos** (como *int, double, boolean, char*) diretamente na sua declaração, pois coleções em Java funcionam apenas com objetos. O Java utiliza um recurso chamado autoboxing para converter automaticamente o primitivo em objeto
  * **Tipos de Set em Java:**

    * ***HashSet:*** É a implementação mais performática para inserção e busca. Não garante nenhuma ordem específica dos elementos e **permite null**.
    * ***LinkedHashSet:*** Mantém os elementos na ordem em que foram inseridos. É um meio-termo entre HashSet e TreeSet, sendo ligeiramente mais lento que o HashSet devido à manutenção da ordem.
    * ***TreeSet:*** Ordena os elementos de acordo com sua ordem natural (ou um Comparator personalizado). Utiliza uma estrutura de árvore (Red-Black tree), tornando as operações mais lentas que as outras implementações
* **List** (Lista): Coleção ordenada que aceita elementos duplicados. O acesso é feito por índice (*ex: ArrayList, LinkedList*).
* **Queue** (Fila): Estruturada para processamento, geralmente no padrão FIFO (*First In, First Out* - primeiro a entrar, primeiro a sair).
* **Map** (Mapa): Estrutura de chave-valor. Não permite chaves duplicadas (*ex: HashMap, TreeMap*). \[Como se fosse um Hash Corebuilder]



\--------------------------------------------------------------------

###### **Enum:**

* Um enum em Java é um tipo de dado especial usado para definir conjuntos fixos de constantes pré-definidas (como dias da semana, status de pedidos ou meses). Ele funciona como uma classe especializada que torna o código mais seguro, legível e organizado, impedindo a atribuição de valores inválidos.
* **Principais Características dos Enums em Java:**

  * **Constantes Fixas:** Representam um conjunto imutável de valores, geralmente escritos em MAIÚSCULAS.
  * **Segurança de Tipo:** Garantem que apenas os valores definidos na enumeração sejam utilizados, evitando erros.
  * **Estrutura de Classe:** Enums podem ter construtores, métodos e atributos próprios, permitindo comportamentos complexos.
  * **Uso com switch:** Funcionam perfeitamente em estruturas switch-case.



\--------------------------------------------------------------------

###### **Modificadores de Acesso:**

* **Public (Público):** O modificador public torna classes e membros acessíveis de qualquer lugar do programa, independentemente do pacote, sendo o menos restritivo.
* **Private (Privado):** O nível de acesso private é o mais restritivo; o membro só pode ser acessado dentro da própria classe onde foi definido.
* **Protected (Protegido):** Membros protected podem ser acessados por classes no mesmo pacote e por subclasses(herdado), mesmo que estejam em outros pacotes.
* **Default (Padrão/Package-Private):** Aplicado quando nenhum modificador é especificado. Permite o acesso apenas a classes dentro do mesmo pacote.



\--------------------------------------------------------------------

###### **Interface:**

* Interfaces em Java são contratos (ou padrões) que definem **métodos públicos e abstratos**, e constantes que classes devem implementar. Elas garantem que as classes sigam um comportamento específico, **forçando a implementação dos métodos definidos, mas sem dizer como realizá-los, permitindo polimorfismo e herança múltipla de tipos**.
* **Todo método de uma Interface é publico e abstrato!**

  * **Conceito de abstrato:** método que não contém corpo definido.
* ***Principais características:***

  * **Contrato de Comportamento:** A interface define o que uma classe deve fazer, não como ela faz.
  * **Implementação:** Uma classe utiliza a palavra-chave implements para aderir ao contrato da interface.
  * **Herança Múltipla:** Diferente das classes (que só podem herdar de uma pai), uma classe em Java pode implementar múltiplas interfaces.
  * **Abstração:** Métodos são públicos e abstratos por padrão; a partir do Java 8, interfaces podem ter métodos default (com corpo) e estáticos.



\--------------------------------------------------------------------

###### **Classe abstrata(abstract):**

* Classes abstratas em Java funcionam como modelos (templates) para outras classes, **não podendo ser instanciadas diretamente**. Elas servem de **base para herança**, permitindo definir atributos e **métodos comuns, além de métodos abstratos (sem corpo)** que obrigam as subclasses concretas a implementá-los. Utiliza-se a palavra-chave abstract.
* ***Principais Características e Conceitos:***

  * **Não Instanciável:** Tentar fazer new '*ClasseAbstrata()*' resultará em erro de compilação.
  * **Métodos Abstratos:** Métodos declarados sem implementação ('*abstract void fazerAlgo();*'). As subclasses são forçadas a fornecer a implementação.
  * **Métodos Concretos:** Podem conter métodos normais, com corpo e lógica funcional, que são herdados pelas subclasses.
  * **Herança:** Uma classe concreta que estende uma abstrata deve implementar todos os seus métodos abstratos, a menos que ela também seja abstrata.
  * **Finalidade:** Prover reaproveitamento de código e definir uma estrutura comum (contrato) para classes filhas especializadas.



\--------------------------------------------------------------------

###### **Expressões Lambdas:**

* Expressões Lambda, introduzidas no Java 8, são *funções anônimas* (sem nome, tipo de retorno ou modificador) que permitem representar um comportamento como objeto, simplificando o código. Elas habilitam a programação funcional, permitindo passar funcionalidade como parâmetro e reduzindo a verbosidade de classes anônimas, especialmente em coleções e threads.



\--------------------------------------------------------------------

###### **Exceções Checked e Unchecked:**

* As exceções checadas (checked) exigem tratamento obrigatório pelo compilador, enquanto as não checadas (unchecked) têm tratamento opcional.



* ***Exceções Checadas (Checked Exceptions):***

  * **O que são:** São erros que o programa pode prever e tentar recuperar, como tentar abrir um arquivo que não existe (*FileNotFoundException*) ou uma falha de conexão de rede.
  * **Regra do compilador:** O compilador do Java força você a tratar o problema. Se não tratar, o código nem mesmo compila.
  * **Como tratar:** Você deve usar um bloco *try-catch* para capturar a falha ou declarar a exceção na assinatura do método usando a palavra-chave *throws*.
  * **Hierarquia:** Herdam diretamente da classe *Exception*, mas não de *RuntimeException*.



* ***Exceções Não Checadas (Unchecked Exceptions):***

  * **O que são:** São erros de lógica ou de programação, como acessar uma posição inválida de um vetor (*ArrayIndexOutOfBoundsException*) ou tentar usar um objeto que está nulo (*NullPointerException*).
  * **Regra do compilador:** O tratamento não é obrigatório. O programador decide se quer tratar ou não.
  * **Como tratar:** O uso de *try-catch* é opcional e fica a critério de quem programa.
  * **Hierarquia:** Herdam da classe *RuntimeException*.

\--------------------------------------------------------------------

###### **Finally:**

* O bloco finally em Java é um comando usado após o *try* e o *catch* para executar um código que deve rodar obrigatoriamente, independentemente de um erro ter acontecido ou não.
* ***Para que serve:***

  * **Limpeza de dados:** Fechar conexões de banco de dados, arquivos abertos ou liberar memória.
  * **Garantia de execução:** Roda mesmo se houver um return dentro do bloco *try* ou *catch*.

\--------------------------------------------------------------------

###### **JUnit:**

* ***Ver Cursos de Testes do Wagner da Coder.com.br***
* **Criar repositório local para testes unitários e importando Biblioteca JUnit:**

  1. Clicar com o botão direito em cima do projeto;
  2. Selecionar 'Source Folder' para criar uma nova pasta e nomear como 'test' (o Diretório varia de acordo com o projeto);
  3. Clicar com o botão direito em cima do Projeto;
  4. Selecionar 'Properties'
  5. Acessar 'Java Build Path'
  6. Selecionar a aba 'Libraries'
  7. Irá abrir duas Opções 'Modulepath' e 'Classpath'
  8. Selecionar a opção 'Classpath' e clique em 'Add Library'
  9. Ao abrir a tela, selecionar 'JUnit' e selecione a última versão do JUnit
  10. Clicar em 'Apply and Clouse' para importar a biblioteca no projeto

\--------------------------------------------------------------------

###### **Generics:**

* ***Antes do Generics (com Object):*** Você podia colocar qualquer coisa de um objeto, mas precisava "adivinhar" e fazer uma conversão forçada (cast) na hora de tirar. Se errasse a adivinhação, o programa quebrava rodando.
* ***Com Generics:*** Você coloca uma 'etiqueta' na classe do Objeto(com <T>) dizendo o que vai dentro dela. O Java garante que só entre aquele tipo e te entrega o dado pronto para uso, sem esforço e sem riscos.
* Embora você possa usar qualquer letra (ou até palavras inteiras) dentro do <>, o mercado e a própria linguagem Java utilizam estas letras padronizadas para cada situação:

  1. ***<T> - Type (Tipo):*** É o mais genérico de todos. Usado quando a sua classe ou método pode receber literalmente qualquer tipo de objeto (como o T da classe Caixa<T>).
  2. ***<E> - Element (Elemento):*** Muito utilizado em Coleções (como List, Set, ArrayList). Indica que o tipo representa um elemento contido em uma estrutura de dados (ex: List<E>).
  3. ***<K> e <V> - Key \& Value (Chave e Valor):*** Usados sempre em conjunto quando trabalhamos com estruturas baseadas em mapeamento (como mapas/dicionários). ***Exemplo real:*** O Map<K, V> (onde a chave K pode ser o CPF do cliente e o valor V pode ser o objeto Cliente).
  4. ***<N> - Number (Número):*** Usado quando você quer restringir o seu código para aceitar apenas classes numéricas (como Integer, Double, Float).
  5. ***<R> - Result (Resultado):*** Muito comum no retorno de funções, métodos utilitários ou APIs de Streams do Java moderno.

\--------------------------------------------------------------------

###### **Enum:**

* Em Java, um enum (abreviação de enumeration ou enumeração) é um tipo de dado especial usado para definir um conjunto fixo de constantes nomeadas
* ***O que é e como funciona?***

  * **Tipo de Classe Especial:** Por baixo dos panos, um enum em Java é uma classe que herda de java.lang.Enum. Ele possui um número fixo e pré-definido de instâncias.
  * **Segurança de Tipo (Type Safety):** Garante que uma variável receba apenas valores válidos daquela lista, evitando erros comuns de digitação ou atribuição de dados incorretos (ao contrário de usar apenas String ou int).
  * **Imutabilidade:** As constantes de um enum são public, static e final por padrão.
  * **Funcionalidades extras:** Diferente de outras linguagens, os enums em Java podem ter *construtores, atributos, métodos e implementar interfaces.*

\--------------------------------------------------------------------

#### **Java Swing:**



###### **JFrame:**

* O JFrame é uma classe do pacote Java Swing (javax.swing.JFrame) usada para criar e gerenciar janelas de nível superior em aplicações gráficas desktop (GUI).

\--------------------------------------------------------------------

###### **JPanel:**

* O JPanel na biblioteca Swing do Java é um contêiner leve e visual que serve para agrupar e organizar outros componentes de interface gráfica (como botões, rótulos e campos de texto) dentro de uma janela.

\--------------------------------------------------------------------

###### **GridBagLayout:**

* O GridBagLayout é um dos gerenciadores de layout (layout managers) mais flexíveis e complexos da plataforma Java (no pacote java.awt e usado com Swing).
* Ele organiza os componentes visuais em uma grade (grid) de linhas e colunas, mas com muito mais liberdade do que o GridLayout tradicional.
* **Principais Características:**

  1. ***Células de tamanhos variáveis:*** As linhas não precisam ter a mesma altura e as colunas não precisam ter a mesma largura.
  2. ***Mesclagem de células:*** Um único componente pode ocupar várias linhas e/ou colunas ao mesmo tempo.
  3. ***Uso obrigatório de GridBagConstraints:*** Para definir onde cada componente fica na grade, você usa um objeto da classe GridBagConstraints. É ele quem dita a posição (gridx, gridy), o tamanho da ocupação (gridwidth, gridheight), o preenchimento (fill), o peso de expansão (weightx, weighty), entre outras regras.
  4. ***Baseado no tamanho preferencial:*** Ele analisa o tamanho mínimo e preferencial de cada componente para calcular as dimensões finais das células da grade.

\--------------------------------------------------------------------

###### **GridBagConstraints:**

* O GridBagConstraints é uma classe do pacote java.awt no Java que define as regras, o posicionamento e o comportamento de cada componente (como botões, caixas de texto e rótulos) quando organizados por um gerenciador de leiaute chamado GridBagLayout.
* Enquanto o GridBagLayout desenha a grade invisível onde os elementos são colocados, é o GridBagConstraints que diz a ele exatamente como cada peça deve se comportar dentro dessa grade.
* **Principais propriedades do GridBagConstraints:**
* Cada instância de GridBagConstraints possui atributos que você configura antes de adicionar um componente ao painel:

  1. ***gridx e gridy:*** Definem a coluna (gridx) e a linha (gridy) iniciais onde o componente será posicionado (começando em 0, 0 no canto superior esquerdo).
  2. ***gridwidth e gridheight:*** Determinam quantas colunas (gridwidth) ou quantas linhas (gridheight) o componente vai ocupar (útil para criar campos que "esticam" por mais de uma célula).
  3. ***fill:*** Controla como o componente se expande se a célula for maior do que ele. Pode receber valores como:

     1. ***GridBagConstraints.NONE*** (tamanho original)
     2. ***GridBagConstraints.HORIZONTAL*** (esticar na horizontal)
     3. ***GridBagConstraints.VERTICAL*** (esticar na vertical)
     4. ***GridBagConstraints.BOTH*** (esticar em ambas as direções)
  4. ***weightx e weighty:*** Definem o "peso" ou a proporção de espaço extra que a linha ou coluna deve receber quando a janela é redimensionada.
  5. ***anchor:*** Define a posição do componente dentro da célula caso ele seja menor do que o espaço disponível (ex: GridBagConstraints.CENTER, GridBagConstraints.SOUTHEAST).
  6. ***insets:*** Define as margens (espaçamento externo/padding) ao redor do componente (new Insets(top, left, bottom, right)).

\--------------------------------------------------------------------

###### **Interface *ActionListener*:**

* O ActionListener em Java é uma interface utilizada para escutar e reagir a eventos de ação em interfaces gráficas (GUI), como cliques em botões, itens de menu ou pressionamento de Enter em campos de texto

  * **Para que serve (Principais Funções):**

    1. **Capturar Interações:** Fica "ouvindo" o usuário interagir com um componente visual (por exemplo, um JButton).
    2. **Desacoplar a Lógica:** Separa a aparência visual do software da regra de negócio que deve ser executada quando algo acontece.
    3. **Executar Código:** *Obrigada a implementação de um único método principal*, o actionPerformed(ActionEvent e), onde você coloca o código que deve rodar no momento em que o evento é disparado.

\--------------------------------------------------------------------

###### **Anotação @FunctionalInterface:**

* Serve para indicar explicitamente que uma interface possui apenas um único método abstrato e garantir que o compilador valide essa regra.

