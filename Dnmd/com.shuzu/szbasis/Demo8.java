package szbasis;

public class Demo8 {
	public static void main(String[] args) {
		Test8 a1 = new Test8(1, "C000225WRKSTA0001", "轮对轴箱拆解工位", 2, "2019-08-22");
		Test8 a2 = new Test8(2, "C000225WRKSTA0002", "轮对清洗/脱漆工位", 3, "2019-09-22");
		Test8 a3 = new Test8(3, "C000225WRKSTA0005", "齿轮箱油洗工位", 4, "2019-10-22");
		Test8[] b = { a1, a2, a3 };
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}

class Test8 {
	private int id;
	private String station_code;
	private String station_name;
	private int station;
	private String create_time;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getId() + '\t' + getStation_code() + '\t' + getStation_name() + '\t' + getStation() + '\t'
				+ getCreate_time();
	}

	public Test8() {
		// TODO Auto-generated constructor stub
	}

	public Test8(int id, String station_code, String station_name, int station, String create_time) {
		super();
		this.id = id;
		this.station_code = station_code;
		this.station_name = station_name;
		this.station = station;
		this.create_time = create_time;
	}

	public String getStation_name() {
		return station_name;
	}

	public void setStation_name(String station_name) {
		this.station_name = station_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStation_code() {
		return station_code;
	}

	public void setStation_code(String station_code) {
		this.station_code = station_code;
	}

	public String getStation() {
		return station + "工位";
	}

	public void setStation(int station) {
		this.station = station;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

}