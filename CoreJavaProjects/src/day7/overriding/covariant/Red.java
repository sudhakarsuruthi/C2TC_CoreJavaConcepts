package day7.overriding.covariant;

public class Red extends Color {
	@Override
	public Red getColor() {
		Red s = new Red();
		return s;
	}
}
