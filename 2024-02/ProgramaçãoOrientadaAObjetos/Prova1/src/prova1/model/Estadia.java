package prova1.model;

import static prova1.model.Periodo.ALTA_TEMPORADA;
import static prova1.model.Periodo.BAIXA_TEMPORADA;

/**
 * Representa uma estadia em um período específico com uma quantidade de diárias.
 * A classe lida com a definição do período da estadia, o número de diárias e o cálculo do preço a pagar.
 */
public class Estadia {

    private Periodo periodo;
    private int quantidadeDias;

    /**
     * Construtor da classe Estadia.
     * @param periodo O período da estadia (alta temporada ou baixa temporada).
     * @param quantidadeDias A quantidade de diárias para a estadia.
     */
    public Estadia(Periodo periodo, int quantidadeDias) {
        this.periodo = periodo;
        this.quantidadeDias = quantidadeDias;
    }

    /**
     * Construtor padrão da classe Estadia.
     * Lança uma exceção pois este construtor não é suportado.
     */
    public Estadia() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Obtém o período da estadia.
     * @return O período da estadia.
     */
    public Periodo getPeriodo() {
        return periodo;
    }

    /**
     * Define o período da estadia.
     * @param periodo O período a ser definido.
     * @throws Exception Se o período for nulo.
     */
    public void setPeriodo(Periodo periodo) throws Exception {
        if (periodo != null) {
            this.periodo = periodo;
        } else {
            throw new Exception("Período não pode ser vazio");
        }
    }

    /**
     * Obtém a quantidade de diárias.
     * @return A quantidade de diárias.
     */
    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    /**
     * Define a quantidade de diárias para a estadia.
     * @param quantidadeDias A quantidade de diárias a ser definida.
     * @throws Exception Se a quantidade de diárias for inválida.
     */
    public void setQuantidadeDias(int quantidadeDias) throws Exception {
        if (quantidadeDias > 0) {
            if (getPeriodo().equals(ALTA_TEMPORADA)) {
                if (quantidadeDias >= 5) {
                    this.quantidadeDias = quantidadeDias;
                } else {
                    throw new Exception("A quantidade mínima de diárias durante a alta temporada é 5");
                }
            } else {
                this.quantidadeDias = quantidadeDias;
            }
        } else {
            throw new Exception("Insira um número de diárias válido");
        }
    }

    /**
     * Calcula o preço a ser pago pela estadia com base no período e na quantidade de diárias.
     * O preço é ajustado conforme a alta ou baixa temporada e a quantidade de diárias.
     * @return O valor total a ser pago pela estadia.
     */
    public float precoPagar() {
        double diaria = 150;

        if (getPeriodo().equals(BAIXA_TEMPORADA)) {
            diaria = diaria - (diaria * 0.3); // Desconto de 30% na baixa temporada
        }

        if (getPeriodo().equals(ALTA_TEMPORADA)) {
            diaria = diaria + (diaria * 0.2); // Acréscimo de 20% na alta temporada
            if (getQuantidadeDias() > 7) {
                diaria = diaria - (diaria * 0.02); // Desconto de 2% se mais de 7 diárias na alta temporada
            }
        }

        if (getQuantidadeDias() == 1) {
            diaria = diaria + (diaria * 0.05); // Acréscimo de 5% para apenas uma diária
        }

        return (float) diaria;
    }

    /**
     * Método não suportado.
     * @param b Um valor booleano.
     * @throws UnsupportedOperationException Sempre que chamado.
     */
    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
