class Complay {
    public static void main(String[] args) {
        for(int i=1;i<=9;i=i+2){
            for(int j=1;j<=i;j=j+2){
                int k=i*j;
                if (k>9 ) {
                    System.out.print(i+"*"+j+"="+k+"\t");
                } else{
                    System.out.print(i+"*"+j+"="+k+"\t");
                }
            }
            System.out.println();
        }  }}
