package structural.composite.file;

public class File extends AbstractFile {
    String name, dateCreated, path;

    public File(String name, String dateCreated, String name1, String dateCreated1, String path) {
        super(name, dateCreated);
        this.name = name1;
        this.dateCreated = dateCreated1;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public void addItem(AbstractFile item) {

    }

    @Override
    public void removeItem(AbstractFile item) {

    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String getTreeFolder() {
        return this.path + "/" + this.name;
    }
}
