package lista7;

/**
 * Enum representing the different purposes (Finalidade) a property (Imóvel) can have.
 * The purposes are:
 * <ul>
 *     <li>RESIDENCIAL: For residential properties</li>
 *     <li>COMERCIAL: For commercial properties</li>
 *     <li>INDUSTRIAL: For industrial properties</li>
 * </ul>
 * Each purpose affects the IPTU tax calculation differently.
 */
public enum Finalidade {
    RESIDENCIAL,  // Property used for residential purposes
    COMERCIAL,    // Property used for commercial purposes
    INDUSTRIAL;   // Property used for industrial purposes
}
