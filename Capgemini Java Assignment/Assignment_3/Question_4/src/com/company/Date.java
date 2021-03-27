package com.company;


import java.util.Comparator;

class InvalidDOBException extends Exception {
    InvalidDOBException(String s) {
        super(s);
    }
}


public class Date implements Comparable<Date>{
        private int days;
        private int months;
        private int years;


        public Date(int days, int months, int years) {
            this.days = days;
            this.months = months;
            this.years = years;
        }

        public int getDays() {
            return days;
        }

        public void setDays(int days) {
            this.days = days;
        }

        public int getMonths() {
            return months;
        }

        public void setMonths(int months) {
            this.months = months;
        }

        public int getYears() {
            return years;
        }

        public void setYears(int years) {
            this.years = years;
        }


    @Override
    public int compareTo(Date o1) {
        if (this.getDays() > o1.getDays())
            return 1;
        else if (this.getDays() < o1.getDays())
            return -1;
        else {
            if (this.getMonths() > o1.getMonths())
                return 1;
            else if (this.getMonths() < o1.getMonths())
                return -1;
            else {
                if (this.getYears() > o1.getYears())
                    return 1;
                else if (this.getYears() < o1.getYears())
                    return -1;
                else {
                    return 0;
                }
            }
        }
    }

    public int GetDOB(Date o) throws InvalidDOBException {
            if (this.getDays() > o.getDays())
                return 1;
            else if (this.getDays() < o.getDays())
                return -1;
            else {
                if (this.getMonths() > o.getMonths())
                    return 1;
                else if (this.getMonths() < o.getMonths())
                    return -1;
                else {
                    if (this.getYears() != o.getYears())
                        throw new InvalidDOBException("Invalid Date of Birth");
                    else {
                        return 0;
                    }
                }
            }
        }

    @Override
    public String toString() {
        return "Date{" +
                "days=" + days +
                ", months=" + months +
                ", years=" + years +
                '}';
    }
}
