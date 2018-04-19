import org.calvin.Book.ctci.CtCILibrary.CtCILibrary.AssortedMethods;

public class Tester {

	public static void main(String[] args) {
		int[][] matrix = AssortedMethods.randomMatrix(10, 10, -5, 5);
		AssortedMethods.printMatrix(matrix);
		SubMatrix subA = QuestionA.getMaxMatrix(matrix);
		System.out.println(subA.toString());
		
		SubMatrix subB = QuestionB.getMaxMatrix(matrix);
		System.out.println(subB.toString());
		
		SubMatrix subC = QuestionC.getMaxMatrix(matrix);
		System.out.println(subC.toString());	
	}

}
