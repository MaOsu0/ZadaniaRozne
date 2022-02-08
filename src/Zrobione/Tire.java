package Zrobione;

public class Tire extends  Part{
    private double width;
    private double size;

    public Tire(int index, String manufacturer, String model, int batch, double width, double size) {
        super(index, manufacturer, model, batch);
        this.width = width;
        this.size = size;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }


}
