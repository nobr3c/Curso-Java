## **Terminal no MacOS e Linux**

O [Terminal](https://blog.cod3r.com.br/tag/terminal/) no MacOS e Linux é uma ferramenta indispensável para os profissionais da TI, desde o programador até o profissional de redes. Afinal, é uma ferramenta capaz de fazer instalações, configurações, checar dados e navegar pelo sistema.

Mesmo não sendo muito conhecido no mundo da programação, não são todos que gostam ou sabem usá-lo. Se esse é seu caso, vamos te ajudar nesse artigo!

## **Conhecendo o Terminal**

Para abrir o Terminal no MacOS e Linux procure por “Terminal” na sua lista de Programas/Aplicativos. No Mac, você pode usar o Spotlight com o atalho “COMMAND + ESPAÇO” e digitar “terminal” para abri-lo.

![image](https://blog.cod3r.com.br/wp-content/uploads/2021/03/Untitled1-1.png)

Abrindo dessa forma, ele apontará diretamente para a pasta do seu usuário, ou seja, para o caminho: C, que é o HD principal da sua máquina, onde o seu OS está instalado; e Users, que é a pasta de usuários e seu nome de usuário.

Pode ser que o que apareça na sua tela varie um pouco de acordo com seu sistema e a versão dele. Mas o padrão é o seguinte:

![image](https://blog.cod3r.com.br/wp-content/uploads/2021/03/Untitled.png)

Para demonstrar melhor, vou usar o comando “ls“, que serve para mostrar as pastas e arquivos que estão na pasta apontada pelo terminal no momento. Para usar o comando basta digitar e apertar Enter.

![image](https://blog.cod3r.com.br/wp-content/uploads/2021/03/Untitled1.png)

Você também pode escolher qual pasta será apontada ao abrir o Terminal. Basta abrir o explorador de Arquivos (no Mac é o Finder) e navegue até a pasta que você quer abra no terminal. Em seguida, clique com o botão direito na pasta e selecione a opção de abrir um novo Terminal na pasta. No Mac você verá o seguinte:

![image](https://blog.cod3r.com.br/wp-content/uploads/2021/03/Untitled2.png)

E no Ubuntu, assim:

![image](https://blog.cod3r.com.br/wp-content/uploads/2021/03/Untitled3.png)

Ao clicar nessa opção, o Terminal abrirá diretamente naquela pasta.

![image](https://blog.cod3r.com.br/wp-content/uploads/2021/03/Untitled4.png)

Se o caminho para a pasta não aparecer no terminal, você pode testar se deu tudo certo com o comando “pwd”. Esse comando printa o caminho atual no terminal, ou seja, para onde ele está apontando.

![image](https://blog.cod3r.com.br/wp-content/uploads/2021/03/Untitled5.png)

## **Navegando pelo sistema com o terminal**
Vamos usar dois comandos para navegar pelas pastas do sistema: os comandos “cd” e “ls”. O “cd” funciona como um duplo clique no mouse, ou seja, ele abre a pasta e retorna para a pasta anterior.

O “ls”, quando o terminal está aberto na pasta selecionada, serve para descobrir o que há nela e avançar ou não. Para exemplificar melhor, começarei a partir da minha pasta “projects”, que fica no meu HD principal.

![image](https://blog.cod3r.com.br/wp-content/uploads/2021/03/Untitled-1.png)

Primeiramente, vamos usar o comando “ls” para saber quais pastas estão dentro da pasta atual.

![image](https://blog.cod3r.com.br/wp-content/uploads/2021/03/Untitled-1-1.png)

Você também pode usar algumas variações do comando ls, como por exemplo a flag “a” que mostra todos os arquivos, inclusive os escondidos.

![image](https://blog.cod3r.com.br/wp-content/uploads/2021/03/Untitled-2.png)

Outra flag é “l”, que mostra a versão longa do “ls” normal, ou seja, traz mais informações sobre os arquivos.

![image](https://blog.cod3r.com.br/wp-content/uploads/2021/03/Untitled-3.png)

Você também pode juntar as flags e usá-las ao mesmo tempo:

![image](https://blog.cod3r.com.br/wp-content/uploads/2021/03/Untitled-4.png)

De agora em diante, podemos usar o comando “cd + nome da pasta” para avançar para dentro de uma pasta. Nesse caso, você deve escrever o nome correto da pasta e ela deve estar dentro da pasta atual onde você está, por exemplo:

![image](https://blog.cod3r.com.br/wp-content/uploads/2021/03/Untitled-5.png)

Dentro da nova pasta podemos usar o comando “ls” para verificar seu conteúdo:

![image](https://blog.cod3r.com.br/wp-content/uploads/2021/03/Untitled-6.png)

Podemos usar também o comando “cd ..” para retornar para a pasta anterior.

![image](https://blog.cod3r.com.br/wp-content/uploads/2021/03/Untitled-7.png)

### **Limpando o Terminal**

Após usarmos vários comandos, um após o outro, o Terminal acaba ficando poluído.

![image](https://blog.cod3r.com.br/wp-content/uploads/2021/03/Untitled-8.png)

Por isso usamos o comando “clear” para limpar a tela.

![image](https://blog.cod3r.com.br/wp-content/uploads/2021/03/Untitled-9.png)

Um fato interessante é que no MacOS o comando “clear” não limpa de fato o terminal, mas apenas printa várias linhas vazias para que os comandos usados anteriormente subam na tela e não fiquem visiveis.

![image](https://blog.cod3r.com.br/wp-content/uploads/2021/03/Untitled-10-1374x1536.png)

Para limpar o terminal de verdade, você deve usar o atalho “COMMAND + K”. Dessa forma o terminal será de fato zerado e renovado.

![image](https://blog.cod3r.com.br/wp-content/uploads/2021/03/Untitled-11.png)

### **Criando pastas via terminal**
Você também pode criar uma nova pasta a partir do terminal com o comando “mkdir”.

No exemplo abaixo eu usei o “ls” para mostrar as pastas contidas dentro na pasta “projects”; criei uma nova pasta; mostrei novamente as pastas com o “ls”, para mostrar que foi adicionada uma nova pasta lá; e entrei na pasta recém criada com o comando “cd”.

![image](https://blog.cod3r.com.br/wp-content/uploads/2021/03/Untitled-12.png)

### **Deletando pastas e arquivos via terminal**
Para deletar arquivos pelo terminal basta usar o comando “rm” para deletar arquivos, e “rmdir” para deletar pastas. Vou exemplificar deletando a pasta que criei no exemplo anterior.

![image](https://blog.cod3r.com.br/wp-content/uploads/2021/03/Untitled-13.png)

### **Outros usos**
Várias tecnologias instaladas na sua máquina podem ser usadas pelo terminal, como por exemplo o NodeJS, Flutter e Dart. Após instalar, você pode usar os comandos com o ‘npm’, ‘node’, ‘dart’ ou ‘flutter’ para indicar que você quer usar aquele software especificamente.

![image](https://blog.cod3r.com.br/wp-content/uploads/2021/03/Untitled-14.png)

Esses outros comandos variam de tecnologia para tecnologia, de versão para versão, então não irei dar tantos exemplos aqui. Mas sempre que você instalar uma nova tecnologia, é bom verificar quais comandos podem ser usados no terminal.

Nesses dois sites existem alguns links com vários comandos e dicas que você pode usar no terminal:

<https://www.makeuseof.com/tag/mac-terminal-commands-cheat-sheet/> 

<https://www.guru99.com/linux-commands-cheat-sheet.html/>

Esse pequeno guia é apenas um compilado de pequenas dicas para pessoas que tiveram pouco ou nenhum contato com o terminal no MacOS e Linux consigam lidar de forma mais efetiva com essa ferramenta tão importante. E que também tenham menos medo dele! Espero ter ajudado.


[Fonte: Blog Cod3r](https://blog.cod3r.com.br/terminal-no-macos-e-linux/)
