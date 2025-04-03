package exam1;

public class HybridCar extends Car {
	int electricGauge;	

	
	public HybridCar(int gasGauge, int electricGauge) {
		super(gasGauge);
		this.electricGauge = electricGauge;
	}
	@Override
	public int showCurrentGauge() {
		System.out.println("잔여 가스" + gasGauge);
		System.out.println("잔여 전기량" + electricGauge);
		return showCurrentGauge();
	}
	
}
