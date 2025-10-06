package structural.composite.file;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile{
    List<AbstractFile> files = new ArrayList<>();

    public Folder(String name, String dateCreated, List<AbstractFile> files, String name1, String dateCreated1, String path) {
        super(name, dateCreated);
        this.files = files;
        this.name = name1;
        this.dateCreated = dateCreated1;
        this.path = path;
    }

    public Folder(String name, String dateCreated) {
        super(name, dateCreated);
    }

    @Override
    public String getTreeFolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(name).append("\n");
        for (AbstractFile file : files) {
            builder.append("   ").append(file.getTreeFolder()).append("\n");
        }
        return builder.toString();
    }

    @Override
    public String getPath() {
        return super.getPath();
    }

    @Override
    public void addItem(AbstractFile item) {
        files.add(item);
    }

    @Override
    public void removeItem(AbstractFile item) {
        files.remove(item);
    }
}
