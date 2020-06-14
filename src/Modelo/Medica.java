
package Modelo;

import static Interfaces1.Main.d;

public class Medica {
    private String nomb;
    public String Tipo;
    private String Lab;
    private String Est;

    public Medica(String nomb, String Tipo, String Lab, String Est) {
        this.nomb = nomb;
        this.Tipo = Tipo;
        this.Lab = Lab;
        this.Est = Est;
    }

    public Medica() {
        
    }
    public boolean estadoMedica(){
        if(this.Est.equals("Activo")){
            return true;
        }else{
            return false;
        }
    }
    

    /**
     * @return the nombre
     */
    public String getNomb() {
        return nomb;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    /**
     * @return the Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    /**
     * @return the Laboratorio
     */
    public String getLab() {
        return Lab;
    }

    /**
     * @param Laboratorio the Laboratorio to set
     */
    public void setLab(String Lab) {
        this.Lab = Lab;
    }

    /**
     * @return the EStado
     */
    public String getEst() {
        return Est;
    }

    /**
     * @param EStado the EStado to set
     */
    public void setEst(String Est) {
        this.Est = Est;
    }

  
    
}
