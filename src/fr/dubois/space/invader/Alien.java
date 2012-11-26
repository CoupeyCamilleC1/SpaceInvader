package fr.dubois.space.invader;

import android.graphics.Bitmap;

public class Alien extends Sprite{





	public Alien(Bitmap bitmap, float x, float y) {
		super(bitmap, x, y);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		
		/*int etatx; //Variable d'état axe des X
		etatx = 1;
		int etaty; // Variable d'état axe des Y
		etaty = 0;
		int compteury;
		compteury = 0;
		
		if(etatx == 1){
		//Deplacement vers la droite
		this.x += +1;
		}else{
		//Deplacement vers la gauche
		this.x += -1;
		}
		if(etaty == 1 && compteury <10){
			for(compteury=0; compteury<10; compteury++){
			this.y += -1;
			}
			compteury = 0;
		}
		*/
		this.x += 10;
	}
}
