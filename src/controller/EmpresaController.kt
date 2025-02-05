package controller

import model.Funcionario

class EmpresaController {
    private val funcionarios = mutableListOf<Funcionario>()

    fun adicionarFuncionario(funcionario: Funcionario) {
        funcionarios.add(funcionario)
    }

    fun listarFuncionarios(): List<Funcionario> {
        return funcionarios
    }

    fun aumentarSalarioFuncionario(index: Int, percentual: Double) {
        if (index in funcionarios.indices) {
            funcionarios[index].aumentarSalario(percentual)
        }
    }
}