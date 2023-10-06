
public class Promocao {
    public Empregado promocao(Empregado... e){
       Empregado promovido = e[0];

       for( int i = 1; i < e.length; i++){
        if(e[i].getTempoDeCasa() > promovido.getTempoDeCasa()){
            promovido = e[i];
        }
       }
       return promovido;
    }
}
