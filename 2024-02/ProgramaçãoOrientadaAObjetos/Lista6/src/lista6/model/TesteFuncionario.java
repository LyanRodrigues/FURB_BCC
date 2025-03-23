package lista6.model;

public class TesteFuncionario {

    public static void main(String[] args) {
        // Testar Faixa IRPF
        Funcionario func1 = new Funcionario("João", 850.00);
        if (func1.identificarFaixaIrpf() == FaixaIrpf.PRIMEIRA) {
            System.out.println("Teste 1 (Faixa IRPF - PRIMEIRA): Passou");
        } else {
            System.out.println("Teste 1 (Faixa IRPF - PRIMEIRA): Falhou");
        }

        Funcionario func2 = new Funcionario("Maria", 3000.00);
        if (func2.identificarFaixaIrpf() == FaixaIrpf.TERCEIRA) {
            System.out.println("Teste 2 (Faixa IRPF - TERCEIRA): Passou");
        } else {
            System.out.println("Teste 2 (Faixa IRPF - TERCEIRA): Falhou");
        }

        // Testar Cálculo IRPF
        Funcionario func3 = new Funcionario("João", 3000.00);
        double impostoEsperado1 = 95.20;
        if (Math.abs(func3.calcularIrpf() - impostoEsperado1) < 0.01) {
            System.out.println("Teste 3 (Cálculo IRPF - 3000.00): Passou");
        } else {
            System.out.println("Teste 3 (Cálculo IRPF - 3000.00): Falhou");
        }

        Funcionario func4 = new Funcionario("Maria", 5000.00);
        double impostoEsperado2 = 505.64;
        if (Math.abs(func4.calcularIrpf() - impostoEsperado2) < 0.01) {
            System.out.println("Teste 4 (Cálculo IRPF - 5000.00): Passou");
        } else {
            System.out.println("Teste 4 (Cálculo IRPF - 5000.00): Falhou");
        }
        
    }
}
