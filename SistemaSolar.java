public class SistemaSolar {
    private String estrela;
    private double distancia;
    private String quadrante;
    
    public double getDistancia(){
        return distancia;
    }
    public String getEstrela(){
        return estrela;
    }
    public String getQuadrante(){
        return quadrante;
    }
    public SistemaSolar(String estrela, double distancia, String quadrante){
        this.estrela = estrela;
        this.distancia = distancia;
        this.quadrante = quadrante;
    }

    public static class Planeta{
        private int orbita;
        public Planeta(int orbita){
            this.orbita = orbita;
        }
        public int getOrbita() {
            return orbita;
        }
    }
    
}
