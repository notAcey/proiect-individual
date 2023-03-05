package proiect2;

import java.sql.Date;
/**
 * clasa dateStudenti
 * @author Delian
 */
public class dateStudenti {
    private int IDstudent;
    private int IDutilizator;
    private int IDspecializare;
    private String numeStudent;
    private String prenumeStudent;
    private Date dataNasterii;
    private String cnp;
    private String sex;
    private String statut;
    private String locBugetat;
    private String an;
    private String grupa;
    private String subgrupa;
    /**
     * 
     * @param IDstudent
     * @param IDutilizator
     * @param IDspecializare
     * @param numeStudent
     * @param prenumeStudent
     * @param dataNasterii
     * @param cnp
     * @param sex
     * @param statut
     * @param locBugetat
     * @param an
     * @param grupa
     * @param subgrupa 
     */
    public dateStudenti(int IDstudent, int IDutilizator, int IDspecializare,
                        String numeStudent, String prenumeStudent, Date dataNasterii, String cnp,
                        String sex, String statut, String locBugetat, String an, String grupa,
                        String subgrupa) {
        this.IDstudent = IDstudent;
        this.IDutilizator = IDutilizator;
        this.IDspecializare = IDspecializare;
        this.numeStudent = numeStudent;
        this.prenumeStudent = prenumeStudent;
        this.dataNasterii = dataNasterii;
        this.cnp = cnp;
        this.sex = sex;
        this.statut = statut;
        this.locBugetat = locBugetat;
        this.an = an;
        this.grupa = grupa;
        this.subgrupa = subgrupa;
    }

    /**
     * getters and setters 
     */
    
    //getters
    public int getIDstudent() {
        return IDstudent;
    }

    public int getIDutilizator() {
        return IDutilizator;
    }

    public int getIDspecializare() {
        return IDspecializare;
    }

    public String getNumeStudent() {
        return numeStudent;
    }

    public String getPrenumeStudent() {
        return prenumeStudent;
    }

    public Date getDataNasterii() {
        return dataNasterii;
    }

    public String getCnp() {
        return cnp;
    }

    public String getSex() {
        return sex;
    }

    public String getStatut() {
        return statut;
    }

    public String getLocBugetat() {
        return locBugetat;
    }

    public String getAn() {
        return an;
    }

    public String getGrupa() {
        return grupa;
    }

    public String getSubgrupa() {
        return subgrupa;
    }

    // Setters
    public void setIDstudent(int IDstudent) {
        this.IDstudent = IDstudent;
    }

    public void setIDutilizator(int IDutilizator) {
        this.IDutilizator = IDutilizator;
    }

    public void setIDspecializare(int IDspecializare) {
        this.IDspecializare = IDspecializare;
    }

    public void setNumeStudent(String numeStudent) {
        this.numeStudent = numeStudent;
    }

    public void setPrenumeStudent(String prenumeStudent) {
        this.prenumeStudent = prenumeStudent;
    }
    
    public void setDataNasterii(Date dataNasterii) {
        this.dataNasterii = dataNasterii;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public void setLocBugetat(String locBugetat) {
        this.locBugetat = locBugetat;
    }

    public void setAn(String an) {
        this.an = an;
    }

    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }

    public void setSubgrupa(String subgrupa) {
        this.subgrupa = subgrupa;
    }
}