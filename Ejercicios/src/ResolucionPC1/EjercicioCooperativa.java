package ResolucionPC1;
import java.util.Scanner;
public class EjercicioCooperativa {
    public static void main(String[] args){
        int numeroProductores;
        Scanner lector=new Scanner(System.in);
        String codigo, nombre,nombreMayor="";
        double cantidad,pago=0.0,bono=0.0,descuento=0.0,pagoFinal=0.0;
        double totalPagado=0.0,promedio=0.0,pagoMayor=0.0;
        int tipoCafe,nroBono=0,nroStd=0,nroOrg=0;


        do{
            System.out.println("Ingresa la cantidad de productores");
            numeroProductores=lector.nextInt();
            if(numeroProductores<=0){
                System.out.println("Debe ser mayor a cero");
            }
        }while(numeroProductores<=0);





        for(int i=1;i<=numeroProductores;i++){
            System.out.println("_______________________________");
            System.out.println("Ingresa el productor "+i);
            System.out.println("_______________________________");
            System.out.println("Ingresa el codigo de productor");
            lector.nextLine();
            codigo=lector.nextLine();
            System.out.println("Ingrese el nombre del productor");
            nombre=lector.nextLine();
            System.out.println("Ingrese los kilogramos");
            cantidad=lector.nextDouble();
            System.out.println("Ingrese 1.-Estandar 2.-Organico");
            tipoCafe=lector.nextInt();
            System.out.println("_______________________________");
            System.out.println();

            //pago=tipoCafe==1?cantidad*8:cantidad*12;
            if(tipoCafe==1){
                pago=cantidad*8;
                nroStd++;
            }else{
                pago=cantidad*12;
                nroOrg++;
            }

            if(cantidad>=200 && cantidad<=500){
                bono=pago*0.06;
                nroBono++;
            }else if(cantidad>500){
                bono=pago*0.12;
                nroBono++;
            }

            if(pago+bono>3000){
                switch(tipoCafe){
                    case 1:
                        descuento=pago*0.04;
                        break;
                    case 2:
                        descuento=pago*0.06;
                        break;
                }
            }

            pagoFinal=pago+bono-descuento;

            if(pagoMayor<pagoFinal){
                pagoMayor=pagoFinal;
                nombreMayor=nombre;
            }

            totalPagado=totalPagado+pagoFinal;

            System.out.println("RESUMEN DE PAGO");
            System.out.println("_______________________-");
            System.out.println("Nombre "+nombre);
            System.out.println("Codigo "+codigo);
            String texto=tipoCafe==1?"Estandar":"Organico";
            System.out.println("Tipo Cafe "+texto);
            System.out.println("Cantidad "+cantidad);
            System.out.println("Pago Base "+pago);
            System.out.println("Bono "+bono);
            System.out.println("Descuento "+descuento);
            System.out.println("Pago final "+pagoFinal);
            System.out.println("_______________________-");
            System.out.println();


        }

        System.out.println("ResultadosFinales");
        System.out.println("Total Pagado "+totalPagado);
        promedio=totalPagado/numeroProductores;
        System.out.println("Promedio "+promedio);
        System.out.println("Cantidad bonos "+nroBono);
        System.out.println("Cantidad organicos "+nroOrg);
        System.out.println("Cantidad estandar "+nroStd);
        System.out.println("el pago mayor a "+nombreMayor);


    }
}
