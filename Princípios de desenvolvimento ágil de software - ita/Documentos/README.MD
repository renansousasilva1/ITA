# Esse eu já li!

## Descrição do Projeto
"Esse eu já li!" é um sistema de gamificação de leitura onde os usuários podem marcar livros que já leram, acumular pontos e ganhar troféus com base na quantidade e no gênero dos livros lidos. Além disso, há um ranking com os 10 usuários com maior pontuação.

## Tecnologias Utilizadas
- **Linguagem**: Python
- **Framework**: Django
- **Banco de Dados**: Banco de dados padrão do Django (SQLite)
- **Ferramentas de Modelagem**: Cartões CRC, Draw.io
- **Metodologias**: TDD, Modelagem Ágil, Programação Orientada a Objetos

## Funcionalidades
- **Autenticação de usuários**
- **Visualização de lista de livros**
- **Marcar leitura de um livro**
- **Pontuação automática baseada no número de páginas**
- **Conquista de troféus ao ler 5 livros de um mesmo gênero**
- **Ranking dos 10 melhores leitores**
- **Perfil do usuário com histórico de livros lidos e troféus conquistados**

## Instalação e Configuração
### 1. Clone o Repositório
```bash
 git clone https://github.com/seu-usuario/esse-eu-ja-li.git
 cd esse-eu-ja-li
```
### 2. Configurar Ambiente Virtual
Crie e ative um ambiente virtual:
```bash
python -m venv venv
source venv/bin/activate  # Linux/Mac
venv\Scripts\activate   # Windows
```
### 3. Instalar Dependências
```bash
pip install -r requirements.txt
```

### 4. Configurar o Banco de Dados
Realize as migrações para configurar o banco de dados:
```bash
python manage.py migrate
```

### 5. Executar o Servidor
Inicie o servidor local:
```bash
python manage.py runserver
```
O sistema estará acessível em `http://localhost:8000`

## Estrutura do Projeto
```
/esse-eu-ja-li
├── app/                 # Aplicação principal do Django
│   ├── migrations/      # Arquivos de migração do banco de dados
│   ├── models.py        # Modelos do banco de dados
│   ├── views.py         # Lógica das views
│   ├── templates/       # Arquivos HTML para renderização
│   ├── tests.py         # Testes automatizados
├── manage.py            # Script de gerenciamento do Django
├── requirements.txt     # Dependências do projeto
├── db.sqlite3           # Banco de dados SQLite
└── README.md            # Documentação do projeto
```

## Modelagem do Sistema
### Diagrama de Domínio
Os diagramas foram criados utilizando os princípios da modelagem ágil com foco em Cartões CRC (Classes, Responsabilidades e Colaborações). Eles podem ser encontrados no arquivo [diagramas_sistema.pdf](./diagramas_sistema.pdf).

### Justificativa dos Diagramas
Foram escolhidos diagramas de domínio e arquitetura para representar claramente as relações entre as entidades do sistema e a estrutura geral do projeto. Essa escolha foi feita para garantir que a comunicação entre as partes interessadas fosse eficaz e para facilitar futuras manutenções no código.

## Contribuição
Caso queira contribuir, faça um fork do repositório, crie uma branch com sua melhoria e envie um pull request!

## Autor
- Nome: Seu Nome
- Email: seuemail@email.com
- GitHub: [Seu GitHub](https://github.com/seu-usuario)

---

**MIT License** - Este projeto é de código aberto.

