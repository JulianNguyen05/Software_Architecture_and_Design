package structural.composite.file;

public class File extends AbstractFile {

    public File(String name, String dateCreated) {
        super(name, dateCreated);
    }

    @Override
    public void addItem(AbstractFile item) {

    }

    @Override
    public void removeItem(AbstractFile item) {

    }

    @Override
    public String getTreeFolder() {
        return this.preStr + name;
    }

}
