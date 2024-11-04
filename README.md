# ConsultoriaApp
# Grupo: EnterConnection

## Descrição do Projeto:
O ConsultoriaApp é um aplicativo desenvolvido para listar e gerenciar empresas com grande potencial na área de consultoria da Plusoft. O objetivo é oferecer uma ferramenta eficiente que permita aos usuários visualizarem, cadastrarem e editarem informações sobre empresas, mantendo os dados organizados e acessíveis. A integração com uma API RESTful garante a sincronização das informações, e o uso de AsyncStorage permite que os dados sejam salvos localmente.

## Funcionalidades
Cadastro de Empresas: Tela dedicada ao cadastro de novas empresas com campos como nome, área de atuação e avaliação.
Edição de Empresas: Permite atualizar as informações de empresas já cadastradas.
Listagem de Empresas: Exibe todas as empresas cadastradas em uma lista paginada, permitindo busca e ordenação.
Perfil do Usuário: Tela de perfil com dados do usuário, personalizável.
Navegação Entre Telas: Navegação intuitiva e dinâmica entre as principais telas do aplicativo.
Integração com API: CRUD completo com uma API RESTful para sincronização de dados de empresas.
Paginação: Divisão da listagem de empresas em páginas para melhor desempenho e experiência do usuário.
Salvamento de Dados Localmente: Uso de AsyncStorage para persistir dados offline.
Estrutura do Projeto
com.example.consultoriaapp.data:
Contém as classes de modelo e repositórios para gerenciar dados e suas operações, tanto local quanto remoto.

com.example.consultoriaapp.network:
Contém classes para integração com a API, incluindo as configurações do Retrofit e a definição dos endpoints.

com.example.consultoriaapp.ui:
Contém as telas e atividades do aplicativo, responsáveis pela interação com o usuário e a exibição das informações.

res/layout:
Diretório onde estão localizados os arquivos XML que definem a interface das telas.

Tecnologias Utilizadas
Linguagem: Kotlin
API RESTful: Retrofit para comunicação com o servidor
Persistência de Dados: AsyncStorage para armazenamento de dados local no dispositivo
Arquitetura: Padrão MVC (Model-View-Controller), garantindo separação clara de responsabilidade

Integrantes do Grupo:
- Eduardo Ferreira Silva de Jesus - rm98410 - 2TDSPN
- Enrico do Nascimento Ferreira Galdino - rm552082 - 2TDSPH
- Fabio de Oliveira Targa - rm551328 - 2TDSPM
- Luis Felipe do Santos Tragl - rm99476 - 2TDSA
- Vinicius Durce Carlini - rm550427 - 2TDSPM
