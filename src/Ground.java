//Name -

import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Ground 
{
	private ArrayList<Image> tiles;
	
	public Ground() throws IOException
	{
		//point the tiles at new array list
		tiles = new ArrayList<>();
		//add in each of the images for the grass.gif, gtoroad.gif, road.gif, rtograss.gif
		Image grass = ImageIO.read(new File("grass.gif"));
		tiles.add(grass);
		Image grassroad = ImageIO.read(new File( "gtoroad.gif"));
		tiles.add(grassroad);
		Image road = ImageIO.read(new File( "road.gif"));
		tiles.add(road);
		Image roadgrass = ImageIO.read(new File( "rtograss.gif"));
		tiles.add(roadgrass);
		
		//tiles.add( ImageIO.read(new File("grass.gif")) );
	
	}
	
	public void drawGround(Graphics2D g)
	{
		//draw the ground on the screen
		for(int x = 0; x<=800; x+=50){
			for(int y = 0; y<=500; y+=50){
				g.drawImage(tiles.get((y>=50 ? 0 : (y<=50 ? 0 : (y==100 ? 1 : (y==400 ? 3 : 2)))),x,y,null));
			}
		}
	}	
}