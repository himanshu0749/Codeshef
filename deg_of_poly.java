class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            for (int j = n-1; j >= 0;){
                if (arr[j] == 0)
                    j--;
                else{ 
                    System.out.println(j); 
                    break;
                }
            }
        }
    }
}
