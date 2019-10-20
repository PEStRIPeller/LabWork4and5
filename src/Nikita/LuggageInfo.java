package Nikita;

class LuggageInfo {
    private String name;
    private int flightNumber;
    private int luggageCheckNumber;
    private int luggagePlacesQuantity;
    private double luggageWeight;

    public int getFlightNumber() {
        return flightNumber;
    }

    public int getLuggageCheckNumber() {
        return luggageCheckNumber;
    }

    public double getLuggageWeight() {
        return luggageWeight;
    }

    public LuggageInfo() {
    }

    public String getName() {
        return name;
    }

    public LuggageInfo(String name, int flightNumber, int luggageCheckNumber, int luggagePlacesQuantity, double luggageWeight) {
        this.name = name;
        this.flightNumber = flightNumber;
        this.luggageCheckNumber = luggageCheckNumber;
        this.luggagePlacesQuantity = luggagePlacesQuantity;
        this.luggageWeight = luggageWeight;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", flightNumber=" + flightNumber +
                        ", luggageCheckNumber=" + luggageCheckNumber +
                        ", luggagePlacesQuantity=" + luggagePlacesQuantity +
                        ", luggageWeight=" + luggageWeight +"\n"
                ;
    }
}