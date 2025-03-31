package com.iucosoft.javaeefinalproject.security;

/**
 *
 * @author scostea
 */
public class Validator {
        private static int LOGIN_MIN_CARACTERE = 5;
    private static int MIN_CARACTERE = 3;
    private static int TEL_MIN_CARACTERE = 8;
    
    public static void valideazaLogin(String password){
//        if( username==null ||
//                (username!=null && username.length() < LOGIN_MIN_CARACTERE ) ){
//           throw new RuntimeException("username "+username+ " error.. min 5 caractere");
//        }
        if( password==null ||
                (password!=null && password.length() < LOGIN_MIN_CARACTERE ) ){
           throw new RuntimeException("password "+password+ " error.. min 5 caractere");
        }
        
    }
    
//    public static void valideazaNumePrenume(String nume, String prenume){
//        if(nume==null || (nume!=null && nume.length()<MIN_CARACTERE)){
//            throw new RuntimeException("nume "+nume+ " error.. min 3 caractere");
//        }
//        if(prenume==null || (prenume!=null && prenume.length()<MIN_CARACTERE)){
//        throw new RuntimeException("prenume "+prenume+ " error.. min 3 caractere");
//        }
//    }
    
//    public static void valideazaTelefon(int telefon){
//        if(telefon==0 || (telefon>0 && telefon<=TEL_MIN_CARACTERE))
//            throw new RuntimeException("adresa "+telefon+ " error.. min 5 caractere"); 
//    }
    
}
