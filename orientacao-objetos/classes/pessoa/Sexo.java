public enum Sexo {

    MASCULINO('M'), FEMININO('F');

    private Character sexo;

    private Sexo(Character sexo) {
        this.sexo = sexo;
    }

    public Character getSexo() {
        return this.sexo;
    }

}