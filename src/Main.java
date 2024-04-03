
public class Main {
    public static void main(String[] args) {
        /*
         *
        ***
       *****
      *******
     *********

        int n=5;
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k= 0; k < i*2+1; k++) {

                System.out.print("*");

            }
                System.out.println();

        }
 */
  /*       *
         * * *
       * * * * *
     * * * * * * *
   * * * * * * * * *

        int n=5;
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int k= 0; k < i*2+1; k++) {

                System.out.print("* ");

            }
            System.out.println();

        }
*/
/*        1
         222
        33333
       4444444
      555555555

        int n=5;
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k= 0; k < i*2+1; k++) {

                System.out.print(i+1);

            }
            System.out.println();

        }
*/
 /*  *
    * *
   *   *
  *     *
 *********
*/
        int b=5;
        for(int i=0;i<b;i++){
            for(int j=0;j<b-i-1;j++){
                System.out.print(" ");
            }

            System.out.print("*");



            for (int k = 0; k < i * 2 - 1; k++) {
                if(b-i-1==0){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");

            }

            if(i>0){
                System.out.print("*");
            }
            System.out.println();


        }
        }
    }
