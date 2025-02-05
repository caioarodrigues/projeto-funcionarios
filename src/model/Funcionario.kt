package model

open class Funcionario(
    val nome: String,
    val cargo: String,
    var salario: Double
) {
    open fun exibirInfo(): String {
        return """
            Nome: $nome
            Cargo: $cargo
            Salário: R$ $salario
        """.trimIndent()
    }

    fun aumentarSalario(percentual: Double) {
        salario += salario * (percentual / 100)
    }
}