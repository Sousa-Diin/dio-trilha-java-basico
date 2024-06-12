public class Main {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        // String colors[] = {'verde','vermelho';'preto' };
        String color = "verde";

        try {
            for (int x = 1; x <= 10; x++) {
                if (x % 2 == 0)
                    System.out.println(x);
                // throw new ArithmeticException("A cor escolhida não condiz.");

            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Somethis went wrong");
            System.err.println();
        }
    }
}
