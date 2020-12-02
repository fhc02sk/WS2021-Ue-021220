package orderservice;

public class DemoStoreApp {

    public static void main(String[] args) {

        Bestellzeile bz1 = new Bestellzeile("Acer Monitor", 1, 199);
        Bestellzeile bz2 = new Bestellzeile("USB Stick 8GB", 2, 19);
        Bestellzeile bz3 = new Bestellzeile("Bleistift", 7, 1);

        System.out.println(bz1.toString());
        System.out.println(bz2.toString());
        System.out.println(bz3.toString());

        System.out.println("bz2.getKosten() = " + bz2.getKosten());

        Bestellzeile[] arr = new Bestellzeile[3];
        arr[0] = bz1;
        arr[1] = bz2;
        arr[2] = bz3;

        Bestellung order123 = new Bestellung("Order_2020-123", arr);
        order123.printBestellung();

    }

}
