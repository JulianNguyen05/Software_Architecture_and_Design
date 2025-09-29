package creational.singleton.shape;

public abstract class Shape {
    protected String brush;
    protected String paper;
    protected String frame;

    public Shape(String brush, String paper, String frame) {
        this.brush = brush;
        this.paper = paper;
        this.frame = frame;
    }

    public String getBrush() {
        return brush;
    }

    public void setBrush(String brush) {
        this.brush = brush;
    }

    public String getPaper() {
        return paper;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public abstract String draw();
}
