package entity;

public interface IEntity {

	public abstract double getBrutto();

	public abstract void setBrutto(double brutto);

	public abstract double getTara();

	public abstract void setTara(double tara);
	
	public abstract void setRM20(boolean RM20);
	
	public abstract boolean getRM20();
	
	public abstract void setText(String text);
	
	public abstract String getText();
	
	public abstract String getSecDisplay();
	
	public abstract void setSecDisplay(String secDisplay);

}