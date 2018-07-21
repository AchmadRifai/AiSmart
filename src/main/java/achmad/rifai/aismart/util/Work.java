package achmad.rifai.aismart.util;

import java.io.IOException;
import java.util.List;

import achmad.rifai.aismart.beans.*;

public class Work {
	public static List<Krit> loadBobot(String krit_path) throws IOException {
		List<Krit>l=new java.util.LinkedList<>();
		java.io.File f=new java.io.File(krit_path);
		com.google.gson.JsonParser p=new com.google.gson.JsonParser();
		if(f.exists()) {
			java.io.FileReader r=new java.io.FileReader(f);
			com.google.gson.JsonArray a=p.parse(r).getAsJsonArray();
			for(int x=0;x<a.size();x++) {
				com.google.gson.JsonObject o=a.get(x).getAsJsonObject();
				Krit k=new Krit();
				k.setBobot(o.get("bobot").getAsFloat());
				k.setKrit(o.get("krit").getAsString());
				l.add(k);
			} r.close();
		}else System.out.println("Krit json not found");
		return l;
	}

	public static List<Data> loadData(String data_path) throws IOException {
		List<Data>l=new java.util.LinkedList<>();
		com.google.gson.JsonParser p=new com.google.gson.JsonParser();
		java.io.File f=new java.io.File(data_path);
		if(f.exists()) {
			java.io.FileReader r=new java.io.FileReader(f);
			com.google.gson.JsonArray a=p.parse(r).getAsJsonArray();
			for(int x=0;x<a.size();x++) {
				Data d=new Data();
				com.google.gson.JsonObject o=a.get(x).getAsJsonObject();
			} r.close();
		}else System.out.println("data json not found");
		return l;
	}
}
