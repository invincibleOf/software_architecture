package co.edu.upb.patrones.ejercicio1;

public enum Transmission {
    MANUAL,
    AUTOMATIC,
    SEMI_AUTOMATIC;

    public double getPrice() {
        switch (this) {
            case AUTOMATIC:
                return 100.0;
            case SEMI_AUTOMATIC:
                return 120.0;
            default:
                return 0.0;
        }
    }
}
