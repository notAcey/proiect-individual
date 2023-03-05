package proiect2;

public class dateSpecializare {
    private int IDspecializare;
    private int IDfacultate;
    private String numeSpecializare;
    private String numarLocuriBuget;
    private String numarLocuriTaxa;
    /**
     * 
     * @param IDspecializare
     * @param IDfacultate
     * @param numeSpecializare
     * @param numarLocuriBuget
     * @param numarLocuriTaxa 
     */
    public dateSpecializare(int IDspecializare, int IDfacultate, String numeSpecializare, String numarLocuriBuget, String numarLocuriTaxa){
        this.IDspecializare = IDspecializare;
        this.IDfacultate = IDfacultate;
        this.numeSpecializare = numeSpecializare;
        this.numarLocuriBuget = numarLocuriBuget;
        this.numarLocuriTaxa = numarLocuriTaxa;
    }
    
    public int getIDspecializare(){
        return IDspecializare;
    }
    
    public int getIDfacultate(){
        return IDfacultate;
    }
    
    public String getNumeSpecializare(){
        return numeSpecializare;
    }
    
    public String getNumarLocuriBuget(){
        return numarLocuriBuget;
    }
    
    public String getNumarLocuriTaxa(){
        return numarLocuriTaxa;
    }
    
    public void setIDspecializare(int IDspecializare){
        this.IDspecializare = IDspecializare;
    }
    
    public void setIDfacultate(int IDfacultate){
        this.IDfacultate = IDfacultate;
    }
    
    public void setNumeSpecializare(String numeSpecializare){
        this.numeSpecializare = numeSpecializare;
    }
    
    public void setNumarLocuriBuget(String numarLocuriBuget){
        this.numarLocuriBuget = numarLocuriBuget;
    }
    
    public void setNumarLocuriTaxa(String numarLocuriTaxa){
        this.numarLocuriTaxa = numarLocuriTaxa;
    }
}