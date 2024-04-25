package leo.primeirasemana;
public class MinhaClasse {

    public static void main(String[] args) {
        String primeiroNome = "leonardo";
        System.out.println(primeiroNome);
        String segundoNome = "rehin";
        System.out.println(segundoNome);
        String nomeCompleto =imprimir(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);


    }
    public static String imprimir (String nome, String nome2){
        return  nome.concat(" ").concat(nome2);

    }
}

