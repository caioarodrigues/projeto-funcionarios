
# Comando para construir a imagem Docker
build:
	docker build -t projeto-funcionarios .

# Comando para executar o contêiner
run:
	docker run --rm projeto-funcionarios

# Comando para limpar arquivos gerados
clean:
	rm -f projeto-funcionarios.jar