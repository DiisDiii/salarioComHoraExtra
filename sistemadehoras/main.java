package sistemadehoras;

public class main {
    public static void main(String[] args) {
        classfilho funcionario1 = new classfilho();
        funcionario1.nome = "Diego";
        funcionario1.idade = 23;

        // Exibindo informações do funcionário
        System.out.println("Nome: " + funcionario1.nome + ", idade: " + funcionario1.idade);

        // Exibindo o salário líquido sem horas extras
        System.out.println("Salário líquido sem horas extras: " + funcionario1.calcularSalarioLiquido(2368));

        // Exemplo: Funcionário fez 35 horas extras
        int horasExtras = 35;
        System.out.println("Horas extras trabalhadas: " + horasExtras);

        // Calculando o salário líquido com horas extras
        double salarioComHorasExtras = funcionario1.horaExtraSalario(2368, 80);
        System.out.println("Salário líquido com horas extras: " + salarioComHorasExtras);
    }
}
