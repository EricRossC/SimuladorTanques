
public class TanqueCurvo extends Tanque {

	public TanqueCurvo(String nombre, double x, double y, double vx, double vy) {
		super(nombre, x, y, vx, vy);
	}

	private long prev = 0;

	public void tick(long now, Mundo mundo) {
		if (prev != 0) {
			double vx0 = vx, vy0 = vy;
			double e = (now - prev) / 1000.0;
			double a = Math.toRadians(45 * e);

			vx = vx0 * Math.cos(a) - vy0 * Math.sin(a);
			vy = vx0 * Math.sin(a) + vy0 * Math.cos(a);
		}
		super.tick(now, mundo);
		prev = now;
	}
}
