public class Quadrado {
   
    private int lado;
    
    public Quadrado(){}
    
    //----- cria bola DAVI JOIA

    public int getLado (){
        return lado;
    }
    public void setLado(int lado){
        this.lado = lado;
    }
    
    public int calcularArea(){
        return this.lado * this.lado;
    }
}