package com.brain.lab.abstracts;

abstract public class AbstractDevice {
    private String name;
    private int serialNumber;

    abstract void powerOn();

    abstract void powerOff();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "AbstractDevice{" +
                "name='" + name + '\'' +
                ", serialNumber=" + serialNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractDevice that = (AbstractDevice) o;

        if (serialNumber != that.serialNumber) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + serialNumber;
        return result;
    }
}
