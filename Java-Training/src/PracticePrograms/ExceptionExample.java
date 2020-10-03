package PracticePrograms;

class ExceptionExample {
	public static void main(String args[]) {
		try {
			int arr[] = new int[7];
			arr[4] = 10 / 5;
			String s = null;
			System.out.println(s.length());
			System.out.println("Last Statement of try block");
		} catch (ArithmeticException e) {
			System.out.println("You should not divide a number by zero");
			return;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Accessing array elements outside of the limit");
			return;
		} catch (Exception e) {
			System.out.println("Some Other Exception" + e.getClass());
			return;
		} finally {
			System.out.println("Inside finally");

			/*
			 * A return statement inside a finally block will cause any exception that might
			 * be thrown in the try or catch block to be discarded.
			 */
			//return;
		}

		/*
		 * We can not specify general exception before runtime or compile time
		 * exception.
		 */
//	      catch(Exception e){
//		         System.out.println("Some Other Exception");
//		      }
//	      catch(ArithmeticException e){
//	         System.out.println("You should not divide a number by zero");
//	      }
//	      catch(ArrayIndexOutOfBoundsException e){
//	         System.out.println("Accessing array elements outside of the limit");
//	      }
		System.out.println("After Finally");
	}
}
