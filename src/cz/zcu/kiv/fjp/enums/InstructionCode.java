package cz.zcu.kiv.fjp.enums;

public enum InstructionCode {

    LIT("LIT", 0),      // LIT ? konst   -> na vrchol zasobniku konst
    LRT("LRT", 0),      // LRT ? konst   -> na vrchol zasobniku real konst
    OPR("OPR", 1),      // OPR ? funkce  -> modifikace zasobniku
    LOD("LOD", 2),      // LOD L A       -> na vrchol zasobniku data z (L, A)
    STO("STO", 3),      // STO L A		 -> data z vrcholu zasobniku na (L, A)
    CAL("CAL", 4),      // CAL L A       -> skok na A s hladinou zanoreni L
    RET("RET", 5),      // RET ? ?		 -> navrat z podprogramu
    INT("INT", 6),      // INT ? konst   -> zvedne vrchol zasobniku o konst
    JMP("JMP", 7),      // JMP ? A       -> skok na A
    JMC("JMC", 8),      // JMC ? A       -> skok podle hodnoty na vrcholu zasobniku
    REA("REA", 9),      // REA ? ?       -> na vrchol zasobniku nactene cislo
    WRI("WRI", 10),     // WRI ? ?       -> vypis ascii znaku podle vrcholu zasobniku
    OPF("OPF", 11),     // OPF ? funkce  -> modifikace zasobniku s plovoucimi hodnotami
    RTI("RTI", 12),     // RTI ? ?       -> ze 2 hodnot (double) na zasobniku se udela 1 (int)
    ITR("ITR", 13),     // ITR ? ?       -> z 1 hodnoty (int) na zasobniku se udelaji 2 (double)
    NEW("NEW", 14),     // NEW ? ?       -> alokace 1 bunky pameti, na zasobnik jeji adresa
    DEL("DEL", 15),     // DEL ? ?       -> dealokace 1 bunky pameti, jeji adresa na vrcholu zasobniku
    LDA("LDA", 16),     // LDA ? ?		 -> na vrchol zasobniku data z adresy uvedene na vrcholu zasobniku
    STA("STA", 17),     // STA ? ?       -> na zasobniku hodnota, adresa -> ulozeni hodnoty na adresu
    PLD("PLD", 18),     // PLD ? ?       -> na zasobniku L, A -> na vrchol hodnota z (L, A)
    PST("PST", 19);     // PST ? ?       -> na zasobniku X, L, A -> na adresu (L, A) se ulozi X

    private String name;
    private int code;

    InstructionCode(String name, int code) {
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }


}




