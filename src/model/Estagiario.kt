package model

class Estagiario(
    nome: String,
    salario: Double,
    val tempoEstagio: Int // Tempo de estágio em meses
) : Funcionario(nome, "Estagiário", salario) {

    override fun exibirInfo(): String {
        return """
            ${super.exibirInfo()}
            Tempo de Estágio: $tempoEstagio meses
        """.trimIndent()
    }
}