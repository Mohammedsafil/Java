package Basic_patterns;
public class pattern{
    public static void main(String[] args){
        // PatternC c = new PatternC();
        // c.patterC(5);
        // PatternD d = new PatternD();
        // d.patterD(5);
        // PatternE e = new PatternE();
        // e.patterE(5);
        // PatternF f = new PatternF();
        // f.patterF(5);
    //     PatternG g = new PatternG();
    //    g.patterG(5);
        // PatternH h = new PatternH();
        // h.patterH(5);
        // PatternI i = new PatternI();
        // i.patterI(5);
        // Pattern1 a1 = new Pattern1();
        // a1.pattern1(5);

        // Patter2 a2 = new Patter2();
        // a2.pattern2(5);

        // PatternJ j = new PatternJ();
        // j.patternJ(5);
        // PatternK k = new PatternK();
        // k.patternK(5);
        // PatternL l = new PatternL();
        // l.patterL(5);
        // PatternM m = new PatternM();
        // m.patterM(5);
        // PatternN n = new PatternN();
        // n.patternN(5);
        // PatternO o  = new PatternO();
        // o.patternO(5);
        // PatternP p = new PatternP();
        // p.patternP(5);
        PatternQ q = new PatternQ();
        q.patternQ(5);
    }
}


class PatternC{
    public void patterC(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
}

class PatternD{
    public void patterD(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i%2==0 && j%2!=0 )|| (i%2!=0 && j%2==0)){
                    System.out.print(0);
                }
                else{
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}

class PatternE{
    public void patterE(int n){
        int a = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a++);
            }
            System.out.println();
        }
    }
}


class PatternF{
    public void patterF(int n){
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class PatternG{
    public void patterG(int n){
        for(int row = 1;row<= n*2 -1 ;row++){
            int rChange = row > n ? n*2 - row : row;
            for(int col = 1; col < rChange ; col++){
                System.out.print("*");
            }System.out.println();
        } 
    }
}

class PatternH{
    public void patterH(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>0;j--){
                if(j<=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

class PatternI{
    public void patterI(int n){
        for(int i=n;i>0;i--){
            for(int j=n;j>0;j--){
                if(j<=i)System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class Pattern1{
    public void pattern1(int n){
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print(j);
            }System.out.println();
        }
    }
}

class Patter2{
    public void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j>0;j--){
                System.out.print(j);
            }
            for(int k=2; k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}


class PatternJ{
    public void patternJ(int n){
        for(int i=n;i>0;i--){
            for(int j=1;j<=n;j++){
                if(j>=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int k = n-1;k>0;k--){
                if(k>=i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

class PatternK{
    public void patternK(int n){
        for(int i=n;i>0;i--){
            for(int j=n;j>0;j--){
                if(j<=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            for(int k=n-1;k>0;k--){
                if(k<i){
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}

class PatternL{
    public void patterL(int n){
        for(int i=n;i>0;i--){
            for(int j=1;j<=n;j++){
                if(j>=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int k = n-1;k>0;k--){
                if(k>=i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for(int i=n-1;i>0;i--){
            for(int j=n;j>0;j--){
                if(j<=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            for(int k=n-1;k>0;k--){
                if(k<i){
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}

class PatternM{
    public void patterM(int n){
        for(int i=n;i>0;i--){
            for(int j=n;j>0;j--){
                if(j<=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            for(int k=n-1;k>0;k--){
                if(k<i){
                    System.out.print("*");
                }
            }

            System.out.println();
        }

        for(int i=n-1;i>0;i--){
            for(int j=1;j<=n;j++){
                if(j>=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int k = n-1;k>0;k--){
                if(k>=i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

class PatternN{
    public void patternN(int n){
        for(int i = n;i>0;i--){
            for(int j=1;j<=i;j++){
                if(j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            int a = n-i;
            int kl = a*2;
            for(int k=kl;k>0;k--){
                if(i==1){
                    System.out.print("*");
                }
                else{
                    if(k==1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    } 
}

class PatternO{
    public void patternO(int n){
        for(int i=1;i<=n*2;i++){
            int rChange = i>n ? (n*2)-(i-1) : i;

            for(int j=1;j<=n*2;j++){
                if(j <= n - rChange +1 || j> n+rChange-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

class PatternP{
    public void patternP(int n){
        for(int i=1;i<=n*2-1;i++){
            for(int j=1;j<=n*2-1;j++){
                int top = i,down = n*2 - i, left = j, right = n*2 - j;
                int minimum = Math.min(Math.min(top,down), Math.min(left,right));
                System.out.print(minimum+" ");
            }
            System.out.println();
        }
    }
}

class PatternQ{
    public void patternQ(int n){
        for(int i=1;i<=n*2-1;i++){
            for(int j=1;j<=n*2-1;j++){
                int top = i,down = n*2 - i, left = j, right = n*2 - j;
                int minimum = Math.min(Math.min(top,down), Math.min(left,right));
                System.out.print((n - minimum + 1)+" ");
            }
            System.out.println();
        }
    }
}