public class Promocao {
    boolean qualificacao = false;
    public boolean promocao(Empregado e){
        if(e.getTempoDeCasa() >5){
            qualificacao = true;
        }
    return qualificacao;
    }
}