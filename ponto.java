import static java.lang.Math.abs;
public class ponto {

        //contstrutores
        public ponto(){ x=0; y=0;}
        public ponto(int cx, int cy) {x = cx;y= cy;}
        public ponto(ponto p) {x=p.getX();y =p.getY();}
    // variaveis de instancia
        private int x;
        private int y;
        // metedos de instancia

        //interrogador- devolve x
    public int getX()  {return x;}
    // interrogador- devolve y
    public int getY(){ return y;}
    // modificador-incremento das coordenadas
    public void decCoord(int deltaX,int deltaY){
        x-= deltaX; y-=deltaY;
    }
    /*determina se o ponto tem ambas as coordenadas positivas*/
    public boolean coordPos(){
        return x > 0 && y >0;

    }
    /* verifica se um ponto é simetrico, ou seja, se dista igualmente do eixo dos x e dos y*/
    public boolean simetrico(){
        return abs(x) ==abs(y);
    }


 }