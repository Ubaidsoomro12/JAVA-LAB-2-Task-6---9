


class Fibonacci {
    public static void main(String[] args) {
        

    
        int U = 50, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + U + " terms:");

        for (int i = 1; i <= U; ++i) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
