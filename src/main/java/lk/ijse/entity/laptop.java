package lk.ijse.entity;

public class laptop {
    private String id;
    private String name;
    private String Brand;

    public laptop(String id, String name, String brand) {
        this.id = id;
        this.name = name;
        Brand = brand;
    }

    public laptop() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    @Override
    public String toString() {
        return "laptop{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", Brand='" + Brand + '\'' +
                '}';
    }
}
