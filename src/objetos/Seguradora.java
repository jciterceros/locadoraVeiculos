package objetos;

public class Seguradora {

    private int id;
    private String nome;
    private String cnpj;
    private String email;
    private Double valor;
    private int id_municipio;
    private int id_estado;

    public Seguradora(int id) {
        this.id = id;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        try {
            // 15.607.791/0001-90
            cnpj = cnpj.replaceAll("[./-]", "").trim();        

            if (cnpj.length() == 14 && cnpj.matches("[0-9]+")) {
                this.cnpj = cnpj;
                System.out.println("CNPJ: " 
                        + cnpj
                        +" Tamanho: "
                        +cnpj.length());
            } else {
                System.out.println("CNPJ INVALIDO");
            }   
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            throw new RuntimeException("Erro não tratado");
        }
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the valor
     */
    public Double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }

    /**
     * @return the id_municipio
     */
    public int getId_municipio() {
        return id_municipio;
    }

    /**
     * @param id_municipio the id_municipio to set
     */
    public void setId_municipio(int id_municipio) {
        this.id_municipio = id_municipio;
    }

    /**
     * @return the id_estado
     */
    public int getId_estado() {
        return id_estado;
    }

    /**
     * @param id_estado the id_estado to set
     */
    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }

}
