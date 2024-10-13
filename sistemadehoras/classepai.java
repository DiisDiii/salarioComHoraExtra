package sistemadehoras;

public class classepai {

    double salarioBruto;
    double valorPorHoraExtra = 25;
    double horasextras = valorPorHoraExtra + 1;

    double descontos = 144 + 215;
    double salarioLiquido = salarioBruto - descontos;

    // ----------------------------------------------------------------
    Double valorPorHoraExtra(double horasextras) {
        horasextras = horasextras + valorPorHoraExtra;
        return horasextras;

    }

    // ----------------------------------------------------------------
    double calcularSalarioLiquido(double salarioBruto) {
        double salarioLiquido = salarioBruto - descontos;
        return salarioLiquido;
    }

    void horaExtraSalario(double horasextras) {
        System.out.println("Total desse mês com salário e hora extra foi : " + salarioLiquido + horasextras);
    }
}
