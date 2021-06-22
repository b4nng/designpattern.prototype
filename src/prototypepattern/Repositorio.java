package prototypepattern;

public class Repositorio implements Cloneable{
    private String nomeRepositorio;
    private String nomeUsuario;
    private String dataDDMMAAAA;
    private String[] tags;

    public Repositorio(String nomeRepositorio, String nomeUsuario, String dataDDMMAAAA, String[] tags) {
        this.nomeRepositorio = nomeRepositorio;
        this.nomeUsuario = nomeUsuario;
        this.dataDDMMAAAA = dataDDMMAAAA;
        this.tags = tags;
    }

    public String getNomeRepositorio() {
        return nomeRepositorio;
    }

    public void setNomeRepositorio(String nomeRepositorio) {
        this.nomeRepositorio = nomeRepositorio;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getDataDDMMAAAA() {
        return dataDDMMAAAA;
    }

    public void setDataDDMMAAAA(String dataDDMMAAAA) {
        this.dataDDMMAAAA = dataDDMMAAAA;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    @Override
    public Repositorio clone() throws CloneNotSupportedException{
        return (Repositorio) super.clone();
    }
}
