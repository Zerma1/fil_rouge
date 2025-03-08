package models.entities.references.grades;

public enum Grade_AAE {
    SERGENT("SGT","OR-5"),
    SERGENT_CHEF("SCH","OR-6"),
    SERGENT_CHEF_BM2("SCH","OR-7"),
    ADJUDANT("ADJ","OR-8");

    private final String symbol;
    private final String codeOTAN;

    Grade_AAE(String symbol, String codeOTAN){
        this.symbol = symbol;
        this.codeOTAN = codeOTAN;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getCodeOTAN() {
        return codeOTAN;
    }

}
