
package model;


public class Relogio {
    private int hora;
    private int minuto;
    private int segundo;
    
    public Relogio(){
        this(0,0,0);
    }
    
    public Relogio(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    public int getHora(){
        return hora;
    }
    public void setHora(int hora){
        this.hora = hora;
    }
    public int getMinuto(){
        return minuto;
    }
    public void setMinuto(int minuto){
        this.minuto = minuto;
    }
    public int getSegundo(){
        return segundo;
    }
    public void setSegundo(int segundo){
        this.segundo = segundo;
    }
    
    public int getSegundos(){
        return ((((hora * 60)+minuto)*60)+segundo);
    }
    
    public void IncrementarSegundo(){
        if (getSegundo() + 1 == 60){
            setSegundo(0);
            IncrementarMinuto();
        } else{
            setSegundo(getSegundo() + 1);
        }
    }
    
    public void IncrementarMinuto(){
        if (getMinuto() + 1 == 60){
            setMinuto(0);
            IncrementarHora();
        } else{
            setMinuto(getMinuto() + 1);
        }
    }
    
    public void IncrementarHora(){
        if (getHora() + 1 == 24){
            setHora(0);
        } else{
            setHora(getHora() + 1);
        }
    }
    
    public void DecrementarSegundo(){
        if (getSegundo() - 1 == 0){
            setSegundo(59);
            DecrementarMinuto();
        } else{
            setSegundo(getSegundo() - 1);
        }
    }
    public void DecrementarMinuto(){
        if (getMinuto() - 1 == 0){
            setMinuto(59);
            DecrementarHora();
        } else{
            setMinuto(getMinuto() - 1);
        }
    }
    public void DecrementarHora(){
        if (getHora() - 1 == 0){
            setHora(0);
        } else{
            setHora(getHora() - 1);
        }
    }
    
    public String getTempo(){
        return (getHora() + ":" + getMinuto() + ":" + getSegundo());
    }
    
}
