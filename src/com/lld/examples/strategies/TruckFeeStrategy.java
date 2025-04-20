package com.lld.examples.strategies;

public class TruckFeeStrategy implements FeeStrategy{

	@Override
	public int calculateParkingFee(long totalTime) {
		int hours = Math.max(1, (int)Math.ceil(totalTime/(1000*60*60)));
		return 30*hours;
	}
}
