interface AudioPlayer {
	void playAudio(String audio); 
 }
interface VideoPlayer {
	void playVideo(String video);
 }
class MediaPlayer implements AudioPlayer, VideoPlayer{
	
	@Override
	public void playAudio(String audio){
		System.out.println(" Playing Audio = " + audio);
	}	
	@Override
	public void playVideo(String video){
		System.out.println(" Playing Video = "+ video);
	}
}

class Assign3_25{
	public static void main(String[]args){
		MediaPlayer a1=new MediaPlayer();
		MediaPlayer a2=new MediaPlayer();
		
		a1.playAudio("Shape of You");
		a2.playVideo("Inception");
	}
}