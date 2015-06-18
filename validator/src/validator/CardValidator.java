package validator;

import java.awt.*;
import java.io.*;
import java.util.Scanner;
import java.util.Locale;
import javax.swing.*;

public class CardValidator {
    


    

    private static final double EPS = 0.00000011;

    public static String validate(String... args) {
        
 
      
        Locale.setDefault(Locale.US);
        System.out.println("args.length=" + args.length);
       if (args.length < 2) {
            System.exit(-1);
            System.out.println("hiba");
        }
        System.out.println(args[0]);
        System.out.println(args[1]);
        Scanner fin = null;

            
        int error_code = 0;
        try {
            fin = new Scanner(new BufferedInputStream(new FileInputStream(args[0])));
            Scanner fcontestant = null;
            try {
                fcontestant = new Scanner(new BufferedInputStream(new FileInputStream(args[1])));
                while ( fin.hasNextLine() )
                {
                  if ( !fcontestant.hasNextLine() )
                  {
                    error_code = 1;   // elfogyott az output
                    break;
                  }
                  String line = fcontestant.nextLine();
                  if ( line.matches( "[01].\\d+" ) || line.matches( "\\d.\\d+[eE][\\+\\-]?\\d+" ) )
                  {
//                        System.out.println( line + ": OK" );
                  }
                  else
                  {
//                    System.out.println( line + ": WRONG!" );
                    error_code = 2;   // hibas formatumu sor
                    break;
                  }
                  String line1 = fin.nextLine();
                  Scanner sc2 = new Scanner(line1);
                  int l11 = sc2.nextInt();
                  int l12 = sc2.nextInt();
                  sc2.close();
                  
                  int l2len = 0;
                  int Clen = 0;
                  
                  String line2 = fin.nextLine();
//                  System.out.println( "line1=" + line1 + ", line2=" + line2 );
                  int i = 0;
                  int[] l2 = new int[512];
                  int[] C = new int[5120];
                  double[] P = new double[5120];
                  int GOAL;
                  double[] prob = { 0, 0, (1.0 / 13.0), (1.0 / 13.0), (1.0 / 13.0), (1.0 / 13.0), (1.0 / 13.0), (1.0 / 13.0), (1.0 / 13.0), (1.0 / 13.0), (4.0 / 13.0), (1.0 / 13.0) };
                  int j, curr;
                  double s;
                  double probability; 
                  while (i < line2.length())
                    {
                        if (line2.charAt(i) == ' ')
                        {
                            i++;
                            continue;
                        }
                        
                        if (line2.charAt(i) == '1' && line2.charAt(i + 1) == '0')
                        {
                            l2[l2len++] = 10;
                            i++;
                        }
                        
                        else if (line2.charAt(i) == 'J' || line2.charAt(i) == 'Q' || line2.charAt(i) == 'K')
                            l2[l2len++] = 10;
                        
                        else if (line2.charAt(i) == 'A')
                            l2[l2len++] = 11;
                        
                        else
                            l2[l2len++] = line2.charAt(i) - 48;
                        
                        i++;
                    }
                  
                  for (i = 0; i < l12 - 1; i++)
                        C[Clen++] = -1;
                  for (i = 0; i < l11 - 1; i++)
                  {
                      C[Clen++] = l2[i];
                      for (j = 0; j < l2[i] - 1; j++)
                          C[Clen++] = -1;
                  }
                  GOAL = Clen + 1;

                  C[Clen++] = l2[l11 - 1];
                  
                  for (i = 0; i < Clen; i++)
                  {
                      if (C[i] == -1)
                          P[i] = -1;
                      else
                          P[i] = 1;
                  }
                  

                  while (i < 10)
                  {
                      C[i] = -1;
                      P[i] = 0;
                      i++;
                  }

                  if (Clen > i)
                      i = Clen;
                  
                  for (curr = i - 1; curr > (-1); curr--)
                  {
                      if (P[curr] == -1)
                      {
                          probability = 0;
                          for (j = 2; j < 12; j++)
                          {
                              if (curr + j > GOAL - 1)
                                  break;
                              probability = probability + (prob[j] * P[curr + j]);
                          }
                          P[curr] = probability;
                      }
                  }
                  
                  
                      
                  s = 0.0;
                  for (i = 0; i < 10; i++)
                      s = s + P[i];
                  s = s / 10.0;
                
//                  System.out.printf( "Jury exact: %f\n", s );
                  double cres = Double.parseDouble( line );
//                  System.out.printf( "Jury:       %f\nContestant: %f\n", s, cres );
//                  System.out.printf( "Diff: %f\n", Math.abs( res - cres ) );
                  if ( Math.abs( s - cres ) > EPS )
                  {
                    error_code = 3;   // hibas eredmeny
                    break;
                  }
                }
                if ( error_code == 0 && fcontestant.hasNextLine() )
                  error_code = 4;   // tul sok a kimenet
            } catch (FileNotFoundException ex) {
                
            } finally {
                if (fcontestant != null) {
                    fcontestant.close();
//                    System.out.println("fcontestant.close()");
                }
            }
        } catch (FileNotFoundException ex) {
            
        } finally {
            if (fin != null) {
                fin.close();
//                System.out.println("fin.close()");
            }
        }
        switch (error_code) {
            case 0:
                return "Minden rendben volt.";
            case 1:
                return "Tul keves a kimenet.";
            case 2:
                return "Hibas formatumu sor.";
            case 3:
                return "Hibas eredmeny.";
            case 4:
                return "Tul sok a kimenet.";
            default:
                return "Validálási hiba";
        }
        
        
    }
}  