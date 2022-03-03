public class Dado {
    private int caras = 0;

    public Dado(int caras){

        this.caras = caras;
    }

    public int lanzar(){

        int random = (int) (Math.random()*caras+1);

        return random;

        
    }


    
}
