package com.graymatter;

import java.util.Arrays;

public class Engine {

	int modelNum;
	int eff;
	
	public Engine() {
		super();
	}

	public Engine(int modelNum, int eff) {
		super();
		this.modelNum = modelNum;
		this.eff = eff;
	}

	
	@Override
	public String toString() {
		return "Engine [modelNum=" + modelNum + ", Efficiency=" + eff + "]";
	}
	
	
	
	
	
}
