public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "M";

        switch (sigla) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MEDIO");
                break;
            }         
            case "G":{
                System.out.println("GRANDE");
                break;
            }       
        
            default:
            System.out.println("INDEFINIDO");
        }
        // if(sigla == "P"){
        //     System.out.println("Pequeno");
        // }
        // else if(sigla == "M"){
        //     System.out.println("Medio");
        // }
        // else if(sigla == "G"){
        //     System.out.println("Grande");
        // }
        // else{
        //     System.out.println("Nao ");
        // }
    }
}
