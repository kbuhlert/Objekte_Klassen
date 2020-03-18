public class Tamagochi {
    int x = 0;
    int y = 0;
    int futterstand = 0;

    public void move (String richtung, int schrittzahl){
        if (richtung.equals("links") && futterstand>=schrittzahl){
            x = x-schrittzahl;
            futterstand = futterstand-schrittzahl;
            if (futterstand>0){System.out.println("Meine Position ist: x= " + x + " , y= " + y + " , Futterstand = " + futterstand);
                System.out.println("Ich kann noch " + futterstand + " Schritte gehen.");}
            else{System.out.println("Meine Position ist: x= " + x + " , y= " + y);
                System.out.println("Ich habe kein Futter mehr und muss zuerst gefüttert werden. Bitte fuettern() aufrufen.");}
        }
        else if (richtung.equals("rechts") && futterstand>=schrittzahl){
            x = x+schrittzahl;
            futterstand = futterstand-schrittzahl;
            if (futterstand>0){System.out.println("Meine Position ist: x= " + x + " , y= " + y + " , Futterstand = " + futterstand);
                System.out.println("Ich kann noch " + futterstand + " Schritte gehen.");}
            else{System.out.println("Meine Position ist: x= " + x + " , y= " + y);
                System.out.println("Ich habe kein Futter mehr und muss zuerst gefüttert werden. Bitte fuettern() aufrufen.");}
        }
        else if (richtung.equals("hoch") && futterstand>=schrittzahl){
            y = y+schrittzahl;
            futterstand = futterstand-schrittzahl;
            if (futterstand>0){System.out.println("Meine Position ist: x= " + x + " , y= " + y + " , Futterstand = " + futterstand);
                System.out.println("Ich kann noch " + futterstand + " Schritte gehen.");}
            else{System.out.println("Meine Position ist: x= " + x + " , y= " + y);
                System.out.println("Ich habe kein Futter mehr und muss zuerst gefüttert werden. Bitte fuettern() aufrufen.");}
        }
        else if (richtung.equals("runter") && futterstand>=schrittzahl){
            y = y-schrittzahl;
            futterstand = futterstand-schrittzahl;
            if (futterstand>0){System.out.println("Meine Position ist: x= " + x + " , y= " + y + " , Futterstand = " + futterstand);
                System.out.println("Ich kann noch " + futterstand + " Schritte gehen.");}
            else{System.out.println("Meine Position ist: x= " + x + " , y= " + y);
                System.out.println("Ich habe kein Futter mehr und muss zuerst gefüttert werden. Bitte fuettern() aufrufen.");}
        } else {
            System.out.println("Mein Futterstand ist zu niederig. Ich muss zuerst gefüttert werden. Bitte fuettern() aufrufen.");}
    }

    public void fuettern (int futter){
        futterstand = futterstand+futter;
        System.out.println("MMMM lecker, mein futterstand ist jetzt " + futterstand);
    }
}
