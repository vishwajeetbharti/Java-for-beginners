interface ipod{
	public void musicOn();
	public void musicOff();
    private void recordingOn() {
		System.out.println("Audio recording Started...");
	}
	default public void recordingOff() {
		recordingOn();
		System.out.println("Audio recording Off...");
	}
	}
interface Smartipod{
	public void MP4vedioOn();
	public void MP4vedioOff();
}
interface camara{
	public void camaraOn();
	public void takingShots();
}
class Myipod implements ipod{
	public void musicOn() {
	System.out.println("Music On...");	
	}
	public void musicOff() {
		System.out.println("Music Off...");
	}
	}
class MysmartIopd extends Myipod implements Smartipod,camara{
	public void MP4vedioOn() {
		System.out.println("MP4 vedio music On...");	
	}
	public void MP4vedioOff() {
		System.out.println("MP4 vedio music Off...");	
	}
	public void camaraOn() {
		System.out.println("Camara On for taking Snaps...");	
	}
	public void takingShots() {
		System.out.println("ttaking Shots...");	
	}
}
public class Interfaces_1 {
	public static void main(String[] args) {
		MysmartIopd nokia = new MysmartIopd();
		nokia.musicOn();
		nokia.musicOff();
		//nokia.recordingOn();
		nokia.recordingOff();
		nokia.MP4vedioOn();
		nokia.MP4vedioOff();
		nokia.camaraOn();
		nokia.takingShots();
	}

}
