package leo.primeirasemana;

public class MinhaTv {
    
    boolean ligada = false;
    int volume = 20;
    int canal = 1;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarVolume(){
        volume++;
    }
    public void dimiuirVolume(){
        volume--;
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Mudando Canal para: " + canal);
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Mudando Canal para: "+ canal);
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Mudando canal para: " + canal);
    }

}
