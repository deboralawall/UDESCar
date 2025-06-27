# 🚗 UDESCAR – Aplicativo de Caronas Universitárias

Aplicativo desenvolvido para facilitar a oferta e solicitação de caronas entre alunos da universidade. O projeto é dividido em duas partes: um app Android nativo (front-end) e uma API REST em Java com Spring Boot (back-end), que se comunicam via HTTP.

---

## ✨ Funcionalidades

- Cadastro de caronas: informe veículo, endereço e agendamento.
- Navegação entre telas com ações intuitivas.
- Backend que recebe as caronas via API REST.
- Interface simples e objetiva para uso cotidiano por estudantes.

---

## 🔧 Tecnologias Utilizadas

### 📱 Front-end (App Android)
- Android Studio
- Java
- XML (layouts)
- ConstraintLayout
- [ ] Retrofit (para comunicação REST – em desenvolvimento)

### 🖥️ Back-end (API Java)
- Java 17+
- Spring Boot
- REST Controller
- JSON (via Jackson)
- CORS habilitado para Android

---

## 📡 Requisitos Não Funcionais

- ✅ **Front-end desenvolvido em Android nativo**
- ✅ **Back-end desenvolvido em Java com Spring Boot**
- ✅ **Comunicação entre front e back-end utilizando o padrão arquitetural REST**

---

## 📂 Estrutura do Projeto

📦 udescar/
├── 📱 app/ → Projeto Android (Activities, XMLs, recursos)
│ └── src/...
├── 🖥️ backend/ → Projeto Java Spring Boot com API REST
│ └── src/...
└── 📄 README.md → Documentação do projeto

## 🚀 Como Executar

### 📱 App Android
1. Abrir o projeto no Android Studio
2. Executar em um AVD ou dispositivo físico
3. Verificar se o backend está rodando antes de enviar dados

### 🖥️ Backend Java
1. Abrir projeto com IntelliJ ou VSCode
2. Rodar a classe `CaronasBackendApplication`
3. Acessar o endpoint: `http://localhost:8080/api/caronas`

---

## 📬 Exemplo de Envio de Carona (JSON)

```json
{
  "carro": "Fiat Uno",
  "endereco": "Av. Central, 123",
  "agendamento": "2025-06-30"
}
