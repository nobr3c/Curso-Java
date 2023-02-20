## **Terminal no Windows**

O Terminal no Windows é uma ferramenta imprescindível na vida dos profissionais da TI, do programador ao profissional de redes, pois é uma ferramenta capaz de fazer instalações, configurações, checar dados e navegar pelo sistema. O terminal não é uma novidade para ninguém no mundo da programação, ele sempre esteve ali e sempre estará, no entanto, não são todos que gostam ou sabem usá-lo. Caso esse seja seu caso, vamos te ajudar nesse artigo.

## **CMD vs PowerShell**

Atualmente, encontramos no Windows dois terminais diferentes. O CMD (ou Prompt de Comando) é o mais clássico, com fundo preto. Já o Windows PowerShell é mais recente e tem o fundo azul. Em resumo, o PowerShell é uma evolução do CMD, fazendo tudo o que o CMD faz e um pouco mais. Como por exemplo, usar alguns comandos próprios de sistemas baseados em Unix, ou seja, Linux e MacOS.

## **Conhecendo o CMD**

Para abrir o CMD digite “CMD” ou “Prompt” no menu Iniciar:

![imagem](https://blog.cod3r.com.br/wp-content/uploads/2021/01/1-1.png)

Quando aberto dessa forma ele apontará diretamente para a pasta do seu usuário. Em outras palavras, no início o CMD vai apontar para o seguinte caminho: **C**, que é o HD principal da sua máquina, onde o Windows está instalado; e **Users**, que é a pasta de usuários e seu nome de usuário.

![imagem](https://blog.cod3r.com.br/wp-content/uploads/2021/01/2-1.png)

Para demonstrar melhor, vou usar o comando **“dir“**, que serve para mostrar as pastas e arquivos que estão na pasta apontada pelo terminal no Windows. Para utilizar o comando basta digitar e apertar Enter.
![imagem](https://blog.cod3r.com.br/wp-content/uploads/2021/01/3.png)

Há ainda outra forma de abrir o terminal, mas dessa vez escolhendo a pasta onde ele irá apontar. Para isso, abra a pasta escolhida para iniciar o terminal no Windows, segure o SHIFT e clique com o botão DIREITO do mouse em alguma parte em branco da pasta. Atenção! Não clique em cima de nenhum arquivo ou pasta dentro daquela pasta. O resultado é o seguinte:

![imagem](https://blog.cod3r.com.br/wp-content/uploads/2021/01/4-1.png)

Dessa forma, você abrirá o PowerShell, mas como ele funciona da mesma forma não tem problema nenhum. Como resultado temos o terminal aberto já apontando para a pasta em questão para a qual navegamos.

!(imagem)[https://blog.cod3r.com.br/wp-content/uploads/2021/01/5-1.png]

## **Navegando pelo sistema com o terminal**

Vamos usar dois comandos para navegar pelas pastas do sistema: os comandos “cd” e “dir”. O **“cd”** é como um duplo clique no mouse, ou seja, ele abre a pasta, além de servir para voltar para trás.

Como ambos os terminais funcionam de forma semelhante, a partir daqui usarei apenas o PowerShell.

Com o terminal aberto na pasta selecionada, podemos usar o comando **“dir”** para descobrir o que há nela e poder avançar ou não. Para exemplificar melhor, começarei a partir da minha pasta “Projeto”, que fica no meu HD secundário.

!(image)[https://blog.cod3r.com.br/wp-content/uploads/2021/01/6-1.png]

Como estamos no PowerShell, os comandos do Linux também funcionam. O comando equivalente ao “dir” no Linux é o “ls”, então também podemos usá-lo:

!(image)[https://blog.cod3r.com.br/wp-content/uploads/2021/01/7-1.png]

### **cd + nome da pasta**

A partir daqui podemos usar o comando “cd + nome da pasta” para avançar para dentro de uma pasta. Nesse caso, você deve escrever o nome correto da pasta e ela deve estar dentro da pasta atual onde você está, por exemplo:

!(image)[https://blog.cod3r.com.br/wp-content/uploads/2021/01/8-1.png]

Dentro da nova pasta podemos utilizar o comando “dir” novamente para verificar o que há nela.

!(image)[https://blog.cod3r.com.br/wp-content/uploads/2021/01/9-1.png]

### **cd ..**

Podemos usar o comando “cd ..” para retornar uma pasta atrás da atual. Esse comando é sempre o mesmo, você pode usá-lo sempre que quiser ir para a pasta anterior.

!(image)[https://blog.cod3r.com.br/wp-content/uploads/2021/01/10-1.png]

### **clear**

Outro comando super interessante é o “cls” ou “clear”. Ele limpa todos os comandos listados, melhorando a visualização no terminal. Lembrando que ele limpa apenas os comandos, nenhum efeito de comando anterior é perdido.

### **mkdir**

Você também pode criar uma nova pasta a partir do terminal com o comando “mkdir”. No exemplo a seguir, usei o “dir” para mostrar as pastas contidas na pasta “Projetos”, criei uma nova pasta, mostrei novamente as pastas com o “dir”, para mostrar que foi adicionada uma nova pasta lá, e entrei na pasta recém criada com o comando “cd”.

!(image)[https://blog.cod3r.com.br/wp-content/uploads/2021/01/11-2.png]

### **del + nome da pasta/arquivo**

Você pode também apagar arquivos e pastas com o comando “del + nome da pasta/arquivo”. Da seguinte forma:

!(image)[https://blog.cod3r.com.br/wp-content/uploads/2021/01/12-1.png]

### **Help**

Um outro comando super válido de se utilizar é o ‘help’, pois ele lista todos os comandos que você pode utilizar. É muito bom para quem não quer ir pesquisar em outro local sobre os demais comandos do terminal. Basta utilizar o comando ‘help’ dentro dele mesmo e pronto!

!(image)[https://blog.cod3r.com.br/wp-content/uploads/2021/01/14.png]

### **Outros usos**

Várias tecnologias quando instaladas na sua máquina têm o potencial de serem utilizadas pelo terminal. Um exemplo disso é o NodeJS, uma vez instalada na sua máquina você pode utilizar comandos com o ‘npm’ ou ‘node’, que indicam que você estará utilizando aquele software.

!(image)[https://blog.cod3r.com.br/wp-content/uploads/2021/01/13.png]

Checando versões no CMD Terminal do Windows
Lembrando que no caso do Node é instalado um terminal próprio do Node que recebe comandos JavaScript e esse terminal do Node NÃO funciona como o CMD e o PowerShell do Windows, então não abram ele e tentem utilizar pois isso irá gerar erros nos comandos.

Outro caso é o [Flutter](https://blog.cod3r.com.br/dart-e-flutter-instalacao-e-configuracao/) e o [Dart](https://blog.cod3r.com.br/dart-e-flutter-instalacao-e-configuracao/), que também se utilizam do terminal após instalados na máquina, sendo capazes de criar projetos, se atualizar dentre outras coisas.

Esses outro comandos variam de tecnologia para tecnologia, de versão para versão, então não irei dar tantos exemplos aqui, mas sempre que se instalar uma nova tecnologia é bom lembrar de verificar e aprender quais comandos aquela tecnologia possui no seu terminal.

Esse pequeno guia é apenas um compilado de pequenas dicas para pessoas que tiveram pouco ou nenhum contato com o terminal consigam lidar de forma mais efetiva com essa ferramenta tão importante. E que também tenham menos medo dele! Espero ter ajudado. Bons estudos e até a próxima!

[Fonte: Blog Cod3r](https://blog.cod3r.com.br/terminal-no-windows/)