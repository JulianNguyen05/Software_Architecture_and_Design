package creational.builder.my_string;

public class MyStringBuilder {
    private String str;

    public MyStringBuilder(String str) {
        this.str = str;
    }

    public void addString(String s){
        this.str = str + s;
        return ;
    }

}
