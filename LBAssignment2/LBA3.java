public class LBA3 {
    public static void main(String args[]){
        int n=9;
        System.out.println("--------------1-------------");
        p1(n);
        System.out.println("--------------2-------------");
        p2(n);
        System.out.println("--------------3-------------");
        p3(n);
        System.out.println("--------------4-------------");
        p4(n);
        System.out.println("--------------5-------------");
        p5(n);
        System.out.println("--------------6-------------");
        p6(n);
        System.out.println("--------------7-------------");
        p7(n);
    }

    static void p1(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    static void p2(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void p3(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void p4(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=i-1;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void p5(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j=n-i+1;j<=9;j++){
                System.out.print(j+" ");
            }
            for(int j=n-1;j>=n-i+1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void p6(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n-i+1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void p7(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n-i+1;k++){
                System.out.print((n-i+1)+" ");
            }
            System.out.println();
        }
    }
}
