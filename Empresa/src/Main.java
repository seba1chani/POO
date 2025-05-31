public class Main {
    public static void main(String[] args) {

        Empleado supervisor= new Empleado("Juan Carlos Perez",28725325,
                "Parque Belgrano block G depto 8",20,10,2010,9,30,387422032,
                8000);

        Empleado emp1= new Empleado("Lucas Garcia",37425322,"Huaico mzn 490a C20",
                15,5,2015,7,5,387420153,1500,supervisor);

        Vendedor ven1= new Vendedor("Jorge Rojas",17725345,"San lorenzo chico",2020,8,17,16,35,387425322
        ,700,supervisor,"2xarg25","Volfwagen","trend",387412465);

        Secretario sec1= new Secretario("Rodrigo Choque",34125422,"Mirasoles mzn 125b casa 17",15,6,2022,16,35,
                387426585,1200,supervisor,"A5510",387125125);

        //System.out.println(supervisor);
        //System.out.println(emp1);
        System.out.println(ven1);
        //System.out.println(sec1);
    }
}