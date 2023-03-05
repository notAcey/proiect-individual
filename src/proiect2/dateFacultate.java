package proiect2;

public class dateFacultate {
    private int IDfacultate;
    private String numeFacultate;
    
    /**
     * @param IDfacultate
     * @param numeFacultate 
     */
    public dateFacultate(int IDfacultate, String numeFacultate){
        this.IDfacultate = IDfacultate;
        this.numeFacultate = numeFacultate;
    }
    
    public int getIDfacultate(){
        return IDfacultate;
    }
    
    public String getNumeFacultate(){
        return numeFacultate;
    }
    
    public void setIDfacultate(int IDfacultate){
        this.IDfacultate = IDfacultate;
    }
    
    public void setNumeFacultate(String numeFacultate){
        this.numeFacultate = numeFacultate;
    }
}
