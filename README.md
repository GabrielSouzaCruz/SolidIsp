# SolidIsp

Este é um projeto Java simples que demonstra a aplicação do **Princípio da Segregação de Interfaces (Interface Segregation Principle - ISP)**, o "I" dos princípios SOLID.

## Conceito

O ISP sugere que nenhuma classe deve ser forçada a implementar interfaces que não utiliza. Em vez de uma única interface " monolítica", é preferível ter várias interfaces menores e específicas.

Neste projeto, em vez de ter uma única interface `Dispositivo` com métodos para `imprimir`, `enviarFax`, `digitalizar` e `fazerXerox`, as funcionalidades são segregadas em interfaces menores:

* `Printerable`: Define apenas a capacidade de imprimir (`printDocument`).
* `Faxable`: Define apenas a capacidade de enviar fax (`faxDocument`).
* `IODevice`: Define as capacidades de digitalizar (`scanDocument`) e fazer xerox (`xeroxDocument`).

## Estrutura do Projeto

O projeto está dividido nos pacotes `model` (contendo as interfaces e implementações) e `view` (contendo a classe principal para execução).

### Model

* **Interfaces:**
    * `src/model/Printerable.java`: Interface para dispositivos que imprimem.
    * `src/model/Faxable.java`: Interface para dispositivos que enviam fax.
    * `src/model/IODevice.java`: Interface para dispositivos com funções de scan e xerox.

* **Classes:**
    * `src/model/StandardPrinter.java`: Uma impressora padrão que implementa *apenas* `Printerable`.
    * `src/model/Fax.java`: Um aparelho de fax que implementa *apenas* `Faxable`.
    * `src/model/MultiFunctionalPrinter.java`: Uma impressora multifuncional que implementa `IODevice`, `Faxable` e `Printerable`, pois possui todas essas capacidades.

### View

* `src/view/Main.java`: Classe principal que instancia os diferentes dispositivos e demonstra suas funcionalidades.

## Como Executar

O projeto é um projeto Java padrão (configurado para Eclipse, como indicam os arquivos `.project` e `.classpath`).

1.  Importe o projeto em sua IDE Java (como Eclipse ou IntelliJ).
2.  Execute a classe `view.Main.java`.

### Saída Esperada

Ao executar a classe `Main`, a seguinte saída será exibida no console, demonstrando que cada objeto executa apenas a ação para a qual foi designado:
<br>FX: Enviando documento: Conteúdo para operação de I/O 
<br>SP: Imprimindo documento: Conteúdo para operação de I/O 
<br>MP: Digitalizando documento: Conteúdo para operação de I/O 
<br>MP: Xerocando documento: Conteúdo para operação de I/O
