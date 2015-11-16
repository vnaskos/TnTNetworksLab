/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ourwork.tntnetworkslab;

/**
 *
 * @author dust__000/
 */
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

public class ArMethTelecom {
    
    

	public static void main(String[] args) {
           
            int erg;
            Scanner in = new Scanner(System.in);
            
            System.out.println("\nEpilogi ergastiriou");
            erg = in.nextInt();  
            
            switch(erg)
            {
                case 1:
                    erg1();
                    break;
                
                case 2:
                    erg2();
                    break;
                    
                case 4:
                    erg4();
                    break;
                    
                case 6:
                    erg6();
                    break;
                    
                case 8:
                    erg8();
                    break;
                    
                case 91:
                    erg91();
                    break;
                   
                case 92:
                    erg92();
                    break;
                    
                case 10:
                    erg10();
                    break;
            }
                
	}
	
        
        public static void erg1() {
            
            int n = 0, a, t = 0, i;
            float b = 1.0f, y = 0;
            Scanner in = new Scanner(System.in);

            System.out.println("\nARITMOS GRAMMWN KAI FORTIO:\n");
            while(t == 0) {
                    n = in.nextInt();
                    a = in.nextInt();

                    for(i = 1; i <= n; i++) {
                            b = (a * b) / (i + a * b);
                            y = (a * (1 - b)) / n;
                    }
                    b *= 100;
                    y *= 100;
                    System.out.printf("PITHANOTHTA MPLOKARISMATOS (B)= %.5f %%, APODOSH GRAMMWN (n)= %.5f %%\n", b, y);
            }
        }

        public static void erg2() {
            
            int  a, is, n, t = 0, i;
            float e = 0.0f, b,  y = 0, anew = 0;
            Scanner in = new Scanner(System.in);

            System.out.println("\nFORTIO, GRAMMES, PHGES:\n");

            while(t == 0) {

                    a = in.nextInt();
                    is = in.nextInt();
                    n = in.nextInt();

                    do {
                        b = a /(n - a * (1-e));
                        e = 1.0f;

                        for(i = 1; i <= is; i++) {
                                e = (n - i) * b * e / (i + (n - i) * b * e);
                        }

                        anew = n * b / (1 + b * (1 - e));
                        y = a * (1 - e) / is;
                    } while (Math.abs(anew - a) > 0.001);

                    e *= 100;
                    y *= 100;
                    System.out.printf("PITHANOTHTA MPLOKARISMATOS (B)= %.5f %%, APODOSH GRAMMWN (n)= %.5f %%\n", e, y);


            }
                    
        }


        public static void erg4() {
            
            int n = 0,t = 0, i;
            float b = 1.0f, a, x, y, z, r;
            
            Scanner in = new Scanner(System.in);
                
            System.out.println("\nARITMOS EKSERXOMENON GRAMMWN KAI FORTIO KINISIS:");
            while(t == 0) {
                    n = in.nextInt();
                    a = in.nextFloat();

                    for(i = 1; i <= n; i++) {
                            b = (a * b) / (i + a * b);
                    }
                    x = (n * b) / (n - a * (1 - b));
                    y = x * a / (n - a);
                    z = x / (n - a);
                    r = a / n;
                    System.out.printf("-----------------------------------------------------------\n");
                    System.out.printf("PITHANOTHTA ANAMONIS = %.4f, M.T. KLHSEON ANAMONHS = %.4f\n" , x, y);
                    System.out.printf("-----------------------------------------------------------\n");
                    System.out.printf("MESOS XRONOS ANAMONIS = %.4f, M.T. APODOSH GRAMMON = %.4f\n" , z, r);
                    System.out.printf("-----------------------------------------------------------\n");
            }
        }
        
