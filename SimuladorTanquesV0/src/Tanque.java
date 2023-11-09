
public class Tanque {

	private String nombre;
	private double x;
	private double y;
	protected double vx;
	protected double vy;

	public String getNombre() {
		return nombre;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getVx() {
		return vx;
	}

	public double getVy() {
		return vy;
	}

	public Tanque(String nombre, double x, double y, double vx, double vy) {
		this.nombre = nombre;
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
	}

	private long previo = 0;
	
	public void tick(long now, Mundo mundo) {	
		if (previo != 0) {
			double dt = (now - previo) / 1000.0;
			x += vx * dt;
			y += vy * dt;
			
			if (x < 0 && vx < 0) vx = -vx;
			else if (y < 0 && vy < 0) vy = -vy;
			else if (x >= mundo.getAncho() && vx > 0) vx = -vx;
			else if (y >= mundo.getAlto() && vy > 0) vy = -vy;
		}
		previo = now;
	}
}





