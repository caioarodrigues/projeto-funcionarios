package model

class Gerente(
    nome: String,
    salario: Double,
    val bonus: Double
) : Funcionario(nome, "Gerente", salario) {

    override fun exibirInfo(): String {
        return """
            ${super.exibirInfo()}
            Bônus: R$ $bonus
            Salário Total (com bônus): R$ ${salario + bonus}
        """.trimIndent()
    }
}