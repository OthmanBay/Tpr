import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        //3.1
//        System.out.println("opdracht 1");
//        int a = (int) (Math.random()*20);
//        int b = (int) (Math.random()*20);
//        System.out.println("hoeveel is"+"\t"+a +"\t+\t" + b);
//        int antwoord = scanner.nextInt();
//        int goed = a + b;
//        if(antwoord == goed){
//            System.out.println("antwoord is goed");
//        }
//        else{
//            System.out.println("het antwoord is fout");
//        }

        //3.2
//        System.out.println("\n");
//        System.out.println("opdracht 2");
//        int a = (int) (Math.random()*9+1);
//        int b = (int) (Math.random()*9+1);
//        int c = (int) (Math.random()*9+1);
//        System.out.println("hoeveel is"+"\t"+a + "\t*\t" + b  + "\t*\t" + c);
//        int abc = a * b * c;
//        int antwoord1 = scanner.nextInt();
//        if(abc == antwoord1){
//            System.out.println("Het antwoord is goed");
//        }
//        else{
//            System.out.println("het antwoord is fout probeer opnieuw");
//        }

//        //3.3
//        System.out.println("\n");
//        System.out.println("opdracht 3");
//        String maanden[];
//        maanden = new String[]{"","Januari","Februari","Maart","April","Mei","Juni","Juli","Augustus","September","Oktober","November","December"};
//        int a = (int) (Math.random()*12+1);
//        System.out.println("je nummer is" + "\t" + a +"\t"+ "en dat is maand"+ "\t" + maanden[a]);

//          //3.4
//        System.out.println("\n");
//        System.out.println("Opdracht 4");
//        String dagen[];
//        dagen= new String[]{"","Maandag","Dinsdag", "Woensdag", "Donderdag","Vrijdag","Zaterdag","Zondag"};
//        System.out.println("Welke weekdag is het nu?");
//        int dag = scanner.nextInt();
//        System.out.println("En van hoeveel dagen in de toekomst wil je de weekdag berekenen?");
//        int hoeveel = scanner.nextInt();
//        int modul = 100 % 7 ;
//        System.out.println("Vandaag is het" +"\t"+ dagen[dag] +"\t en over" + "\t" + hoeveel +"\t dagen is het" + "\t" + dagen[modul]);

            //3.5
        System.out.println("\n");
        System.out.println("Opdracht 5");
        System.out.println("Wat is uw gewicht");
        double gewicht = scanner.nextDouble();
        System.out.println("Wat is uw lengte (m) ?");
        double lengte = scanner.nextDouble();
        double bmi = gewicht / (lengte*lengte);
        System.out.println("Uw Bmi is" +"\t"+bmi);
        if(bmi < 18.5){
            System.out.println("Je hebt ondergewicht");
        }
        else if (bmi <=18.5 && bmi<25){
            System.out.println("je gewicht is normaal ");
        }
        else if (bmi <=25 && bmi<30){
            System.out.println("je hebt overgewicht ");
        }
        else if (bmi <=30){
            System.out.println("Zwaar ovegewicht");
        }
        else{
            System.out.println("je bent of heel erg dun of heel erg dik");
        }


    }



}
