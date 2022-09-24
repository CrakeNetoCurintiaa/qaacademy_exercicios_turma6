package Exemplos;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.sql.SQLOutput;

public class MetodosComRetornoMain {
    public static void main(String[] args) {
        System.out.println(cidade1());
        System.out.println(cidade2());
        System.out.println(cidade3());
        System.out.println(cidade4());
        System.out.println(cidade5());
    }
        public static String cidade1() {
            return "Itapevi";
        }
        public static String cidade2() {
            return "Jandira";
        }
        public static String cidade3() {
            return "Barueri";
        }
        public static String cidade4() {
            return "Cotia";
        }
        public static String cidade5() {
            return "Caracas";
        }
    }
