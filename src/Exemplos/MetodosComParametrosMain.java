package Exemplos;

public class MetodosComParametrosMain {
    public static void main(String[] args) {
        texto("aluno", "um");
        texto("colega", "dois");
        texto("parceiro", "tres");
        texto("camarada", "quatro");
        texto("brother", "cinco");

        System.out.println(texto1("Adriano ", "Oliveira"));
        System.out.println(texto2("Rainha ", "Morreuuuuu"));
        System.out.println(texto3("Fulano ", "Silva"));
        System.out.println(texto4("Vai ", "Curintia"));
        System.out.println(texto5("Hoje é ", "Sabado"));
    }

    public static void texto(String a, String b) {
        System.out.println("o texto é" + " " + a + " " + b);
    }

    public static String texto1(String a, String b) {
        return (a+b);
    }
    public static String texto2(String c, String d) {
        return (c+d);
    }
    public static String texto3(String e, String f) {
        return (e+f);
    }
    public static String texto4(String g, String h) {
        return (g+h);
    }
    public static String texto5(String i, String j) {
        return (i+j);
    }

}