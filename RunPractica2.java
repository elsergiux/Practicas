package practica2;

public class RunPractica2 {

    public static void main(String[] args) {
        
        Siames gto = new Siames();
        System.out.println(gto.comer());
        System.out.println(gto.respira());
        System.out.println(gto.agua());
        System.out.println(gto.brincar());
        System.out.println(gto.maullar());
        System.out.println(gto.trepar());
        gto.nombre();
        gto.genero();
        gto.edad();
        gto.dormir();
        gto.comida();
        
        Persa gto2 = new Persa();
        System.out.println(gto2.comer());
        System.out.println(gto2.respira());
        System.out.println(gto2.agua());
        System.out.println(gto2.brincar());
        System.out.println(gto2.maullar());
        System.out.println(gto2.trepar());
        gto2.nombre();
        gto2.genero();
        gto2.edad();
        gto2.juguetes();
        gto2.cama();
        
        PastorAleman pa = new PastorAleman();
        System.out.println(pa.comer());
        System.out.println(pa.respira());
        System.out.println(pa.agua());
        System.out.println(pa.ladrar());
        System.out.println(pa.correr());
        System.out.println(pa.morder());
        pa.nombre();
        pa.genero();
        pa.edad();
        pa.pasear();
        pa.amigable();
        
        Chihuahua chi = new Chihuahua();
        System.out.println(chi.comer());
        System.out.println(chi.respira());
        System.out.println(chi.agua());
        System.out.println(chi.ladrar());
        System.out.println(chi.correr());
        System.out.println(chi.morder());
        chi.nombre();
        chi.genero();
        chi.edad();
        chi.agresivo();
        chi.ruido();
        
        Perico  pe = new Perico();
        System.out.println(pe.comer());
        System.out.println(pe.respira());
        System.out.println(pe.agua());
        System.out.println(pe.huevos());
        System.out.println(pe.volar());
        System.out.println(pe.nido());
        pe.nombre();
        pe.genero();
        pe.edad();
        pe.hablar();
        pe.saludar();
        
        Canario ca = new Canario ();
        System.out.println(ca.comer());
        System.out.println(ca.respira());
        System.out.println(ca.agua());
        System.out.println(ca.huevos());
        System.out.println(ca.volar());
        System.out.println(ca.nido());
        ca.nombre();
        ca.genero();
        ca.edad();
        ca.cantar();
        ca.gordo();
    }
    
}
