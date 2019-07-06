package C20GenericMethods.exercicios;

public class Pair<F, S> {
    private F first;
    private S second;

    public Pair(F first, S second){
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public String toString(){
        return String.format("{%s, %s}", getFormat(first), getFormat(second));
    }

    private <T> String getFormat(T o){
        if(o instanceof String)
            return String.format("\"%s\"", o);
        else if(o instanceof Character)
            return String.format("'%s'", o);
        else if(o instanceof Float)
             return String.format("%sf", o);
        else
            return o.toString();
    }
}
