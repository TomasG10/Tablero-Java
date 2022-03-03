public class Ficha {
    
    private String color = "";
    private int posicion = 0;

    Dado dado = new Dado(6);

    public Ficha(String colorficha){
        this.setColor(colorficha);
        this.posicion = 0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPosicion() {
        return posicion;  
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void avanzar(){
        int pasos = dado.lanzar();
        this.posicion += pasos;
        System.out.println("La ficha " + color + " se movió a la posición "+ posicion);
    }



    
}
