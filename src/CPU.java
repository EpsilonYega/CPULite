public class CPU {
    int cores;
    int threads;
    double basisCoreClock;
    int l1CacheSize;
    int l2CacheSize;
    int l3CacheSize;
    double avxVersion;
    double tdp;
    public CPU(int cores, int threads, double basisCoreClock, int l1CacheSize, int l2CacheSize, int l3CacheSize, double avxVersion, double tdp){
        this.cores = cores;
        this.threads = threads;
        this.basisCoreClock = basisCoreClock;
        this.l1CacheSize = l1CacheSize;
        this.l2CacheSize = l2CacheSize;
        this.l3CacheSize = l3CacheSize;
        this.avxVersion = avxVersion;
        this.tdp = tdp;
    }
    public int getCores() {
        return cores;
    }

    public int getThreads() {
        return threads;
    }

    public double getBasisCoreClock() {
        return basisCoreClock;
    }

    public void overclock(double basisCoreClock) {
        this.basisCoreClock = basisCoreClock;
    }

    public int getL1CacheSize() {
        return l1CacheSize;
    }

    public int getL2CacheSize() {
        return l2CacheSize;
    }

    public int getL3CacheSize() {
        return l3CacheSize;
    }

    public double getAvxVersion() {
        return avxVersion;
    }

    public double getTdp() {
        return tdp;
    }
}
