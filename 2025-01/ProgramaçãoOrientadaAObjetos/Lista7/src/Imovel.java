import javax.swing.JOptionPane;

public class Imovel {
    private String endereco;
    private int area;
    private Bairro bairro;
    private Finalidade finalidade;

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getArea() {
        return area;
    }
    public void setArea(int area) {
        if (area > 0){
            this.area = area;
        }
        JOptionPane.showMessageDialog(null, "Erro", "Deve ser maior que zero", JOptionPane.ERROR_MESSAGE);
    }
    public Bairro getBairro() {
        return bairro;
    }
    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Finalidade getFinalidade() {
        return finalidade;
    }
    public void setFinalidade(Finalidade finalidade) {
        this.finalidade = finalidade;
    }

    public double calcularIptu(){
        if (bairro.getNome().isEmpty()){
            JOptionPane.showMessageDialog(null, "Um bairro deve ser definido", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        if (bairro.getCoeficienteIptu() < 0){
            JOptionPane.showMessageDialog(null, "Coeficiente não pode ser negativo", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        if (finalidade == null){
            JOptionPane.showMessageDialog(null, "Defina uma finalidade", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        double Iptu = 0;
        if (finalidade.equals(Finalidade.RESIDENCIAL)){
            Iptu = area;
        }
        if (finalidade.equals(Finalidade.COMERCIAL)){
            if(area <= 100){
                Iptu = 500;
            }
            if (area > 100 && area <= 400){
                Iptu = 1000;
            }
            if (area > 400){
                Iptu = area * 2.55;
            }
        }
        if (finalidade.equals(Finalidade.INDUSTRIAL)){
            if (area <= 2000){
                Iptu = 1000;
            }
            else {
                Iptu = area * 0.55;
            }
        }
        return Iptu * bairro.getCoeficienteIptu();
    }
    
}
