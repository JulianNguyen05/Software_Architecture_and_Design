package structural.composite.file;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile{
    List<AbstractFile> files = new ArrayList<>();

    public Folder(String name, String dateCreated) {
        super(name, dateCreated);
    }

    @Override
//    public String getTreeFolder(){
//        StringBuilder builder = new StringBuilder();
//        builder.append(this.name);
//        for (var f:files){
//            builder.append("\n").append(f.getTreeFolder());
//        }
//
//        return builder.toString();
//    }

    public String getTreeFolder(){
        StringBuilder builder = new StringBuilder();
        builder.append(preStr).
                append(this.name);
        for (AbstractFile f : files){
            f.preStr = this.preStr + ".";
            builder.append("\n").
                    append(f.getTreeFolder());
            f.preStr = "";
        }

        return builder.toString();
    }

    @Override
    public String getPath() {
        return super.getPath();
    }

    @Override
    public void addItem(AbstractFile item) {
        item.path = this.path + "\\" + item.path;
        files.add(item);
    }

    @Override
    public void removeItem(AbstractFile item) {
        if(files.contains(item)) {
            files.remove(item);
            return;
        }
    }
}
