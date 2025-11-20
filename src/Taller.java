import java.util.ArrayList;
import java.util.List;

public class Taller {
    private List<Motocicleta> taller;
    public Taller ( ){
        taller = new ArrayList<>();
        predefinir();
    }
    public void predefinir(){
        taller.add(new Motocicleta(1, "Yamaha", 200, 2002 ,1500f));
        taller.add(new Motocicleta(2, "Suzuki", 500, 2003 ,1000f));
        taller.add(new Motocicleta(3, "BMW", 100, 2004,1300f));
        taller.add(new Motocicleta(4, "Ducati", 400, 2020 ,1520f));
        taller.add(new Motocicleta(5, "Kawasaki", 300, 2005 ,1232f));
        taller.add(new Motocicleta(6, "Honda"  , 280, 2006,1222f));
    }
    public void agregar(Motocicleta moto){
        taller.add(moto);
    }
    public void ordenarID(){
        Motocicleta aux;
        for( int i = 0 ; i<taller.size()-1; i++) {
            for ( int j = i+1 ; j<taller.size(); j++){
                if( taller.get(i).getCodigo()>taller.get(j).getCodigo()){
                    aux = taller.get(i);
                    taller.set(i, taller.get(j));
                    taller.set(j, aux);
                }
            }
        }
    }
    public void ordenarPrecio(){
        Motocicleta aux;
        int j;
        for( int i = 1 ; i<taller.size(); i++){
            j = i-1;
            aux = taller.get(i);
            while(j>=0 && aux.getPrecio()<taller.get(j).getPrecio() ){
                taller.set(j+1,taller.get(j));
                j--;

            }
            taller.set(j+1, aux);

        }
    }
    public void odenarCilindraje(){
        Motocicleta aux;
        int j;
        for( int i = 1 ; i<taller.size(); i++){
            j = i-1;
            aux = taller.get(i);
            while(j>=0 && aux.getCilindraje()>taller.get(j).getCilindraje() ){
                taller.set(j+1,taller.get(j));
                j--;

            }
            taller.set(j+1, aux);

        }
    }

    public List<Motocicleta> getTaller() {
        return taller;
    }
}
