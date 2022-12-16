import java.awt.Color;
/*
 * A picture of a Squidward's House
 * 
 * 
 * Dakota Kallas
 * CS120 Section 02
 * Fall 2019
 * 
 * Programming Assignment 1
 * September 10, 2019
 */

public class Building {

    public static void main( String[] args )
    {
    	
        Color SAND = new Color( 255,255,120);
        Color SKY_BLUE = new Color(51,204,205);
        Color HOUSE_BLUE = new Color(0,0,153);
        Color HOUSE_DARK_BLUE = new Color(0,0,120);
        Color HOUSE_DARK_GLASS = new Color(51,103,255);
        Color HOUSE_GLASS_BLUE = new Color(51,204,255);
        Color HOUSE_DOOR = new Color(102,51,0);
        Color HOUSE_DOOR_LIGHT = new Color(123,70,0);
        Color DOOR_KNOB = new Color(255,204,51);
        
    	Window win; 														//Window Pop Up
        win = new Window();
        win.setSize( 1800, 1000 );
        win.setTitle( "Charles Greene is the King" );
        win.setBackground( SKY_BLUE );
    	 
        Rectangle grass1 = new Rectangle( 2000, 2000, 200, 200); 			// Base of the Grass
        win.add( grass1 );
        grass1.setBackground( SAND );
        grass1.setLocation( 0, 800);
        grass1.setSize( 2000, 200 );
        
        Oval grass2 = new Oval( 2000, 2000, 50, 50 ); 						//Right hand Hill of Grass
        win.add( grass2 );
        grass2.setBackground( SAND );
        grass2.setLocation( 200, 780);
        grass2.setSize( 2000, 200 );
        
        Oval grass3 = new Oval( 2000, 2000, 50, 50 ); 						//Left hand Hill of Grass
        win.add( grass3 );
        grass3.setBackground( SAND );
        grass3.setLocation( -700, 780);
        grass3.setSize( 2000, 200 );
    	
        Rectangle houseEarLf = new Rectangle( 200, 200, 100, 200); 			//Left Ear of the House
        win.add( houseEarLf );
        houseEarLf.setBackground( HOUSE_DARK_BLUE );
        houseEarLf.setLocation( 450, 200);
        houseEarLf.setSize( 100, 300 );
        
        Triangle houseTriL = new Triangle( 100, 100, 50, 50, 1); 			//Triangle of Left Ear
        win.add( houseTriL );
        houseTriL.setBackground( HOUSE_DARK_BLUE );
        houseTriL.setLocation( 410, 200);
        houseTriL.setSize( 80, 300 );
        
        Rectangle houseEarRt = new Rectangle( 200, 200, 100, 200); 			//Right Ear of the House
        win.add( houseEarRt );
        houseEarRt.setBackground( HOUSE_DARK_BLUE );
        houseEarRt.setLocation( 1050, 200);
        houseEarRt.setSize( 100, 300 );
        
        Triangle houseTriR = new Triangle( 100, 100, 50, 50, 1); 			//Triangle of Right Ear
        win.add( houseTriR );
        houseTriR.setBackground( HOUSE_DARK_BLUE );
        houseTriR.setLocation( 1110, 200);
        houseTriR.setSize( 80, 300 );
        
        Rectangle houseBase = new Rectangle( 200, 200, 100, 200); 			//Base(middle) of the House
        win.add( houseBase );
        houseBase.setBackground( HOUSE_BLUE );
        houseBase.setLocation( 500, 100);
        houseBase.setSize( 600, 800 );
        
        Oval houseBot = new Oval( 2000, 2000, 50, 50 ); 					//Bottom oval of the Base of the House
        win.add( houseBot );
        houseBot.setBackground( HOUSE_BLUE );
        houseBot.setLocation( 500, 790);
     	houseBot.setSize( 600, 200 );
   	
        Oval houseTop = new Oval( 2000, 2000, 50, 50 ); 					//Top Oval of the Base of the House
        win.add( houseTop );
        houseTop.setBackground( HOUSE_BLUE );
        houseTop.setLocation( 500, 0);
        houseTop.setSize( 600, 200 );
        
        Rectangle houseBrow = new Rectangle( 200, 200, 100, 200); 			//Eyebrow of the House
        win.add( houseBrow );
        houseBrow.setBackground( HOUSE_DARK_BLUE );
        houseBrow.setLocation( 500, 150);
        houseBrow.setSize( 600, 50 );
        
        Rectangle houseNose = new Rectangle( 200, 200, 100, 200); 			//Nose of the House
        win.add( houseNose );
        houseNose.setBackground( HOUSE_DARK_BLUE );
        houseNose.setLocation( 775, 210);
        houseNose.setSize( 50, 400 );
        
        Triangle houseNoseTriL = new Triangle( 100, 100, 50, 50, 1); 		//Triangle of Left Nose
        win.add( houseNoseTriL );
        houseNoseTriL.setBackground( HOUSE_DARK_BLUE );
        houseNoseTriL.setLocation( 755, 210);
        houseNoseTriL.setSize( 40, 400 );
        
        Triangle houseNoseTriR = new Triangle( 100, 100, 50, 50, 1);		 //Triangle of Right Nose
        win.add( houseNoseTriR );
        houseNoseTriR.setBackground( HOUSE_DARK_BLUE );
        houseNoseTriR.setLocation( 805, 210);
        houseNoseTriR.setSize( 40, 400 );
        
        Oval houseWindowL = new Oval( 2000, 2000, 50, 50 ); 				//Left Eye Window
        win.add( houseWindowL );
        houseWindowL.setBackground( HOUSE_DARK_GLASS );
        houseWindowL.setLocation( 515, 205);
        houseWindowL.setSize( 250, 250 );
        
        Oval houseWindowR = new Oval( 2000, 2000, 50, 50 ); 				//Right Eye Window
        win.add( houseWindowR );
        houseWindowR.setBackground( HOUSE_DARK_GLASS );
        houseWindowR.setLocation( 835, 205);
        houseWindowR.setSize( 250, 250 );
        
        Oval houseGlassR = new Oval( 2000, 2000, 50, 50 ); 					//Right Eye Glass
        win.add( houseGlassR );
        houseGlassR.setBackground( HOUSE_GLASS_BLUE );
        houseGlassR.setLocation( 865, 235);
        houseGlassR.setSize( 190, 190 );
        
        Oval houseGlassL = new Oval( 2000, 2000, 50, 50 ); 					//Left Eye Glass
        win.add( houseGlassL );
        houseGlassL.setBackground( HOUSE_GLASS_BLUE );
        houseGlassL.setLocation( 545, 235);
        houseGlassL.setSize( 190, 190 );
        
        Rectangle houseDoor = new Rectangle( 200, 200, 100, 200); 			//Door of the House
        win.add( houseDoor );
        houseDoor.setBackground( HOUSE_DOOR );
        houseDoor.setLocation( 700, 690);
        houseDoor.setSize( 200, 300 );
        
        Oval houseDoorTop = new Oval( 2000, 2000, 50, 50 ); 				//Top of the Door
        win.add( houseDoorTop );
        houseDoorTop.setBackground( HOUSE_DOOR );
        houseDoorTop.setLocation( 700, 675);
        houseDoorTop.setSize( 200, 30 );
        
        Rectangle houseDoorInside = new Rectangle( 200, 200, 100, 200); 	//Inside of the Door
        win.add( houseDoorInside );
        houseDoorInside.setBackground( HOUSE_DOOR_LIGHT );
        houseDoorInside.setLocation( 710, 700);
        houseDoorInside.setSize( 180, 280 );
        
        Oval houseDoorInsideT = new Oval( 2000, 2000, 50, 50 ); 			//Top of the Inside of the Door
        win.add( houseDoorInsideT );
        houseDoorInsideT.setBackground( HOUSE_DOOR_LIGHT );
        houseDoorInsideT.setLocation( 710, 685);
        houseDoorInsideT.setSize( 180, 30 );
        
        Rectangle houseDoorLineL = new Rectangle( 200, 200, 100, 200); 		//Left Line inside of Door
        win.add( houseDoorLineL );
        houseDoorLineL.setBackground( HOUSE_DOOR );
        houseDoorLineL.setLocation( 740, 680);
        houseDoorLineL.setSize( 10, 310 );
        
        Rectangle houseDoorLineC = new Rectangle( 200, 200, 100, 200); 		//Center Line inside of Door
        win.add( houseDoorLineC );
        houseDoorLineC.setBackground( HOUSE_DOOR );
        houseDoorLineC.setLocation( 795, 680);
        houseDoorLineC.setSize( 10, 310 );
        
        Rectangle houseDoorLineR = new Rectangle( 200, 200, 100, 200); 		//Right Line inside of Door
        win.add( houseDoorLineR );
        houseDoorLineR.setBackground( HOUSE_DOOR );
        houseDoorLineR.setLocation( 850, 680);
        houseDoorLineR.setSize( 10, 310 );
        
        Oval doorKnob = new Oval( 2000, 2000, 50, 50 ); 					//Door Knob
        win.add( doorKnob );
        doorKnob.setBackground( DOOR_KNOB );
        doorKnob.setLocation( 865, 825);
        doorKnob.setSize( 15, 15 );
        
    }
}
