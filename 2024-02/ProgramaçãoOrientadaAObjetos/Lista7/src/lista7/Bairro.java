package lista7;

/**
 * A class that represents a neighborhood (Bairro) where a property is located.
 * It includes a name and an IPTU coefficient, which is used to calculate property tax.
 */
public class Bairro {
    private String nome;          // Name of the neighborhood
    private double coeficienteIptu;  // IPTU coefficient for tax calculation

    /**
     * Constructs a Bairro object with the specified name and IPTU coefficient.
     *
     * @param nome The name of the neighborhood.
     * @param coeficienteIptu The IPTU coefficient used for tax calculation. Must be positive.
     * @throws IllegalArgumentException if the IPTU coefficient is negative.
     */
    public Bairro(String nome, double coeficienteIptu) {
        this.nome = nome;
        setCoeficienteIptu(coeficienteIptu); // Using setter to apply validation
    }

    /**
     * Gets the name of the neighborhood.
     * 
     * @return The name of the neighborhood.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the name of the neighborhood.
     * 
     * @param nome The new name of the neighborhood.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Gets the IPTU coefficient used for tax calculation.
     * 
     * @return The IPTU coefficient.
     */
    public double getCoeficienteIptu() {
        return coeficienteIptu;
    }

    /**
     * Sets the IPTU coefficient used for tax calculation. The coefficient must be positive.
     * 
     * @param coeficienteIptu The new IPTU coefficient.
     * @throws IllegalArgumentException if the IPTU coefficient is negative.
     */
    public void setCoeficienteIptu(double coeficienteIptu) {
        if (coeficienteIptu < 0) {
            throw new IllegalArgumentException("O coeficiente de IPTU deve ser positivo.");
        }
        this.coeficienteIptu = coeficienteIptu;
    }
}
