package fightGameCharacter.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class KeyListener extends Thread{

	List<Observer> observers = new ArrayList<Observer>();
	public void registerObserver(Observer observer){
		observers.add(observer);
	}
	
	public void run(){
		while(true){
			try {
				int keyType = System.in.read();
				if(keyType >= 49 && keyType <=58){
					for(Observer o: observers){
						o.setActionType(keyType);
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		
	}
	
}
