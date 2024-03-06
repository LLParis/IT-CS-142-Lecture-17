class Triangle {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return .5 * this.base * this.height;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Triangle triangle = new Triangle(3, 5);
        return Double.compare(triangle.base, base) == 0 && Double.compare(triangle.height, height) == 0;
    }
}