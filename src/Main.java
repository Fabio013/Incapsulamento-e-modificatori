/*  Scrivere un programma che contenga una classe che definisce un Auto
    che abbia come proprietà cilindrata, targa, marca e modello.
    Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
    Nel main dichiarare un oggetto di tipo Auto.
    In questo caso la nota importante è rendere le proprietà della classe auto
    accessibili solo attraverso i metodi.
 */
public class Main {
    public static void main(String[] args) {
        Auto Fiat500 = new Auto(1242,"AW678XT","Fiat","500");
        System.out.println("Auto presente in magazzino:");
        System.out.println(Fiat500.getMarca() + " " + Fiat500.getModello());
        System.out.println("Targa: " + Fiat500.getTarga());
        System.out.println("Cilindrata: " + Fiat500.getCilindrata()+ " cc");
//      System.out.println(Fiat500.toString());
    }
}
