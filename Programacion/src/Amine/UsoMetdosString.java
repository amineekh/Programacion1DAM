package Amine;

public class UsoMetdosString {
    public static void main(String[] args) {
        String pais="Francia";
        String pais2="Ecuador";
        String pais3="Marruecos";
        String pais4="España";
        String pais22="ecuador";
        //char

        System.out.println("la iniccial de este pais es " +pais.charAt(0));
        System.out.println("la final de este pais es " +pais.charAt(pais.length() -1));
        System.out.println("numeros de letras " +pais.length());
        System.out.println("pais en mayuscculas" +pais.toUpperCase());
        System.out.println("pais en mayuscculas "  +pais.toLowerCase());

        System.out.println("es igual? "+pais2.toLowerCase()+ "y " +pais22+ "? "+pais2.toLowerCase().equals(pais22.toLowerCase()));
        System.out.println("es iual "+ pais2+ "y " +pais22+ pais2.compareTo(pais22));

        if (pais2.compareTo(pais22)== 0){
            System.out.println("son iguales ");
        }
        else {
            System.out.println("no son iuales ");
        }


    }
}
