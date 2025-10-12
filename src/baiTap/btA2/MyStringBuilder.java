package baiTap.btA2;

public class MyStringBuilder {
    private String str;

    public MyStringBuilder() {
        this.str = "";
    }

    public MyStringBuilder(String str) {
        this.str = str;
    }

    public MyStringBuilder addString(String s){
        this.str = str + s;
        return this;
    }

    public MyStringBuilder addFloat(Float f){
        this.str = str + f;
        return this;
    }

    public MyStringBuilder addBool(Boolean b){
        this.str = str + b;
        return this;
    }

    @Override
    public String toString() {
        return this.str;
    }
}
