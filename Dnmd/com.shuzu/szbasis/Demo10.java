package szbasis;

public class Demo10 {
	private String format;

	public String getFormat() {
		String[] formats = format.split(" ");
		return formats[1];
	}

	public void setFormat(String format) {
		this.format = format;
	}
	
}
