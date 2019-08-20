package com.feeyo.redis.config;

public class NetFlowCfg {

	private final String password;
	private final int perSecondMaxSize;
	private final int requestMaxSize;
	private boolean isControl;
	private final  int perSecondMaxCount;

	public NetFlowCfg(String password, int perSecondMaxSize, int requestMaxSize, boolean isControl) {
		this.password = password;
		this.perSecondMaxSize = perSecondMaxSize;
		this.requestMaxSize = requestMaxSize;
		this.isControl = isControl;
        this.perSecondMaxCount = 0;
	}

    public NetFlowCfg(String password, int perSecondMaxSize, int requestMaxSize, boolean isControl, int perSecondMaxCount) {
        this.password = password;
        this.perSecondMaxSize = perSecondMaxSize;
        this.requestMaxSize = requestMaxSize;
        this.isControl = isControl;
        this.perSecondMaxCount = perSecondMaxCount;
    }

    public String getPassword() {
		return password;
	}

	public int getPerSecondMaxSize() {
		return perSecondMaxSize;
	}

	public int getRequestMaxSize() {
		return requestMaxSize;
	}

	public boolean isControl() {
		return isControl;
	}


    public int getPerSecondMaxCount() {
        return perSecondMaxCount;
    }
}
