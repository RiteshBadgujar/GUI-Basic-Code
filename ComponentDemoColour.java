import java.awt.*;
class ComponentDemoColour extends Component
{
	public static void main(String args[])
	{
		Frame f = new Frame();
		f.setSize(1000,900);
		f.setVisible(true);
		f.add(new ComponentDemoColour());

	}
	public void paint(Graphics g)
	{	
		g.setColor(Color.RED);
		g.fillRect(100,100,150,200);
		
		g.setColor(Color.YELLOW);
		g.fillOval(100,100,150,200);
		
		g.setColor(Color.BLUE);
		g.drawLine(100,200,250,200);
		


		
	}
}