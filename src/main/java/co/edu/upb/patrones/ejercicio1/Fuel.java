package co.edu.upb.patrones.ejercicio1;

public enum Fuel {
        ELECTRIC,
        GAS,
        HYBRID;

        public double getPrice() {
                switch (this) {
                        case ELECTRIC:
                                return 50.0;
                        case HYBRID:
                                return 60.0;
                        default:
                                return 0.0;
                }
        }
}
