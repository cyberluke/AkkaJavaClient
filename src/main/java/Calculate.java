import scala.concurrent.duration.Duration;

class Calculate {
}

class Work {
    private final int start;
    private final int nrOfElements;

    public Work(int start, int nrOfElements) {
        this.start = start;
        this.nrOfElements = nrOfElements;
    }

    public int getStart() {
        return start;
    }

    public int getNrOfElements() {
        return nrOfElements;
    }
}

class Result {
    private final double value;

    public Result(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}

class PiApproximation {
    private final double pi;
    private final Duration duration;

    public PiApproximation(double pi, Duration duration) {
        this.pi = pi;
        this.duration = duration;
    }

    public double getPi() {
        return pi;
    }

    public Duration getDuration() {
        return duration;
    }
}

