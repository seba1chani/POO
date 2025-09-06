
import java.util.ArrayList;

public class TestColectivos {
    public static void main(String[] args) throws Exception {
        
        ColectivoDiesel cole1= new ColectivoDiesel(50, 1000000, 2, 200);
        ColectivoHibrido cole2= new ColectivoHibrido(45, 1.2, IElectrico.ALTO_VOLTAJE, 1500, 2);
        ColectivoElectrico cole3= new ColectivoElectrico(55,0.9,IElectrico.BAJO_VOLTAJE);
        ArrayList<Colectivo>arr=new ArrayList<>();
        arr.add(cole1);
        arr.add(cole2);
        arr.add(cole3);

       for(Colectivo cole: arr){
        int id = cole.getId();
        if(cole instanceof IElectrico && cole instanceof IDiesel){
            // Es híbrido
            double v = ((IElectrico)cole).getVoltaje();
            double nivel = ((IDiesel)cole).getNivelContaminacion();
            System.out.println("ID: " + id + " voltaje: " + v + " nivel de contaminacion: " + nivel);
        } else if(cole instanceof IElectrico){
            double v = ((IElectrico)cole).getVoltaje();
            System.out.println("ID: " + id + " voltaje: " + v);
        } else if(cole instanceof IDiesel){
            double nivel = ((IDiesel)cole).getNivelContaminacion();
            System.out.println("ID: " + id + " nivel de contaminacion: " + nivel);
        }
    } 
    
        

        
    }
}
/*for(int i=0;i<arr.size();i++){
           Colectivo colectivo= arr.get(i);
           int id=colectivo.getId();
           if(colectivo instanceof IElectrico){
            double v= ((IElectrico) colectivo).getVoltaje();
            System.out.println("ID: "+id+" Voltaje: "+v);
           }else if(colectivo instanceof IDiesel){
            double nivel= ((IDiesel)colectivo).getNivelContaminacion();
            System.out.println("ID: "+id+" Nivel de contaminacion: "+nivel);
           }
        } */