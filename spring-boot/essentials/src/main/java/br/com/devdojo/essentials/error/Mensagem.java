package br.com.devdojo.essentials.error;

public enum Mensagem{

    STUDENT_NOT_FOUND_FOR_ID("Student not found for ID:");
    private String mensagem;
    private Mensagem(String mensagem){
        this.mensagem = mensagem;
    }

    public String getMensagem(){
        return mensagem;
    }
    @Override
    public String toString(){
        return this.mensagem;
    }
}
