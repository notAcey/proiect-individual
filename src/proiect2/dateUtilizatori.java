package proiect2;
/**
 * clasa dateUtilizatori
 * @author Delian
 */
public class dateUtilizatori {
    private int IDutilizator;
    private int IDadresa;
    private String username;
    private String parola;
    private String tipUtilizator;

    /**
     * 
     * @param IDutilizator
     * @param IDadresa
     * @param username
     * @param parola
     * @param tipUtilizator 
     */
    public dateUtilizatori(int IDutilizator, int IDadresa, String username, String parola, String tipUtilizator){
        this.IDutilizator = IDutilizator;
        this.IDadresa = IDadresa;
        this.username = username;
        this.parola = parola;
        this.tipUtilizator = tipUtilizator;
    }

    public int getIDutilizator(){
        return IDutilizator;
    }

    public int getIDadresa(){
        return IDadresa;
    }

    public String getUsername(){
        return username;
    }

    public String getParola(){
        return parola;
    }

    public String getTipUtilizator(){
        return tipUtilizator;
    }

    public void setIDutilizator(int IDutilizator){
        this.IDutilizator = IDutilizator;
    }

    public void setIDadresa(int IDadresa){
        this.IDadresa = IDadresa;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setParola(String parola){
        this.parola = parola;
    }

    public void setTipUtilizator(String tipUtilizator){
        this.tipUtilizator = tipUtilizator;
    }
}
