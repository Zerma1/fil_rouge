package models.entities.references;

public enum Grade {

    SERGENT("SGT","OR-5"),
    SERGENT_CHEF("SCH","OR-6"),
    SERGENT_CHEF_BM2("SCH","OR-7"),
    ADJUDANT("ADJ","OR-8"),

    QUARTIER_MAITRE("QM2","OR-3"),
    MAITRE("MT","OR-7");


    private final String symbol;
    private final String codeOTAN;

    Grade(String symbol, String codeOTAN){
        this.symbol = symbol;
        this.codeOTAN = codeOTAN;
    }

    String getSymbol() {
        return symbol;
    }

    public String getCodeOTAN() {
        return codeOTAN;
    }


}
