package day7;

public class CommandDemo {
	public static void main(String[] args) {
		Tv tv=new Tv();
		SetTopBox setTopBox=new SetTopBox();
		VGame vGame=new VGame();
		SoundSystem soundSystem=new SoundSystem();
		
		FatherNewsChannelCommand fncc=new FatherNewsChannelCommand(tv, setTopBox, vGame, soundSystem);
		MotherSerialChannelCommand mscc=new MotherSerialChannelCommand(tv, setTopBox, vGame, soundSystem);
		FatherVGameCommand fvc=new FatherVGameCommand(tv, setTopBox, vGame, soundSystem);
		
		UniversalRemote uvr=new UniversalRemote();
		
		uvr.setCommand(1, fvc);
		uvr.setCommand(2, mscc);
		uvr.setCommand(3, fncc);
		
		uvr.executeCommand(3);//this is what my parents will do....
		
	}
}
class UniversalRemote{
	Command c[]=new Command[5];
	public UniversalRemote() {
		for(int i=0;i<5;i++) {
			c[i]=new DummyCommand();
		}
	}
	
	public void setCommand(int slot,Command command) {
		this.c[slot]=command;
	}
	public void executeCommand(int slot) {
		this.c[slot].execute();
	}
}
class DummyCommand extends Command{
	@Override
	public void execute() {
		System.out.println("I am dummy yet to be operational...");
	}
}
abstract class Command{
	public Command() {
		// TODO Auto-generated constructor stub
	}
	private Tv tv;private SetTopBox setTopBox;private VGame vGame;private SoundSystem soundSystem;
	
	public Command(Tv tv, SetTopBox setTopBox, VGame vGame, SoundSystem soundSystem) {
		this.tv = tv;
		this.setTopBox = setTopBox;
		this.vGame = vGame;
		this.soundSystem = soundSystem;
	}
	public final Tv getTv() {
		return tv;
	}
	public final SetTopBox getSetTopBox() {
		return setTopBox;
	}
	public final VGame getvGame() {
		return vGame;
	}
	public final SoundSystem getSoundSystem() {
		return soundSystem;
	}
	public abstract void execute();
}
class FatherNewsChannelCommand extends Command{
	public FatherNewsChannelCommand(Tv tv, SetTopBox setTopBox, VGame vGame, SoundSystem soundSystem) {
		super(tv,setTopBox,vGame,soundSystem);
	}
	@Override
	public void execute() {
		System.out.println("logic of Father news channel command started............");
		//business logic
		getTv().tvOn();getTv().av1Mode();getSetTopBox().newsChannel();getSoundSystem().highSound();
		System.out.println("Enjoy the news pappa.....");
	}
}
class MotherSerialChannelCommand extends Command{
	public MotherSerialChannelCommand(Tv tv, SetTopBox setTopBox, VGame vGame, SoundSystem soundSystem) {
		super(tv,setTopBox,vGame,soundSystem);
	}
	public void execute() {
		System.out.println("logic of Mother news channel command started.............");
		getTv().tvOn();getTv().av1Mode();getSetTopBox().serialChannel();getSoundSystem().lowSound();
		System.out.println("Enjoy the serial channel mamma");
	}
}
class FatherVGameCommand extends Command{
	public FatherVGameCommand(Tv tv, SetTopBox setTopBox, VGame vGame, SoundSystem soundSystem) {
		super(tv,setTopBox,vGame,soundSystem);
	}
	public void execute() {
		System.out.println("logic of father tennis game command started.............");
		getTv().tvOn();getTv().vgameMode();getSoundSystem().highSound();
		System.out.println("Enjoy the tennis game pappa...........");
	}
}
class Tv{
	public void tvOn() {
		System.out.println("tv on..........");
	}
	public void av1Mode() {
		System.out.println("av1 mode.............");
	}
	public void vgameMode() {
		System.out.println("v game mode.............");
	}
}
class SetTopBox{
	public void newsChannel() {
		System.out.println("news channel started.....");
	}
	public void serialChannel() {
		System.out.println("serial channel started........");
	}
}
class SoundSystem{
	public void highSound() {
		System.out.println("high volume.......");
	}
	public void lowSound() {
		System.out.println("low volume.......");
	}
}
class VGame{
	public void playTennis() {
		System.out.println("vgame tennis started....");
	}
}