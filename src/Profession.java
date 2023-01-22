public enum Profession {
    WOJOWNIK("Wojownik"), PALADYN("Paladyn"), ZWIADOWCA("Zwiadowca"), MAG("Mag");
    private final String professionName;

    Profession(String professionName) {
        this.professionName = professionName;
    }

    @Override
    public String toString(){
        return professionName;
    }
    }
