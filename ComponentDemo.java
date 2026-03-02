import java.awt.*;
class ComponentDemo extends Component
{	
	public static void main(String args[])
	{
		Frame f = new Frame();
		f.setSize(700,600);
		f.setVisible(true);
		f.setLocation(500,400);
		f.setTitle("My frame");	
		f.add( new ComponentDemo());
	}
	public void paint(Graphics g)
	{
		g.drawRect(100,150,200,200);

	}

}
