import java.util.Scanner;
import java.util.Random;


public class RetoCCCF {
    public static void main(String[] args) {

        int minutosDia=12*60;
        int  personas=0;
        int  numeroPaquetes=0;
        int cola=0;
        int paquetesCaja1=0;
        int paquetesCaja2=0;
        int paquetesCaja3=0;
        int paquetesCaja4=0;
        int paquetesCaja5=0;
        double probabilidadPersona;

        for (int i=1; i <= minutosDia; i++) {
            probabilidadPersona = Math.random();
            numeroPaquetes = 0;
            if ( probabilidadPersona <= 0.4) {
                personas = 1;
            }
            else {
                personas = 0;
            }
            if (personas == 1) {
                numeroPaquetes = (int)(Math.random() * 11 + 5);
                cola++;
            }
            else if (cola != 0) {
                numeroPaquetes = (int)(Math.random() * 11 + 5);
            }

            if (paquetesCaja1 != 0){
                paquetesCaja1--;
            }
            if (paquetesCaja2 != 0){
                paquetesCaja2--;
            }
            if (paquetesCaja3 != 0){
                paquetesCaja3--;
            }
            if (paquetesCaja4 != 0){
                paquetesCaja4--;
            }
            if (paquetesCaja5 != 0){
                paquetesCaja5--;
            }