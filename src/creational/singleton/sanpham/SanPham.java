package creational.singleton.sanpham;

public class SanPham {
    String id;
    String name;
    int num;
    float cost;

    public SanPham(String id, String name, int num, float cost) {
        this.id = id;
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", num=" + num +
                ", cost=" + cost +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
