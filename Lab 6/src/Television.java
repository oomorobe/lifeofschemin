public class Television {
	
	private String MANUFACTURER; 
	private int SCREEN_SIZE; 
	private boolean powerOn = false; 
	private int channel = 2; 
	private int volume = 20; 

	
	public Television(String m, int s ) {
		this.MANUFACTURER = m;
		this.SCREEN_SIZE = s;
	}

	
	public void setChannel(int c) {
		this.channel = (c >= 0 ? c : 0);
	}


	public void power() {
		this.powerOn = (this.powerOn == true ? false : true);
	}


	public void increaseVolume() {
		this.volume = this.volume + 1;
	}

	
	public void decreaseVolume() {
		if (this.volume >= 0) {
			this.volume = this.volume - 1;
		}
	}

	
	public int getChannel() {
		return this.channel;
	}

	
	public int getVolume() {
		return this.volume;
	}

	
	public String getManufacturer() {
		return this.MANUFACTURER;
	}

	
	public int getScreenSize() {
		return this.SCREEN_SIZE;
	}
}