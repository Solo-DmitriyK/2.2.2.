package web.model;

public class Car {
    private String marca;
    private String model;
    private int age;

    public Car(String marca, String model, int age) {
        this.marca = marca;
        this.model = model;
        this.age = age;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
