**--Sistema de Vendas--**

**DESCRIÇÃO DO PROJETO**

O projeto se resume a um sistema capaz de gerenciar produtos, clientes, fornecedores, funcionários e o fluxo de caixa. Com opções
para limpar campos, adicionar, remover e editar informações referentes aos atributos já mencionados no parágrafo, juntamente com tabelas funcionais integradas ao banco de dados do sistema contendo as respectivas
informações dependendo do formulário que estiver aberto.

**METODOLOGIA UTILIZADA**

A metodologia mais eficaz utilizada para esse projeto foi o Kanban, visto que era preciso priorizar as telas mais difíceis para só assim integrá-las a Área de Trabalho, sendo a primeira tela a ser criada levando em
consideração que todo o projeto precisaria estar integrado a ela.


**INSTRUÇÕES PARA EXECUTAR O SISTEMA**

01 - AreaDeTrabalho.java

O sistema não começa necessariamente na área de trabalho, visto que existe uma tela de login que permite a entrada de usuário e administrador. Recapitulando
essa etapa, a área de trabalho é composta pela aba Clientes com opção para acessar o Formulário de Clientes, pela aba Funcionários para acessar o Formulário de Funcionários,
pela aba Fornecedores para acessar o Formulário de Fornecedores, pela aba Produtos para acessar o Formulário de Produtos, pela aba Vendas para acessar o Formulário de Vendas,
pela aba de Configurações para interagir com a opção para troca de usuário e com a aba Sair responsável pela saída do sistema. Também possui um campo que preenche seu nome automaticamente
dependendo do usuário logado, porém seus recursos são somente com o banco de dados instalado no sistema (MySQL e Apache integrado ao Xampp).

02 - FormularioLogin.java

O formulário de Login é a tela que antecede a Área de Trabalho, visto que seus campos para preenchimento são 'Email' e 'Senha' (já registrados no sistema no Formulário de Funcionários). Dependendo das informações que forem
inseridas nesses campos, o usuário pode não ser logado devido a erros de digitação, pode acessar a Área de Trabalho para usuários com permissão de Administrador ou com permissão para Usuário. A tela contém botões responsáveis por tentar o acesso ao sistema 'Entrar' ou cancelar a entrada 'Cancelar'.

03 - FormularioDeClientes.java

O sistema para Cadastro de Clientes se responsabiliza pelo cadastro, remoção e edição de novos clientes dentro do sistema. Integrado com a opção de 'Consulta de Clientes', acessível a
pesquisa referente a qualquer cliente já registrado dentro do banco de dados do sistema com botão funcional para "pesquisar" e após o clique em qualquer funcionário pesquisado, o mesmo terá suas informações
preenchidas automaticamente nos campos de 'Dados Pessoais'. Referente aos campos na aba 'Dados Pessoais', o programa conta com o preenchimento de 'Nome', 'Email', 'Endereço', 'Bairro', 'RG', 'Celular', 'CEP',
'Cidade', 'CPF', 'Telefone', 'Número', 'Complemento' e uma caixa clicável para seleção de UF.

04 - FormularioFuncionarios.java

O sistema para Cadastro de Funcionários consiste no preenchimento 'Nome', 'Email', 'Endereço', 'Bairro', 'RG', 'Celular', 'CEP', 'Cidade', 'CNPJ', 'Telefone', 'Número', 'Complemento'
'Senha' para entrada e gerenciamento do sistema, 'Cargo' em que atua, uma caixa clicável para seleção de UF e outra para a seleção de suas permissões no sistema, sendo elas 'Usuário' ou 'Administrador'. Permissões de
Administradores são absolutas e de Usuário são restringidas, visto que não poderá modificar alguns formulários assim que acessar a Área de Trabalho. O sistema conta com botões funcionais para a limpeza dos campos (NOVO),
adição de novos funcionários dentro do sistema (SALVAR), edição de algum dado referente aos funcionários (EDITAR) e exclusão de algum funcionário que foi desligado da empresa (EXCLUIR). Ao lado temos a aba de Consulta de
Funcionários onde podemos pesquisar quaisquer funcionários já registrados dentro do banco de dados.

05 - FormularioFornecedores.java

O sistema para Cadastro de Fornecedores não distingue-se totalmente do Cadastro de Clientes, visto que possui as mesmas funções. Referente aos campos na aba 'Dados Pessoais', o programa conta com o preenchimento de
'Nome', 'Email', 'Endereço', 'Bairro', 'RG', 'Celular', 'CEP', 'Cidade', 'CNPJ', 'Telefone', 'Número', 'Complemento' e uma caixa clicável para seleção de UF juntamente com os mesmos botões para 'NOVO' responsável por limpar os campos, 'SALVAR' para registrar um novo fornecedor dentro do banco de dados, 'EDITAR' para edição de qualquer dado e 'EXCLUIR' para deleção de qualquer fornecedor dentro do sistema. Ao lado o sistema conta com a aba 'Consulta de Fornecedores' onde conseguimos pesquisar todo e qualquer fornecedor já registrado no sistema.

