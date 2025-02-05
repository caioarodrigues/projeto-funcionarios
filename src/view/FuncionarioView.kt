package view

import model.Funcionario

class FuncionarioView {
    fun exibirFuncionarios(funcionarios: List<Funcionario>) {
        println("\nLista de Funcionários:")
        funcionarios.forEach { println(it.exibirInfo() + "\n") }
    }

    fun exibirMensagem(mensagem: String) {
        println(mensagem)
    }
}