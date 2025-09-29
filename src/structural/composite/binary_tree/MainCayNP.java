package structural.composite.binary_tree;

public class MainCayNP {
    public static void main(String[] args) {
        Nut goc = new NutTrong(5);
        Nut bon = new NutTrong(4);
        Nut ba = new NutLa(3);
        Nut hai = new NutLa(2);
        Nut tam = new NutTrong(8);
        Nut chin = new NutLa(9);
        Nut muoi = new NutLa(10);

        goc.themTrai(bon);
        goc.thenPhai(tam);
        bon.thenPhai(hai);
        bon.themTrai(ba);
        tam.thenPhai(muoi);
        tam.themTrai(chin);


        goc.duyet();

    }
}
