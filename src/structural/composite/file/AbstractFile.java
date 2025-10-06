package structural.composite.file;

public abstract class AbstractFile {
    String name, dateCreated;
    String path;

    public AbstractFile(String name, String dateCreated){
        this.name = name;
        this.dateCreated = dateCreated;
    }

    public abstract String getTreeFolder();

    public String getPath() {
        return path;
    }

    public abstract void addItem(AbstractFile item);

    public abstract void removeItem(AbstractFile item);
}
