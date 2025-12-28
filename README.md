# 💰 Conversor de Moedas Java

## 🧾 Descrição

O **Conversor de Moedas** é um aplicativo de linha de comando em **Java**, que permite:

- Realizar conversões entre diferentes moedas com taxas de câmbio em tempo real via **ExchangeRate API**.
- Salvar histórico de conversões em **JSON** (`history.json`).
- Registrar logs detalhados de cada operação em arquivo de texto (`conversions.log`).
- Menu interativo para fácil navegação.

---

## ⚙️ Funcionalidades

- ✅ Conversão de moedas atualizada  
- ✅ Histórico persistente de até 50 registros  
- ✅ Log de operações completo  
- ✅ Limpeza do histórico  
- ✅ Facilidade para adicionar novas moedas  

---

## 💰 Moedas Disponíveis

| Código | Nome Completo        |
|--------|--------------------|
| BRL    | Real Brasileiro    |
| USD    | Dólar Americano    |
| EUR    | Euro               |
| ARS    | Peso Argentino     |
| CNY    | Yuan Chinês        |
| KES    | Xelim Queniano     |
| BOB    | Boliviano          |

---

## 🧩 Tecnologias Utilizadas

- **Java 17+**  
- **Maven** para gerenciamento de dependências  
- **Gson** (JSON)  
- **Java HTTP Client**  
- **ExchangeRate API** ([https://www.exchangerate-api.com](https://www.exchangerate-api.com))  
- Coleções (`Deque`, `List`) e I/O (`java.nio.file`)  

---

## 🚀 Como Executar

### 1. Configuração da API Key
Na raiz do projeto, crie um arquivo `config.properties`:

API_KEY=SUA_CHAVE_AQUI


⚠️ Este arquivo está listado no `.gitignore` para proteger suas credenciais.

### 2. Compilando e rodando com Maven

Compilar o projeto:

```bash
mvn compile


Executar a aplicação:

mvn exec:java -Dexec.mainClass="main.Main"

3. Compilação manual (alternativa)
javac -d out $(find src -name "*.java")
java -cp out main.Main

📂 Estrutura do Projeto
src/
├─ main/Main.java
├─ model/
│  ├─ ConversionRecord.java
│  └─ Currency.java
├─ service/
│  ├─ HistoryManager.java
│  └─ LogService.java
├─ utils/
│  ├─ Conversion.java
│  └─ TaxService.java
history.json
conversions.log
README.md
config.properties
pom.xml

📝 Exemplo de Uso
Menu interativo
1 - Fazer conversão
2 - Ver histórico
3 - Limpar histórico
4 - Sair

Histórico (history.json)
[
  {
    "timestampIso": "2025-12-28T19:07:02.1674043-03:00[America/Sao_Paulo]",
    "from": "USD",
    "to": "BRL",
    "amount": 200,
    "rate": 5.5213,
    "result": 1104.26
  }
]

Log (conversions.log)
2025-11-03T00:40:32-03:00 | BRL -> USD | amount=1000 | rate=0.1858 | result=185.80

👤 Autor

Renata Saturnino Costa
Curso: One(ORACLE) + Alura

🏁 Conclusão

O Conversor de Moedas Java é didático e completo, ideal para quem quer praticar:

Programação Orientada a Objetos (POO) em Java

Persistência em JSON e arquivos de log

APIs REST com Java HTTP Client

Tratamento de exceções e boas práticas