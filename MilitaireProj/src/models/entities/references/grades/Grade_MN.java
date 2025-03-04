package models.entities.references.grades;

public enum Grade_MN {

    QUARTIER_MAITRE("QM2","OR-3"),
    MAITRE("MT","OR-7");


    private final String symbol;
    private final String codeOTAN;

    Grade_MN(String symbol, String codeOTAN){
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
