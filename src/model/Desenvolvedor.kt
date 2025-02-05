package model

class Desenvolvedor(
    nome: String,
    salario: Double,
    val linguagem: String
) : Funcionario(nome, "Desenvolvedor", salario) {

    override fun exibirInfo(): String {
        return """
            ${super.exibirInfo()}
            Linguagem de Programação: $linguagem
        """.trimIndent()
    }
}