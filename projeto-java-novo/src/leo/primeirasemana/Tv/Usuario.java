package leo.primeirasemana.Tv;

public class Usuario {

    public static void main(String[] args) {
        MinhaTv minhaTv = new MinhaTv();

        System.out.println("Ligada?: " + minhaTv.ligada);
        System.out.println("Volume: " + minhaTv.volume);
        System.out.println("Canal: "+ minhaTv.canal);

        minhaTv.ligar();

        System.out.println("Novo: Ligada?: " + minhaTv.ligada);

        minhaTv.desligar();

        System.out.println("Novo: Ligada?: " + minhaTv.ligada);

        minhaTv.aumentarVolume();
        minhaTv.aumentarVolume();
        minhaTv.aumentarVolume();

        System.out.println("Novo Volume:" + minhaTv.volume);


        minhaTv.mudarCanal(30);
        minhaTv.aumentarCanal();
        minhaTv.aumentarCanal();
        minhaTv.diminuirCanal();
    }
}

