class ackermann{
    int Ack(int m,int n) {
        int i,j;
        if (m>=0 && n>=0) {
            if (m == 0) {
                i = n + 1;
            } else if (n == 0) {
                i = Ack(m - 1, 1);
            } else {
                j = m-1;
                i = Ack(j, Ack(m, n - 1));
            }
        }
        return i;
    }
    public static void main(){
        int i = Ack(1,2);
        i = 5;
    }
}
