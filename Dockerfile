# Usa uma imagem base com o JDK instalado
FROM openjdk:17-jdk-slim

# Instala dependências necessárias
RUN apt-get update && apt-get install -y \
    wget \
    unzip \
    && rm -rf /var/lib/apt/lists/*

# Baixa e instala o Kotlin Compiler
RUN wget https://github.com/JetBrains/kotlin/releases/download/v1.9.0/kotlin-compiler-1.9.0.zip && \
    unzip kotlin-compiler-1.9.0.zip && \
    rm kotlin-compiler-1.9.0.zip && \
    mv kotlinc /usr/local/bin && \
    chmod +x /usr/local/bin/kotlinc/bin/kotlinc

# Adiciona o Kotlin ao PATH
ENV PATH="/usr/local/bin/kotlinc/bin:${PATH}"

# Define o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copia todos os arquivos do projeto para o contêiner
COPY . .

# Compila o projeto Kotlin
RUN kotlinc src/*.kt src/model/*.kt src/controller/*.kt src/view/*.kt -include-runtime -d projeto-funcionarios.jar

# Comando padrão para executar o projeto
CMD ["java", "-jar", "projeto-funcionarios.jar"]