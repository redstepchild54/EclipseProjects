package balloonsLab;

public class Balloon {
	
	Size balloonSize;
	boolean helium;
	String imagePath;
	
	public Balloon(Size s, boolean h)
	{
		balloonSize = s;
		helium = h;
		
		imagePath = "/images/balloon";
		
		switch (s)
		{
		case XS: imagePath += "20"; break;
		case S: imagePath += "40"; break;
		case M: imagePath += "60"; break;
		case L: imagePath += "80"; break;
		case XL: imagePath += "100"; break;
		}
		
		imagePath += ".jpg";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((balloonSize == null) ? 0 : balloonSize.hashCode());
		result = prime * result + (helium ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Balloon))
			return false;
		Balloon other = (Balloon) obj;
		if (balloonSize != other.balloonSize)
			return false;
		if (helium != other.helium)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return balloonSize + " " + ((helium) ? "Helium" : "Air");
	}

	public String getImagePath() {
		return imagePath;
	}
}
