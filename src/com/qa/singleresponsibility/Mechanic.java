package com.qa.singleresponsibility;

public class Mechanic {


	private boolean serviceDue;

	public void fix(boolean needFixed) {
		this.setServiceDue(needFixed);
	}

	public boolean isServiceDue() {
		return serviceDue;
	}

	public void setServiceDue(boolean serviceDue) {
		this.serviceDue = serviceDue;
	}
}
