 class main {
    public static void main(String[] args) {
        pat(4,0);
//        pat2(4,0);

    }
    static void  pat(int r,int c){
        if (r == 0){
            return;
        }
        if (c < r){
            System.out.print("* ");
            pat(r,c+1);
        }else {
            System.out.println();
            pat(r-1,0);
        }
    }
    static void  pat2(int r,int c){
        if (r == 0) {
            return;
        }
        if (c < r) {
            pat2(r, c + 1);
            System.out.print("* ");
        } else {
            pat2(r - 1, 0);
            System.out.println();
        }
    }
}
