package pl.sda.gdajava25;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<OfertaSprzedaży> ofertaSprzedażyList = new ArrayList<>();
        System.out.println("Welcome :)");
        // Collections.sort(ofertaSprzedażyList, (o1, o2) -> Double.compare(o1.getCena(), o2.getCena()));
        String komenda;
        do {
            wyswieltLinieKomend();
            komenda = scanner.nextLine();
            if (komenda.equalsIgnoreCase("Add")) {
                OfertaSprzedaży ofertaSprzedaży = new OfertaSprzedaży();
                System.out.println("Set name of product:");
                ofertaSprzedaży.setNazwaProduktu(scanner.nextLine());
                System.out.println("Set price of product");
                ofertaSprzedaży.setCena(Double.parseDouble(scanner.nextLine()));
                ofertaSprzedażyList.add(ofertaSprzedaży);
            } else if (komenda.equalsIgnoreCase("List")) {
                ofertaSprzedażyList.forEach(System.out::println);
            } else if (komenda.equalsIgnoreCase("Sort up")) {
                 Collections.sort(ofertaSprzedażyList, (o1, o2) -> Double.compare(o2.getCena(), o1.getCena()));
            } else if (komenda.equalsIgnoreCase("Sort down")) {
                 Collections.sort(ofertaSprzedażyList, (o1, o2) -> Double.compare(o1.getCena(), o2.getCena()));
            } else System.err.println("Wrong komend");

        } while (!komenda.equalsIgnoreCase("quit"));
    }

    public static void wyswieltLinieKomend() {
        System.out.println("What yours commend?\nAdd.\nList.\nSort up\nSort down\nquit.");
    }

}
