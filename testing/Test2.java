public class Test2 {
	public static void main(String[] args) {
		String string = "448710,146 AVENUE,167 STREET,ROCKAWAY BOULEVARD,7,0,,Queens,11434,";
		String[] array = string.split(",");

		System.out.println("blank value: " + array[6] == "");
		System.out.println(array[6].length());
	}
}