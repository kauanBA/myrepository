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
