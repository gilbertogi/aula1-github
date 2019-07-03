package com.gilberto.curso.basico;

public class TesteLampada {

	public static void main(String[] args) {

    Lampada lampada = new Lampada();
    
    
    lampada.ligar();
    lampada.mostarEstatdo();
    lampada.desligar();
    lampada.mostarEstatdo();
    lampada.mudarEstado();
    lampada.mostarEstatdo();
    
 
    
    
    
   /* 
    lampada.mostarEstatdo();
    lampada.ligar();

    if(lampada.ligada) {
    	System.out.println("A lampda esta ligada");
    }else {
    	System.out.println(" A lampada esta desligada");
    }
    
    
    lampada.desligar();
    if(lampada.ligada) {
    	System.out.println("A lampda esta ligada");
    }else {
    	System.out.println(" A lampada esta desligada");
    }
    System.out.println("A lampada esta desligado " + lampada.ligada);

	}*/

}
}
// lampada.modelo="A60";
// lampada.tensao="Bivolt";
// lampada.garantiaMeses=36;
// lampada.potencia=7;
//  lampada.cor="Amarela";
// lampada.tipoLuz="Amarela";
// lampada.tipoBajur=true;
 
// lampada.tipos=new String [5];
// lampada.tipos[0]="Abajur";
// lampada.tipos[1]="lapedes";