package team;

import java.util.ArrayList;

public class Index {
	public static void main(String[] args) {
		DataIOText dataIOText = new DataIOText();
		MyDataOP dataop = new MyDataOP();
		ArrayList<?> a = dataIOText.getScoreFromText("F:\\desktop\\datas.txt");
		float average = dataop.Average(a);
		float max = dataop.Max(a);
		float min = dataop.Min(a);
		System.out.println("");
		System.out.println("平均"+average);
		System.out.println("最大"+max);
		System.out.println("最小"+min);
	}
}
