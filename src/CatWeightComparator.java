import java.util.Comparator;

public class CatWeightComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat cat1, Cat cat2)
    {
        return Double.compare(cat1.weight, cat2.weight);
    }
}

public class Cat implements Comparable<Cat>
{
    public String name;
    public double weight;

    public Cat(String name, double weight);

    @Override
    public int compareTo(Cat c);

    @Override
    public boolean equals(Object o);
}