 

public class Main {
    public static void main(String[] args) {
        
        // System.out.println(2 + 2);

        // int j = 0;
        // int i = 0;
        
        // try {
        //     i = 8 / j;
        //     System.out.println(i);
        // } catch (Exception e) {
        //     System.out.println("Cannot " + e.getMessage() + " Because something went wrong noob");
        // }

        // System.out.println(i);

        int i = 2;
        int j = 0;

        int[] arr = new int[3];
        String str = null;

        try {
            j = 18 / i;
            System.out.println(str.length());
            System.out.println(arr[1]);
            System.out.println(arr[6]);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Cannot be null " + e.getMessage());
        }

        System.out.println(j);
        System.out.println("Bye");

    }
}
