package achmad.rifai.aismart;

import java.io.IOException;
import java.util.List;

import achmad.rifai.aismart.beans.*;
import achmad.rifai.aismart.util.Work;

public class Main {
	public static void main(String[]args) {
		String krit_path="parame/bobot.json",data_path="parame/data.json";
		try {
			List<Krit>lk=Work.loadBobot(krit_path);
			List<Data>ld=Work.loadData(data_path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