        public static void erg6() {
            
            int n = 0, i, t = 0, nmax = 100000;
            float b, a;
            double bn;
            
            Scanner in = new Scanner(System.in);
                
            System.out.println("\n PITHANOTHTA MPLOKARISMATOS KAI FORTIO KINHSHS: \n");
            while(t == 0) {
                    b = in.nextFloat();
                    a = in.nextFloat();

                    bn = 1.0;
                    for(i = 1; i <= nmax; i++) {
                            bn = a * bn / ( (float)i + a * bn); 
                            if (b >= bn)
                            {
                                n = i;
                                i = nmax + 1;
                            }
                    }
                System.out.printf("O ARITHMOS TWN GRAMMWN EINAI= %d\n", n);
                System.out.printf("H AKRIBHS PITHANOTHTA MPLOKARISMATOS (BN)= %.5f\n", bn);

            }
        }
        
        public static void erg8() {
            
            int  t = 0;
            float la, ha, c, a, w;
            Scanner in = new Scanner(System.in);

            System.out.println("\nRYTMOS AFIKSHS  RYTMOS EKSYPHRETHSHS  TETRAGVNIKH DIASPORA:\n");
            while(t == 0) {
                la = in.nextFloat();
                ha = in.nextFloat();
                c  = in.nextFloat();
                
                a = la * ha;
                w = a * (1 + c) * ha / ( (1 - a) * 2);

                System.out.printf(" ----------------------------------------------------------------\n");
                System.out.printf(" FORTIO KINHSHS=',%.6f,'   M.T. XRONOY ANAMONHS=',%.6f\n", a, w);
                System.out.printf(" ----------------------------------------------------------------\n");
            }
        }
        
        public static void erg91() {
            
            int  t = 0;
            float la, ha, c, a, w;
            Scanner in = new Scanner(System.in);

            System.out.println("\nRYTMOS AFIKSHS  RYTMOS EKSYPHRETHSHS  TETRAGVNIKH DIASPORA:\n");
            while(t == 0) {
                la = in.nextFloat();
                ha = in.nextFloat();
                c  = in.nextFloat();
                
                a = la * ha;
                w = a * (1 + c) * ha / ( (1 - a) * 2);

                System.out.printf(" ----------------------------------------------------------------\n");
                System.out.printf(" FORTIO KINHSHS=',%.6f,'   M.T. XRONOY ANAMONHS=',%.6f\n", a, w);
                System.out.printf(" ----------------------------------------------------------------\n");
            }
        }
        
        public static void erg92() {
            
            int  t = 0, n, i;
            float la, lh, a, x, z, b;
            Scanner in = new Scanner(System.in);

            System.out.println("\nRYTMOS AFIKSHS  RYTMOS EKSYPHRETHSHS  TETRAGVNIKH DIASPORA:\n");
            while(t == 0) {
                la = in.nextFloat();
                lh = in.nextFloat();
                n  = in.nextInt();
                
                a = la * lh;
                b = 1.0f;
                
                for (i = 1; i<= n; i++)
                {
                    b = a * b / (i + a * b);
                }
                x = (n * b) / (n - a * (1 - b));
                z = x * lh /(n - a);

                
                System.out.printf(" FORTIO KINHSHS=',%.5f,'   M.T. XRONOY ANAMONHS=',%.5f\n", a, z);
               
            }
        }
        
        public static void erg10() {
            
            int n = 0, a, t = 0, i;
            float b = 1.0f, y = 0;
            Scanner in = new Scanner(System.in);

            System.out.println("\nARITMOS GRAMMWN KAI FORTIO:\n");
            while(t == 0) {
                    n = in.nextInt();
                    a = in.nextInt();

                    for(i = 1; i <= n; i++) {
                            b = (a * b) / (i + a * b);
                    }
                    y = a * (1 - b) / n;
               
                    System.out.printf("PITHANOTHTA MPLOKARISMATOS (B)= %.6f %%, APODOSH GRAMMWN (n)= %.6f %%\n", b, y);
            }
        }

        
}

	

