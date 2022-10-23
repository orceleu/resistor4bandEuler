import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("choisissez une grandeur de convertion: 1-> Ohms 2->KOhms 3-> MegaOhms");
        Scanner sc = new Scanner(System.in);
        int select = sc.nextInt();

        switch (select) {
            case 1 -> {
                System.out.println("conversion en ohms (case 1)");
                func(1);
            }
            case 2 -> {
                System.out.println(" conversion en kiloOhms (case 2)");
                func(1000);
            }
            case 3 -> {
                System.out.println("conversion en MegaOhms (case 3)");
                func(1000000);
            }
        }

    }
    public static void func(int s)	{
        //input{{
        Scanner scanner=new Scanner(System.in);
        double y = scanner.nextDouble();
        double x=s*y;

        if(x<10) {

            //pour les valeurs improbable
            if(x!=2.2&&x!=3.3&&x!=1&&x!=0.47&&x!=4.7&&x!=2.5) { System.out.println("valeur improbable!!");}else {

                if(x==0.47)System.out.println("jaune violet argent");
                if(x==1)System.out.println("marron noir noir ");
                if(x==2.2)System.out.println("rouge rouge or or");
                if(x==2.5)System.out.println("rouge vert or");
                if(x==3.3)System.out.println("orange orange noir");
                if(x==4.7)System.out.println("jaune violet noir");
                if(x==0.33)System.out.println("orange orange argent");}


        }else {

            int a=(int)Math.round(x);

            Integer num1 = a;
            Integer[] digitss = getDigits(num1.toString());
            if(a<10) {

                int b1=digitss[0];
                switch (b1) {
                    case 1:
                        System.out.println("marron");break;
                    case 2:
                        System.out.println("rouge");break;
                    case 3:
                        System.out.println("orange");break;
                    case 4:
                        System.out.println("jaune");break;
                    case 5:
                        System.out.println("vert");break;
                    case 6:
                        System.out.println("bleu");break;
                    case 7:
                        System.out.println("violet");break;
                    case 8:
                        System.out.println("gris");break;
                    case 9:
                        System.out.println("blanc");break;}
                System.out.println("noir");

            }else  {


                if(a>10&&a<100) {
                    int nbre04=digitss[0];

                    switch (nbre04) {
                        case 1:
                            System.out.println("marron");break;
                        case 2:
                            System.out.println("rouge");break;
                        case 3:
                            System.out.println("orange");break;
                        case 4:
                            System.out.println("jaune");break;
                        case 5:
                            System.out.println("vert");break;
                        case 6:
                            System.out.println("bleu");break;
                        case 7:
                            System.out.println("violet");break;
                        case 8:
                            System.out.println("gris");break;
                        case 9:
                            System.out.println("blanc");break;}
                    // 2eme bande
                    int nbre1=digitss[1];
                    switch (nbre1) {
                        case 1:
                            System.out.println("marron");break;
                        case 2:
                            System.out.println("rouge");break;
                        case 3:
                            System.out.println("orange");break;
                        case 4:
                            System.out.println("jaune");break;
                        case 5:
                            System.out.println("vert");break;
                        case 6:
                            System.out.println("bleu");break;
                        case 7:
                            System.out.println("violet");break;
                        case 8:
                            System.out.println("gris");break;
                        case 9:
                            System.out.println("blanc");break;
                        case 0:
                            System.out.println("noir");break;	}    System.out.println("noir");

                }
                if(a>99) {
                    Integer num = a;
                    Integer[] digits = getDigits(num.toString());
                    System.out.println(Arrays.toString(digits));

                    //1er bande
                    int nbre=digits[0];

                    switch (nbre) {
                        case 1:
                            System.out.println("marron");break;
                        case 2:
                            System.out.println("rouge");break;
                        case 3:
                            System.out.println("orange");break;
                        case 4:
                            System.out.println("jaune");break;
                        case 5:
                            System.out.println("vert");break;
                        case 6:
                            System.out.println("bleu");break;
                        case 7:
                            System.out.println("violet");break;
                        case 8:
                            System.out.println("gris");break;
                        case 9:
                            System.out.println("blanc");break;}
                    // 2eme bande
                    int nbre11=digits[1];
                    switch (nbre11) {
                        case 1:
                            System.out.println("marron");break;
                        case 2:
                            System.out.println("rouge");break;
                        case 3:
                            System.out.println("orange");break;
                        case 4:
                            System.out.println("jaune");break;
                        case 5:
                            System.out.println("vert");break;
                        case 6:
                            System.out.println("bleu");break;
                        case 7:
                            System.out.println("violet");break;
                        case 8:
                            System.out.println("gris");break;
                        case 9:
                            System.out.println("blanc");break;
                        case 0:
                            System.out.println("noir");break;



                    }



                    //bande multiplicatrice
                    if(num<1000) {System.out.println("marron,");}
                    else if (num<10000) {System.out.println("rouge");}
                    else if(num<100000) {System.out.println("orange");}
                    else if(num<1000000) {System.out.println("jaune");}
                    else if(num<10000000) {System.out.println("vert");}
                    else if(num<100000000) {System.out.println("bleu");} System.out.println("or");
                }
            }} }





    //fonction pou separe chaque chiffre
    public static Integer[] getDigits(String number) {
        List<Integer> digits = new ArrayList<>();
        for(int i = 0; i < number.length(); i++) {
            int j = Character.digit(number.charAt(i), 10);
            digits.add(j);
        }
        return digits.toArray(new Integer[]{});



    }
}