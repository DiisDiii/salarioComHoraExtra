package sistemadehoras;

public class classfilho extends classepai {
    String nome;
    int idade;
    String[] função = { "Guardar peças", "Fazer pedidos", "Organizar estoque" };

    double valorPorHoraExtra = 25.0; // Valor da hora extra base
    double descontos = 144 + 215; // Exemplo de descontos fixos

    // Método para calcular o valor das horas extras com base nas faixas de
    // porcentagem
    public double valorPorHoraExtra(int horasExtras) {
        double valorTotalHorasExtras = 0.0;

        if (horasExtras > 0 && horasExtras <= 25) {
            valorTotalHorasExtras = horasExtras * (valorPorHoraExtra * 1.50); // 50% adicional
        } else if (horasExtras > 25 && horasExtras <= 40) {
            valorTotalHorasExtras = horasExtras * (valorPorHoraExtra * 1.60); // 60% adicional
        } else if (horasExtras > 40 && horasExtras <= 60) {
            valorTotalHorasExtras = horasExtras * (valorPorHoraExtra * 1.70); // 70% adicional
        } else if (horasExtras > 60 && horasExtras <= 80) {
            valorTotalHorasExtras = horasExtras * (valorPorHoraExtra * 1.80); // 80% adicional
        } else if (horasExtras > 80 && horasExtras <= 110) {
            valorTotalHorasExtras = horasExtras * (valorPorHoraExtra * 2.00); // 100% adicional
        }

        return valorTotalHorasExtras;
    }

    // Método para calcular o salário líquido (descontando os valores fixos)
    public double calcularSalarioLiquido(double salarioBruto) {
        return salarioBruto - descontos; // Desconta os valores fixos
    }

    // Método para calcular o salário líquido com horas extras
    public double horaExtraSalario(double salarioBruto, int horasExtras) {
        double valorTotalHorasExtras = valorPorHoraExtra(horasExtras); // Calcula as horas extras
        double salarioComHorasExtras = salarioBruto + valorTotalHorasExtras; // Soma ao salário bruto
        return calcularSalarioLiquido(salarioComHorasExtras); // Calcula o salário líquido final
    }
}
