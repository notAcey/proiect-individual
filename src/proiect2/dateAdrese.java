package proiect2;

public class dateAdrese {
    private int id_adresa; 
    private String tara;
    private String district;
    private String sector;
    private String localitate;
    private String strada;
    private String numar;
    private String bloc;
    private String scara;
    private String etaj;
    private String apartament;
    
    /**
     * @param id_adresa
     * @param tara
     * @param district
     * @param sector
     * @param localitate
     * @param strada
     * @param numar
     * @param bloc
     * @param scara
     * @param etaj
     * @param apartament 
     */
    
    public dateAdrese(int id_adresa, String tara, String district, String sector, 
            String localitate, String strada, String numar, String bloc, 
            String scara, String etaj, String apartament){
        this.id_adresa = id_adresa;
        this.tara = tara;
        this.district = district;
        this.sector = sector;
        this.localitate = localitate;
        this.strada = strada;
        this.numar = numar;
        this.bloc = bloc;
        this.scara = scara;
        this.etaj = etaj;
        this.apartament = apartament;
    }
    
    public int getIDadresa(){
        return this.id_adresa;
    }
    public String getTara(){
        return tara;
    }
    public String getDistrict(){
        return district;
    }
    public String getSector(){
        return sector;
    }
    public String getLocalitate(){
        return localitate;
    }
    public String getStrada(){
        return strada;
    }
    public String getNumar(){
        return numar;
    }
    public String getBloc(){
        return bloc;
    }
    public String getScara(){
        return scara;
    }
    public String getEtaj(){
        return etaj;
    }
    public String getApartament(){
        return apartament;
    }
    public void setIDadresa(int id_adresa){
        this.id_adresa = id_adresa;
    }
    public void setTara(String tara){
        this.tara = tara;
    }
    public void setDistrict(String district){
        this.district = district;
    }
    public void setSector(String sector){
        this.sector = sector;
    }
    public void setLocalitate(String localitate){
        this.localitate = localitate;
    }
    public void setStrada(String strada){
        this.strada = strada;
    }
    public void setNumar(String numar){
        this.numar = numar;
    }
    public void setBloc(String bloc){
        this.bloc = bloc;
    }
    public void setScara(String scara){
        this.scara = scara;
    }
    public void setEtaj(String etaj){
        this.etaj = etaj;
    }
    public void setApartament(String apartament){
        this.apartament = apartament;
    }
}