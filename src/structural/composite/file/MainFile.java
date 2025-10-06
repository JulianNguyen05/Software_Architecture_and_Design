package structural.composite.file;

public class MainFile {
    public static void main(String[] args) {
        AbstractFile data = new Folder("data", "2025-10-06");
        AbstractFile toan = new Folder("toan", "2025-10-06");
        AbstractFile ly = new Folder("ly", "2025-10-06");
        AbstractFile hoa = new Folder("hoa.pdf", "2025-10-06");
        AbstractFile giaiTich = new Folder("GiaiTich.pdf", "2025-10-06");
        AbstractFile giaiTichA = new File("GiaiTichA.pdf", "2025-10-06");
        AbstractFile hinhNY = new File("NY.pdf", "2025-10-06");

        data.addItem(toan);
        data.addItem(ly);
        data.addItem(hoa);
        toan.addItem(giaiTich);
        giaiTich.addItem(giaiTichA);
        toan.addItem(hinhNY);

        System.out.printf(data.getTreeFolder());

    }
}
