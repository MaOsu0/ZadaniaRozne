package Zrobione;

public class Part {
    private int index;
    private String manufacturer;
    private String model;
    private int batch;

    public Part(int index, String manufacturer, String model, int batch) {
        this.index = index;
        this.manufacturer = manufacturer;
        this.model = model;
        this.batch = batch;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }
}
