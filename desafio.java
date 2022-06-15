public class desafio {
    public static void main(String[] args) {
        System.out.println("Questão 2");
        System.out.println("-------------------------------------");
        int n1 = 0, n2 = 1, n3 = 0, i;
        i = 2584; // Definir aqui o numero
        while (i > n3) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        if (i == n3) {
            System.out.println("o numero " + i + " pertence a sequencia");
        } else {
            System.out.println("o numero " + i + " nao pertence a sequencia");
        }

        System.out.println("");
        System.out.println("Questão 5");
        System.out.println("-------------------------------------");
        String paraInverter = "desafio"; // string a ser invertida
        String invertida = "";
        for (int aux = paraInverter.length() - 1; aux >= 0; aux--) {
            invertida = invertida + paraInverter.charAt(aux);
        }
        System.out.println(invertida);
    }

}