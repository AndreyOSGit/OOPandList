package ListWithInteraface;

public class AList1 implements Elist {
	private int index = 0;
	int ar[];

	public AList1() {
		ar = new int[15];
		for (a : ar)
		{
			a = Integer.MIN_VALUE;
		}
	}

	@Override
	public void clear() {
		index = 0;
	}

	@Override
	public void init(int[] ini) {
		if (ini == null)
			ini = new int[0];

		for (int i = 0; i < ini.length; i++) {
			addEnd(ini[i]);
		}
		index = ini.length;
	}

	@Override
	public int[] toArray() {
		int[] outArr = new int[size()];
		for (int i = 0; i < outArr.length; i++) {
			outArr[i] = ar[i];
		}
		return outArr;
	}

	@Override
	public int size() {
		return index;
	}

	@Override
	public void addStart(int val) {
		int[] buffAr = new int[size() + 1];

		buffAr[0] = val;
		for (int i = 0; i < buffAr.length; i++) {
			buffAr[i + 1] = ar[i];
		}
		ar = buffAr;
	}

	@Override
	public void addEnd(int val) {
		ar[index++] = val;
	}

	@Override
	public void addPos(int pos, int val) {
		if (pos < 0 || pos > index - 1)
			throw new IllegalArgumentException();

		for (int i = index; i > pos; i--) {
			ar[i] = ar[i - 1];
		}
		index++;
		ar[pos] = val;
	}

	@Override
	public int delStart() {
		if (index == 0) {
			throw new IllegalArgumentException();
		}
		int buff = ar[0];
		index--;
		for (int i = 0; i < index; i++) {
			ar[i] = ar[i + 1];
		}
		return buff;
	}

	@Override
	public int delEnd() {
		if (index == 0) {
			throw new IllegalArgumentException();
		}
		index--;
		return ar[index];
	}

	@Override
	public int delPos(int pos) {

		if (index == 0) {
			throw new IllegalArgumentException();
		}
		if ((pos > index) || (pos < 0)) {
			throw new IllegalArgumentException();
		}
		int buff = ar[pos];
		index--;
		for (int i = pos; i < index; i++) {
			ar[i] = ar[i + 1];
		}
		return buff;
	}

	@Override
	public int min() {

		if (index == 0) {
			throw new IllegalArgumentException();
		}
		int buff = ar[0];
		for (int i = 1; i < index; i++) {
			if (buff > ar[i])
				buff = ar[i];
		}
		return buff;

	}

	@Override
	public int max() {

		if (index == 0) {
			throw new IllegalArgumentException();
		}
		int buff = ar[0];
		for (int i = 1; i < index; i++) {
			if (buff < ar[i])
				buff = ar[i];
		}
		return buff;

	}

	@Override
	public int minPos() {

		if (index == 0) {
			throw new IllegalArgumentException();
		}
		int buff = 0;
		for (int i = 0; i < index; i++) {
			if (ar[buff] > ar[i])
				buff = i;
		}
		return buff;

	}

	@Override
	public int maxPos() {

		if (index == 0) {
			throw new IllegalArgumentException();
		}
		int buff = 0;
		for (int i = 0; i < index; i++) {
			if (ar[buff] < ar[i])
				buff = i;
		}
		return buff;
	}

	@Override
	public void sort() {

		for (int i = 1; i < index; i++) {
			int j;
			int temp = ar[i];
			for (j = i - 1; j >= 0; j--) {
				if (ar[j] < temp)
					break;
				ar[j + 1] = ar[j];
			}
			ar[j + 1] = temp;
		}

	}

	@Override
	public void revers() {

		for (int i = 0; i < index / 2; i++) {
			int buff = ar[i];
			ar[i] = ar[index - i - 1];
			ar[index - i - 1] = buff;
		}

	}

	@Override
	public void halfRevers() {

		for (int i = 0; i < index / 2; i++) {
			int buff = ar[i];
			ar[i] = ar[index - index / 2 + i];
			ar[index - index / 2 + i] = buff;
		}

	}

	@Override
	public int get(int pos) {
		if ((pos >= index) || (pos < 0)) {
			throw new IllegalArgumentException();
		}
		return ar[pos];
	}

	@Override
	public void set(int pos, int val) {
		if (pos < 0 || pos > size() - 1)
			throw new IllegalArgumentException();
		ar[pos] = val;
	}

	@Override
	public String toString() {

		String outString = "";
		for (int i = 0; i < ar.length; i++) {
			outString += String.format("%d, ", ar[i]);
		}

//			outString = String.format("[%s]", outString);
		return outString;

	}

}
