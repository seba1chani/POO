public class ExprimidorH2 {

    public void servir(Fruta fruta){
        System.out.println(fruta.exprimir()+"en: vaso largo");
    }
    public void servir(Hortaliza hortaliza){
        System.out.println(hortaliza.exprimir()+" en: copon ");
    }
    public void servir(Alimento alimento){
        if(alimento instanceof Fruta){
            System.out.println(alimento.exprimir()+" sirve en: vaso largo");
        } else if (alimento instanceof Hortaliza) {
            System.out.println(alimento.exprimir()+" sirve en: copon ");
        }
        else{
            System.out.println("Alimento no reconocito");
        }
    }

}
