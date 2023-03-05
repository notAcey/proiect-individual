package proiect2;

public class dateProfesori {
    private int IDprofesor;
    private int IDutilizator;
    private String numeProfesor;
    private int varsta;
    private String sex;
    private int salariu;

    /**
     * 
     * @param IDprofesor
     * @param IDutilizator
     * @param numeProfesor
     * @param varsta
     * @param sex
     * @param salariu 
     */
    public dateProfesori(int IDprofesor, int IDutilizator, String numeProfesor, int varsta, String sex, int salariu){
        this.IDprofesor = IDprofesor;
        this.IDutilizator = IDutilizator;
        this.numeProfesor = numeProfesor;
        this.varsta = varsta;
        this.sex = sex;
        this.salariu = salariu;
    }

    public int getIDprofesor(){
        return IDprofesor;
    }

    public int getIDutilizator(){
        return IDutilizator;
    }

    public String getNumeProfesor(){
        return numeProfesor;
    }

    public int getVarsta(){
        return varsta;
    }

    public String getSex(){
        return sex;
    }
    
    public int getSalariu(){
        return salariu;
    }
    
    public void setIDprofesor(int IDprofesor){
        this.IDprofesor = IDprofesor;
    }
    
    public void setIDutilizator(int IDutilizator){
        this.IDutilizator = IDutilizator;
    }
    
    public void setNumeProfesor(String numeProfesor){
        this.numeProfesor = numeProfesor;
    }
    
    public void setVarsta(int varsta){
        this.varsta = varsta;
    }
    
    public void setSex(String sex){
        this.sex = sex;
    }
    
    public void setSalariu(int salariu){
        this.salariu = salariu;
    }
}