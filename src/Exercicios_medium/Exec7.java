package Exercicios_medium;

public class Exec7 {
    public static void main(String[] args) {
        String[] Mês;
        Mês = new String[12];

        Mês[0] = "Jan";
        Mês[1] = "Fev";
        Mês[2] = "Mar";
        Mês[3] = "Abr";
        Mês[4] = "Mai";
        Mês[5] = "Jun";
        Mês[6] = "Jul";
        Mês[7] = "Ago";
        Mês[8] = "Set";
        Mês[9] = "Out";
        Mês[10] = "Nov";
        Mês[11] = "Dez";
        int i =0;
        while (i<12){
            System.out.println(Mês[i]);
            i++;
        }
    }

    }