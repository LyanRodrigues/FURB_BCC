package lista7;

/**
 * A class that represents a property (Imóvel) with an address, area, neighborhood (Bairro),
 * and purpose (Finalidade). It also includes a method to calculate the IPTU tax.
 */
public class Imovel {
    private String endereco;   // Address of the property
    private int area;          // Area of the property in square meters
    private Bairro bairro;     // The neighborhood where the property is located
    private Finalidade finalidade; // The purpose of the property (Residential, Commercial, Industrial)

    /**
     * Constructs an Imovel object with the specified address, area, neighborhood, and purpose.
     * 
     * @param endereco The address of the property.
     * @param area The area of the property in square meters.
     * @param bairro The neighborhood where the property is located.
     * @param finalidade The purpose of the property (e.g., Residential, Commercial, Industrial).
     */
    public Imovel(String endereco, int area, Bairro bairro, Finalidade finalidade) {
        this.endereco = endereco;
        this.area = area;
        this.bairro = bairro;
        this.finalidade = finalidade;
    }

    /**
     * Gets the address of the property.
     * 
     * @return The address of the property.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Sets the address of the property.
     * 
     * @param endereco The new address of the property.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Gets the area of the property in square meters.
     * 
     * @return The area of the property.
     */
    public int getArea() {
        return area;
    }

    /**
     * Sets the area of the property in square meters.
     * 
     * @param area The new area of the property.
     */
    public void setArea(int area) {
        this.area = area;
    }

    /**
     * Gets the neighborhood where the property is located.
     * 
     * @return The neighborhood of the property.
     */
    public Bairro getBairro() {
        return bairro;
    }

    /**
     * Sets the neighborhood of the property.
     * 
     * @param bairro The new neighborhood of the property.
     */
    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    /**
     * Gets the purpose (finalidade) of the property (e.g., Residential, Commercial, Industrial).
     * 
     * @return The purpose of the property.
     */
    public Finalidade getFinalidade() {
        return finalidade;
    }

    /**
     * Sets the purpose of the property (e.g., Residential, Commercial, Industrial).
     * 
     * @param finalidade The new purpose of the property.
     */
    public void setFinalidade(Finalidade finalidade) {
        this.finalidade = finalidade;
    }

    /**
     * Calculates the IPTU tax based on the area, purpose (finalidade), and neighborhood of the property.
     * 
     * The calculation varies depending on the property type:
     * - Residential: Area * 1
     * - Commercial: 
     *   - Area ≤ 100: 500
     *   - 100 < Area < 400: 1000
     *   - Area ≥ 400: Area * 2.55
     * - Industrial: 
     *   - Area ≤ 2000: 1000
     *   - Area > 2000: Area * 0.55
     * 
     * @return The calculated IPTU value based on the property type and area.
     * @throws IllegalArgumentException if either the purpose (finalidade) or neighborhood (bairro) is not set.
     */
    public double calcularIptu() {
    if (finalidade == null || bairro == null) {
        throw new IllegalArgumentException("Finalidade e Bairro devem estar definidos");
    }

    double totalIptu = 0;

    switch (finalidade) {
        case RESIDENCIAL -> // R$ 1,00 por m² para imóveis residenciais
            totalIptu = area * 1;
            
        case COMERCIAL -> {
            // Regras de cálculo para imóveis comerciais
            if (area <= 100) {
                totalIptu = 500; // Valor fixo para imóveis de até 100 m²
            } else if (area > 100 && area <= 400) {
                totalIptu = 1000; // Valor fixo para imóveis entre 101 m² e 400 m²
            } else if (area > 400) {
                totalIptu = area * 2.55; // R$ 2,55 por m² para imóveis acima de 400 m²
            }
            }
            
        case INDUSTRIAL -> {
            // Regras de cálculo para imóveis industriais
            if (area <= 2000) {
                totalIptu = 1000; // Valor fixo para imóveis de até 2.000 m²
            } else {
                totalIptu = area * 0.55; // R$ 0,55 por m² para imóveis acima de 2.000 m²
            }
            }
    }

    // Multiplicando pelo coeficiente do bairro
    return totalIptu * bairro.getCoeficienteIptu();
}

}