06 - FormularioProdutos.java

O formulário para Cadastro de Produtos consiste no preenchimento de 'Descrição' (nome do produto), 'Preço' (em R$), uma caixa clicável para a definição do 'Fornecedor' (que pode ser registrada no Formulário de Fornecedores) e o campo de 'Qtd Estoque' que fornece a quantidade exata dos produtos que já existem no sistema ou que pode ser adicionada ao mesmo. Os botões cujas funções já foram detalhadas se resumem ao 'NOVO' para limpar os campos, 'SALVAR' para registrar um novo produto no banco de dados do sistema, o 'EDITAR' para alterar um dado referente ao produto escolhido e o 'EXCLUIR' para apagar um produto do banco de dados do sistema. Ao lado, o formulário conta com a aba Consulta de Produtos responsável por fornecer dados do produto pesquisado no campo 'Descrição' dentro da tabela abaixo integrada ao banco de dados do sistema.

07 - FormularioEstoque.java

O sistema responsável pelo estoque do sistema consiste em apenas adição de novos produtos com base na descrição do mesmo. Com os campos 'Código', 'Descrição' para preenchimento do nome do produto a ser ajustado,
'Quantidade atual' que se autopreenche após o uso do botão 'Pesquisar', o 'Quantidade' para preenchimento manual com a quantidade que desejo adicionar e ao lado o botão 'Adicionar' para cumprir tal incumbência. Abaixo
dos campos, assim como em todos os Formulários, eu possuo uma tabela contendo a lista dos produtos já registrados no banco de dados.

08 - FormularioDetalheVenda.java

Formulário responsável pela pesquisa e detalhe das vendas já realizadas consiste em campo para ID da Venda, 'Cliente' responsável pela compra, a 'Data da Venda' com campo formatado para pesquisa, o 'Total da venda'
contendo o valor em R$ referente a venda e um campo para o preenchimento de Observações. Abaixo dos campos de preenchimento temos uma tabela integrada ao banco de dados do sistema contendo todas as informações
referentes aos produtos e vendas já registrados.

09 - FormularioVendas.java

Sendo uma das telas mais robustas, o PDV (Ponto de Vendas) é responsável por realizar a venda para os Clientes com o preenchimento dos seus campos. O painel 'Cliente' possui os seguintes campos: 'CPF', 'Nome',
'Data' que é automaticamente preenchido com a data atual e um campo para pesquisa do produto desejado denominado 'Pesquise um produto aqui' juntamente com uma tabela funcional integrada ao banco de dados que te
fornece os dados do produto pesquisado. O painel 'Produto' é responsável por detalhar o produto escolhido, sendo seus campos: 'Código', 'Produto' escolhido, que se autopreenche após a escolha, o 'Preço' que também se
autopreenche em R$, a 'Quantidade' desejada do produto escolhido e o 'Desconto em %' que pode ser aplicado ao produto. O painel 'Carrinho' te fornece os dados da sua compra com o Código, Descrição, Quantidade, Preço e o
Subtotal a ser pago referente a quantidade escolhida. Após o preenchimento de todas as informações, o painel 'Total da Venda' te fornece o total a ser pago referente a compra e dois botões com opções para 'Pagamento' e
'Cancelar' a compra.

10 - FormularioPagamentos.java

Após clicar em 'Pagamento' no FormulárioVendas.java, o sistema te direciona automaticamente para o preenchimento das informações referente ao pagamento da sua compra com opções distintas, sendo elas: 'Dinheiro',
'Cartão' ou 'Cheque' juntamente com o campo 'Observações' cujo seu preenchimento é totalmente opcional. Os campos 'Troco' e 'Total' se autopreenchem com base no valor informado para pagamento. O botão 'PAGAR' finaliza
o processo de compra.

11 - FormularioHistorico.java

O formulário para histórico resume-se ao preenchimento de dois campos formatados referentes a datas, sendo eles 'Data início' e 'Data fim' e assim o sistema processa as vendas realizadas nesse intervalo de tempo no qual
foi preenchido dentro da tabela abaixo dos campos, contendo 'Código' do produto, 'Cliente' que fez a compra, 'Data da Venda', 'Total da Venda' e 'Observações'.




