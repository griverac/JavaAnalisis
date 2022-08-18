/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Texto;

import java.security.Principal;

/**
 *
 * @author Rivgl
 */
public class TraductorCM {
    
    public static void tr(String datos){
        
        String cadenaNormalize = Normalizer.normalize(datos, Normalizer.Form.NFD);   
        String dos = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");

        
       String rmu = dos.toLowerCase();
       
       String tr="a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
       String tr="7,B,3,D,5,F,8,H,4,J,K,6,0,N,9,P,Q,2,S,T,1,V,W,X,Y,Z";
       String[] abec = M_U.split(",");
       String[] traductorcm= tr.split(",");
        CharSequence[] abc;
       
       for(int i=0; i < abc.length; i++){
        System.out.println(abc[i]);
        }
       
       for(int i=0; i < traductorcm.length; i++){
        System.out.println(traductorcm[i]);
        }
       
       for (int i = 0; i <26; i++){
           rmu = rmu.replace(abc[i], traductorcm[i]);
       }
       texto.java.setText(rmu);
    }
    
}
