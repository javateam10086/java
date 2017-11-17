package team;

import java.util.ArrayList;

public interface DataIO {
	abstract ArrayList<?> getScoreFromText(String a);
	abstract String saveDataInText(ArrayList<?> list);
}
