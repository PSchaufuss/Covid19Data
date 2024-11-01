public class Covid19Data
{
    private String region;
    private String aldersgruppe;
    private String bekræftedeTilfældeIAlt;
    private String døde;
    private String indlagtePåIntensivAfdeling;
    private String indlagte;
    private String dato;

    public Covid19Data(String region, String aldersgruppe, String bekræftedeTilfældeIAlt,
                       String døde, String indlagtePåIntensivAfdeling,
                       String indlagte, String dato)
    {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.bekræftedeTilfældeIAlt = bekræftedeTilfældeIAlt;
        this.døde = døde;
        this.indlagtePåIntensivAfdeling = indlagtePåIntensivAfdeling;
        this.indlagte = indlagte;
        this.dato = dato;
    }

    @Override public String toString()
    {
        return "Region: " + region + ", Aldersgruppe: " + aldersgruppe + ", Bekræftede tilfælde i alt: "
            + bekræftedeTilfældeIAlt + ", Døde: " + døde + ", Indlagte på intensiv afdeling: "
            + indlagtePåIntensivAfdeling + ", Indlagte: " + indlagte + ", Dato: " + dato;
    }

}
