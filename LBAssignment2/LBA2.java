public class LBA2 {
    public static void main(String args[]){
        int n=5;
        System.out.println("-----------1------------");
        p1(n);
        System.out.println("-----------2------------");
        p2(n);
        System.out.println("-----------3------------");
        p3(n);
        System.out.println("-----------4------------");
        p4(n);
        System.out.println("-----------5------------");
        p5(n);
        System.out.println("-----------6------------");
        p6(n);
        System.out.println("-----------7------------");
        p7(n);
        System.out.println("-----------8------------");
        p8(n);
        System.out.println("-----------9------------");
        p9(n);
        System.out.println("-----------10------------");
        p10(n);
        System.out.println("-----------11------------");
        p11(n);
        System.out.println("-----------12------------");
        p12(n);
        System.out.println("-----------13------------");
        p13(n);
        System.out.println("-----------14------------");
        p14(n);
        System.out.println("-----------15------------");
        p15(n);
        System.out.println("-----------16------------");
        p16(n);
    }

    static void p1(int n){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p2(int n){
        for(int i=1;i<=5;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p3(int n){
        for(int i=1;i<=5;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p4(int n){
        for(int i=1;i<=5;i++){
            for(int k=1;k<=i-1;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p5(int n){
        for(int i=1;i<=5;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p6(int n){
        for(int i=1;i<=5;i++){
            for(int k=1;k<=i-1;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=2*(n-i);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p7(int n){
        for(int i=1;i<=(2*n)-1;i++){
            if(i<=n){
                for(int k=n-i;k>0;k--){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                for(int j=i-1;j>=1;j--){
                    System.out.print("*");
                }
            }
            if(i>n){
                for(int k=(2*n)-i;k<n;k++){
                    System.out.print(" ");
                }
                for(int j=1;j<=(2*n)-i;j++){
                    System.out.print("*");
                }
                for(int j=(2*n-1)-i;j>=1;j--){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void p8(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p9(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(n-i);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p10(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p11(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p12(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p13(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p14(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void p15(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1 || j==i || i==n)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void p16(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1 || j==i || i==n)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }


}
