import java.util.*;

 class Students {

    public static void main(String[] args) {
        HashSet names = new HashSet();
        names.add("Raghavendra");
        names.add("Kamal");
        names.add("Don");
        names.add("mani");
        names.add("sri");
        names.add("Hemanth");
        names.add("Elon");
        names.add("Manas");
        names.add("Alekhya");
        names.add("teddy");

        System.out.println("before adding");

        System.out.println(names);

        System.out.println("after adding");

        System.out.println(names.add("Sbk"));

        System.out.println(names);




    }

}