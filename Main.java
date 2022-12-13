public class Main {
    public static void main (String[] args) {
        Libro l1 = new Libro("Pinocchio", "C. Collodi", 150);
        Libro l2 = new Libro("Pollicino", "C. Perrault", 80);
        /*System.out.println(l1.getTitolo() + ": " + l1.prezzo());
        System.out.println(l2.getTitolo() + ": " + l2.prezzo());
        Libro.setCostoPagina(0.1);
        System.out.println(l1.getTitolo() + ": " + l1.prezzo());
        System.out.println(l2.getTitolo() + ": " + l2.prezzo());*/

        Mensola m = new Mensola();
        System.out.println(m.getNumMaxVolumi());
        m.setVolume(l2, 0);
        System.out.println(m.getVolume(0).getAutore());

    }
}

