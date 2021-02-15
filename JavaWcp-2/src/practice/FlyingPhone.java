package practice;

import extend.phone.Phone;

public class FlyingPhone implements Phone, Flying {
	// プログラムを作成
	private int mins;

	public FlyingPhone(int mins) {
		this.mins = mins;
	}

	public void call(String number) {
		System.out.println(number + " に電話します。通話できるのは飛んでいる間だけです。");
	}

	public void fly() {
		System.out.println(mins + " 分間、飛びます。 ");
	}

	public void powerOff() {
		Flying.super.powerOff();
	}
}