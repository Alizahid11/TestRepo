
public class Tesco {
	public void Timetable(int TablesTable) {
		int i;
		System.out.println("Times Table of " + TablesTable);
		System.out.println("________________");
		for (i = 1; i <= 10; i++) {
			System.out.println(TablesTable + " x " + i + " = " + (TablesTable * i));
		}
	}

	public void Timetable2(int TablesTable, int Range) {
		int i;
		System.out.println("Times Table of " + TablesTable);
		System.out.println("____________________________");
		for (i = 1; i <= Range; i++) {
			System.out.println(TablesTable + " x " + i + " = " + (TablesTable * i));
		}
	}

	public void Timetable3(int TT, int secondstep) {
		System.out.println("Times Table of " + TT);
		System.out.println("________________");
		for (; TT <= secondstep; TT++) {
			Timetable(TT);
			System.out.println("   ");

		}
	}

}

class Task {

	public static void main(String args[]) {
		Tesco tm = new Tesco();
		tm.Timetable3(3, 6);

	}

}