package by.gsu.lab3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	private ObjectOutputStream out = null;
	private ObjectInputStream in = null;

	public Serialization() {
		super();
	}

	public void serial(Konys konys, String fileName) throws IOException {
		if (out == null) {
			out = new ObjectOutputStream(new FileOutputStream(fileName));
		}
		out.writeObject(konys);
	}

	public Konys diserial(String fileName) throws IOException, ClassNotFoundException {
		if (in == null) {
			in = new ObjectInputStream(new FileInputStream(fileName));
		}
		return (Konys) in.readObject();
	}

	public void closeStream() throws IOException {
		out.flush();
		out.close();
	}
}