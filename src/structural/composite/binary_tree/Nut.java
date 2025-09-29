package structural.composite.binary_tree;

public abstract class Nut {
    int giaTri;

    public Nut(int giaTri) {
        this.giaTri = giaTri;
    }

    public abstract void duyet();
    public abstract void themTrai(Nut n);
    public abstract void thenPhai(Nut n);
    public abstract void xoaTrai();
    public abstract void xoaPhai();

}
