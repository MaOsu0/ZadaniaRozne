package Zrobione;

public class ExhaustPart extends Part{

    private boolean isAcordingToUeSpecification;

    public ExhaustPart(int index, String manufacturer, String model, int batch, boolean isAcordingToUeSpecification) {
        super(index, manufacturer, model, batch);
        this.isAcordingToUeSpecification = isAcordingToUeSpecification;
    }

    public boolean isAcordingToUeSpecification() {
        return isAcordingToUeSpecification;
    }

    public void setAcordingToUeSpecification(boolean acordingToUeSpecification) {
        isAcordingToUeSpecification = acordingToUeSpecification;
    }
}
