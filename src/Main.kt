import controller.EmpresaController
import model.Gerente
import model.Desenvolvedor
import model.Estagiario
import view.FuncionarioView

fun main() {
    val empresaController = EmpresaController()
    val funcionarioView = FuncionarioView()

    // Adiciona funcionários
    empresaController.adicionarFuncionario(Gerente("João Silva", 10000.0, 2000.0))
    empresaController.adicionarFuncionario(Desenvolvedor("Maria Oliveira", 7000.0, "Kotlin"))
    empresaController.adicionarFuncionario(Estagiario("Carlos Souza", 1500.0, 6))

    // Lista funcionários
    funcionarioView.exibirFuncionarios(empresaController.listarFuncionarios())

    // Aumenta o salário de um funcionário
    empresaController.aumentarSalarioFuncionario(1, 10.0) // Aumenta o salário do segundo funcionário (Maria)
    funcionarioView.exibirMensagem("Salário de Maria aumentado em 10%.")

    // Lista novamente para ver o aumento
    funcionarioView.exibirFuncionarios(empresaController.listarFuncionarios())
}