public class PowerRanger {
    String nome;

    public PowerRanger(String nome){
        this.nome = nome;
    }
    public void morfar(){
        System.out.println(nome +"...it's morphing time...");
    }
}
    class PowerRangerVerde extends PowerRanger{
        public PowerRangerVerde(String nome){
            super(nome);
        }
        @Override
        public void morfar(){
            System.out.println("\n"+nome+"...says: Dragonzord!\n");
        }
    }
        class PowerRangerPreto extends PowerRanger{
        public PowerRangerPreto(String nome){
            super(nome);
        }
        @Override
        public void morfar(){
            System.out.println("\n"+nome+"...says: Mastodon!\n");
        }
    }
        class PowerRangerRosa extends PowerRanger{
        public PowerRangerRosa(String nome){
            super(nome);
        }
        @Override
        public void morfar(){
            System.out.println("\n"+nome+"...says: Pterodactyl!\n");
        }
    }
    class PowerRangerAzul extends PowerRanger{
        public PowerRangerAzul(String nome){
            super(nome);
        }
        @Override
        public void morfar(){
            System.out.println("\n"+nome+"...says: Triceratops!\n");
        }
    }
        class PowerRangerAmarelo extends PowerRanger{
        public PowerRangerAmarelo(String nome){
            super(nome);
        }
        @Override
        public void morfar(){
            System.out.println("\n"+nome+"...says: Siber tooth Tiger!\n");
        }
    }
        class PowerRangerVermelho extends PowerRanger{
        public PowerRangerVermelho (String nome){
            super(nome);
        }
        @Override
        public void morfar(){
            System.out.println("\n"+nome+"...says: Tyrannosaurus!\n");
        }
    }





